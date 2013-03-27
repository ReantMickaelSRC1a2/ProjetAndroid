package com.example.projetandroid;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class arraylist_test {

	public static void main(String[] args) throws IOException{
		
		//Lecture du fichier 1
			//Url fichier1 = new Url("D:/basic.ics");

		//Lecture du Fichier 2
			//Url fichier2 = new Url("D:/basic2.ics");
			
			//System.out.println(Url.urlRead());

		//Création du HashSet1
		/*	HashSet monHashSet = (HashSet)Objet.CreationHashet(fichier1);
			
		//System.out.println(monHashSet);
		//System.out.println("Taille du set : " + monHashSet.size()) ;

		//Création du HashSet2
			HashSet monHashSet2 = (HashSet)Objet.CreationHashet(fichier2);
	
		//System.out.println(monHashSet2);
		//System.out.println("Taille du set : " + monHashSet2.size()) ;
				
				
		//Création des HashMap finaux
			HashMap CoursAjoute = (HashMap) Traitement.MapCours(Traitement.SetajoutCours(monHashSet, monHashSet2));
			HashMap CoursAnnule = (HashMap) Traitement.MapCours(Traitement.SetannulationCours(monHashSet, monHashSet2));
			HashMap CoursAjouteModif = (HashMap)CoursAjoute.clone();
			HashMap CoursAnnuleModif = (HashMap)CoursAnnule.clone();
			HashMap CoursDeplace = new HashMap();
				
			Iterator k = CoursAjoute.keySet().iterator();
			
			    while (k.hasNext()) {
			      String key = (String) k.next();
			      	if(CoursAnnule.get(key) != null){
			      		CoursDeplace.put(key, CoursAnnule.get(key));
			      		CoursAnnuleModif.remove(key);
			      		CoursAjouteModif.remove(key);
			      	}
			    }
			    
		//Prints
		//System.out.println(CoursDeplace);
		System.out.println(Traitement.AffichageHashMapDeplace(CoursDeplace, CoursAjoute, CoursAnnule));
		//System.out.println(CoursAjouteModif);
		System.out.println(Traitement.AffichageHashMapAjout(CoursAjouteModif));
		//System.out.println(CoursAnnuleModif);
		System.out.println(Traitement.AffichageHashMapAnnule(CoursAnnuleModif));
		
		
		System.out.println(monHashSet.equals(monHashSet2));	
		System.out.println(Objet.nouvelleSemainse(fichier2));*/
		
	}
}
	