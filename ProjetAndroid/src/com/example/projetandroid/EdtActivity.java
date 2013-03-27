package com.example.projetandroid;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;



public class EdtActivity extends Activity {

	private ArrayList<Jour> liste;

	private ArrayAdapter<Jour> arrayAdapter;

	private static final String DEBUG_TAG = "HttpExample";
	private TextView textView;
	private String urlEdt="http://gestionedt.emploisdutempssrc.net/edt/ical/SRC/Web1/basic.ics";
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listcours);
		textView = (TextView)findViewById(R.id.textView);
		

		

		/*		liste_cours.setAdapter(new ArrayAdapter(this,R.layout.listcours,
				R.id.cours_nom,
				liste));
		 */		

		final Button profilButtom = (Button) findViewById(R.id.goProfil);
		profilButtom.setOnClickListener(new OnClickListener(){

			public void onClick(View v){
				Intent intent = new Intent(EdtActivity.this, ProfilActivity.class);
				startActivity(intent);
			}

		});
		
		myClickHandler();
		
		
		

		
	}
	
	
	
	
	
	

		public void myClickHandler() {
			// Gets the URL from the UI's text field.
			//String stringUrl = urlText.getText().toString();
			ConnectivityManager connMgr = (ConnectivityManager) 
					getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
			if (networkInfo != null && networkInfo.isConnected()) {
				new DownloadWebpageText().execute(urlEdt);
			} else {
				textView.setText("No network connection available.");
			}
		}

		
		
		private class DownloadWebpageText extends AsyncTask<String, Integer,String> {

			@Override
			protected String doInBackground(String... urls) {

				// params comes from the execute() call: params[0] is the url.
				try {
					return downloadUrl(urls[0]);
				} catch (IOException e) {
					e.printStackTrace();
					return "Unable to retrieve web page. URL may be invalid.";
				}
			}
			// onPostExecute displays the results of the AsyncTask.
			
			@Override
			protected void onPostExecute(String result) {
				HashSet monHashSet;
				try {
					monHashSet = (HashSet)Objet.CreationHashet(result);
					ArrayList liste = (ArrayList) Jour.coursJour(result);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
				liste = new ArrayList();
				//  liste.add(new Cours("Cours","Prof","Horaire"));
				// liste.add(new Cours("Anglais","Lefebvre","10h-12h"));
				//liste.add(new Jour("1","8","30","10","20","Anglais"));
				ListView liste_cours;

				
				liste_cours = (ListView)findViewById(R.id.liste_cours);
				arrayAdapter = new ArrayAdapter<Jour>(
						getBaseContext(),
						R.layout.listcours,
						R.id.cours_nom,
						liste){
					@Override
					public View getView(int position, View convertView,
							ViewGroup parent) {
						if (convertView == null) 
							convertView = getLayoutInflater().inflate(R.layout.listcours,parent,false);
						((TextView)convertView.findViewById(R.id.cours_nom)).setText(
								liste.get(position).resume);
						((TextView)convertView.findViewById(R.id.debut_heure)).setText(
								liste.get(position).debutHeure);
						((TextView)convertView.findViewById(R.id.debut_minute)).setText(
								liste.get(position).debutMinute);
						((TextView)convertView.findViewById(R.id.fin_heure)).setText(
								liste.get(position).finHeure);
						((TextView)convertView.findViewById(R.id.fin_minute)).setText(
								liste.get(position).finMinute);

						return convertView;

					}

				};
				liste_cours.setAdapter(arrayAdapter);
				
				
				//Log.d("Download", result);
				textView.setText("dl");
				
			}

		}

		private String downloadUrl(String myurl) throws IOException {
			InputStream is = null;
			// Only display the first 500 characters of the retrieved
			// web page content.
			int len = 40000;

			try {
				URL url = new URL(myurl);
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setReadTimeout(10000 /* milliseconds */);
				conn.setConnectTimeout(15000 /* milliseconds */);
				conn.setRequestMethod("GET");
				conn.setDoInput(true);
				// Starts the query
				conn.connect();
				int response = conn.getResponseCode();
				Log.d(DEBUG_TAG, "The response is: " + response);
				is = conn.getInputStream();

				// Convert the InputStream into a string
				String contentAsString = readIt(is, len);
				return contentAsString;

				// Makes sure that the InputStream is closed after the app is
				// finished using it.


			} finally {
				if (is != null) {
					is.close();
				} 
			}
		}

		// Reads an InputStream and converts it to a String.
		public String readIt(InputStream stream, int len) throws IOException, UnsupportedEncodingException {
			Reader reader = null;
			reader = new InputStreamReader(stream, "UTF-8");       
			char[] buffer = new char[len];
			reader.read(buffer);
			return new String(buffer);
		}
		
		
		
		
}
