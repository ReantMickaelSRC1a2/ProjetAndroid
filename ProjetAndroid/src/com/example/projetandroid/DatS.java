package com.example.projetandroid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DatS {
	
	//calculer le numéro de la semaine actuelle
	public static int NumSemaineActuelle(){
		int NumSemaine = 0;
		Date actuelle = new Date();
		DateFormat stringdateFull = new SimpleDateFormat ("yyyy,MM,dd");
		int intAnnee = actuelle.getYear() +1900;
		int intMois = actuelle.getMonth();
		int intJours = actuelle.getDate();
		
		int [] ListeMois = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if (intAnnee %4 == 0 && intAnnee %100 !=0 || intAnnee %400 == 0) {ListeMois[1]=29;}
		
		int TotalJour=0;
		int cpt;
		for(cpt=0; cpt<intMois; cpt++){TotalJour+=ListeMois[cpt];}
		TotalJour+=intJours;

		Date DebutAn = new Date(intAnnee,0,1);
		int JourDebutAn;
		JourDebutAn=DebutAn.getDay();
		if(JourDebutAn==0){JourDebutAn=7;}
		
		TotalJour-=8-JourDebutAn;
		NumSemaine = 1;
		
		NumSemaine+=Math.floor(TotalJour/7);
		if(TotalJour%7!=0){NumSemaine+=1;}
		
		
		return NumSemaine;
	}
	
	//calculer le numero de la semaine par rapport a une date prédéfinie
	public static int CptNumSem(int dateannee,int datemois,int datejour){
		int NumSemaine = 0;
		int intAnnee = dateannee;
		int intMois = datemois;
		int intJours = datejour;
		
		int [] ListeMois = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if (intAnnee %4 == 0 && intAnnee %100 !=0 || intAnnee %400 == 0) {ListeMois[1]=29;}
		
		int TotalJour=0;
		int cpt;
		for(cpt=1; cpt<intMois; cpt++){TotalJour+=ListeMois[cpt];}
		TotalJour+=intJours;

		Date DebutAn = new Date(intAnnee,0,1);
		int JourDebutAn;
		JourDebutAn=DebutAn.getDay();
		if(JourDebutAn==0){JourDebutAn=7;}
		
		TotalJour-=8-JourDebutAn;
		NumSemaine = 1;
		
		NumSemaine+=Math.floor(TotalJour/7);
		if(TotalJour%7!=0){NumSemaine+=1;}
		
		return NumSemaine;
	}
	
	
	//recupération du jour de la semaine
	public static String JourSemaine(){
		String jour = "";
		String[] jours = {"Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi"};
		Date aujourdhui = new Date();
		jour = jours[aujourdhui.getDay()];
		return jour;
	}
	
	//recupération de la date de l'objet
	public static int NumSemaineDurcpt(String annee, String mois, String jour){
		int semaine;
		int intAnnee = Integer.parseInt(annee);
		int intJour = Integer.parseInt(jour);
		int intMonth = Integer.parseInt(mois);
		
		return semaine = CptNumSem(intAnnee,intMonth,intJour);
		
	}
}
	
	
	
	

