package com.example.projetandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class ProfilActivity extends Activity{
	
	
	private static final String[] DEPARTEMENT_ITEMS={"-choisir un département-","SRC", "GEA", "INFO", "TC"};
	 
    private static final String[] GROUPESRC_ITEMS = {"-choisir un groupe-","SRC1", "SRC2", "SRC3",	"SRC4"};
 
    private static final String[] GROUPEGEA_ITEMS = {"-choisir un groupe-","GEA1", "GEA2", "GEA3",	"GEA4"};
    
    private static final String[] GROUPEINFO_ITEMS = {"-choisir un groupe-","INFO1", "INFO2", "INFO3",	"INFO4"};
    
    private static final String[] GROUPETC_ITEMS = {"-choisir un groupe-","TC1", "TC2", "TC3",	"TC4"};
   
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        
        final Button edtButtom = (Button) findViewById(R.id.goEdt);
        edtButtom.setOnClickListener(new OnClickListener(){
        	
        	public void onClick(View v){
        		Intent intent = new Intent(ProfilActivity.this, EdtActivity.class);
        		startActivity(intent);
        	}
        });
        	
        Spinner spinner1 =(Spinner)findViewById(R.id.spinner1);
        	 
       // on les remplit
       ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,DEPARTEMENT_ITEMS);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner1.setAdapter(adapter);
      
        	
}
}
