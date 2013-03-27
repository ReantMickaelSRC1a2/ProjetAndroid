package com.example.projetandroid;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Url {

	

	// lecture du fichier
	public static String lire(String fichier) throws IOException {
		String fichier1 = "";
		InputStream doc1 = new FileInputStream(fichier);
		InputStreamReader ipsr = new InputStreamReader(doc1);
		BufferedReader br = new BufferedReader(ipsr);
		String ligne;
		while ((ligne = br.readLine()) != null) {
			fichier1 = fichier1 + ligne + "\n";
		}
		return fichier1;
	}

	public static String urlRead() throws IOException {
		String fichier1 = null;

		URL url2 = new URL("109.234.160.17/edt/ical/SRC/Web1/basic.ics");
		URLConnection uc = url2.openConnection();

		InputStreamReader input = new InputStreamReader(uc.getInputStream());
		BufferedReader in = new BufferedReader(input);
		String ligne;

		while ((ligne = in.readLine()) != null) {
			fichier1 = fichier1 + ligne + "\n";
		}
		return fichier1;
	}

}
