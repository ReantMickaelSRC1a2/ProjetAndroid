package com.example.projetandroid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jour {

	public Jour(String id, String debutHeure, String debutMinute,
			String finHeure, String finMinute, String resume) {
		super();
		this.id = id;
		this.debutHeure = debutHeure;
		this.debutMinute = debutMinute;
		this.finHeure = finHeure;
		this.finMinute = finMinute;
		this.resume = resume;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDebutHeure() {
		return debutHeure;
	}

	public void setDebutHeure(String debutHeure) {
		this.debutHeure = debutHeure;
	}

	public String getDebutMinute() {
		return debutMinute;
	}

	public void setDebutMinute(String debutMinute) {
		this.debutMinute = debutMinute;
	}

	public String getFinHeure() {
		return finHeure;
	}

	public void setFinHeure(String finHeure) {
		this.finHeure = finHeure;
	}

	public String getFinMinute() {
		return finMinute;
	}

	public void setFinMinute(String finMinute) {
		this.finMinute = finMinute;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public String id;
	public String debutHeure;
	public String debutMinute;
	public String finHeure;
	public String finMinute;
	public String resume;

	public static ArrayList coursJour(String fichier) throws IOException{
		ArrayList<Jour> ls = new ArrayList<Jour>();	
		
		Date date1 = new Date();
		int D1 = date1.getDay();
		Calendar ca1 = Calendar.getInstance();
		
		//Fabrication du match
		Pattern p = Pattern.compile("(BEGIN:VEVENT)\\n(UID:)(.*?)(-)(.*?)@(.*?)\\n(DTSTART;TZID=Europe/Paris:)(....)(..)(..)T(..)(..)(.*?)\\n(DTEND;TZID=Europe/Paris:)(....)(..)(..)T(..)(..)(.*?)\\n(SUMMARY:)(.*?)\\n(END:VEVENT\\n)");
		//creation du set1
		Matcher m = p.matcher(Url.lire(fichier));
			//cr�ation des objets du set1
			while(m.find()){
				Jour eventdur = new Jour(m.group(5),m.group(11), m.group(12), m.group(18), m.group(19), m.group(22));
				int intAnnee = Integer.parseInt(m.group(8));
				int intJour = Integer.parseInt(m.group(10));
				int intMonth = Integer.parseInt(m.group(9))-1;
				ca1.set(intAnnee, intMonth, intJour);
				int iDay=ca1.get(Calendar.DAY_OF_WEEK);
				if(DatS.NumSemaineDurcpt(m.group(8),m.group(9),m.group(10))== DatS.NumSemaineActuelle()){
					if(D1==iDay-1){
						ls.add(eventdur);
					}
				}
			}
		return ls;
	}
}
	
