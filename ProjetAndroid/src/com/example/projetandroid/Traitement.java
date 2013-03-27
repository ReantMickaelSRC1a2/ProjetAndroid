package com.example.projetandroid;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Traitement {
	
	public static Map MapCours (Set avant){
		HashMap hMap = new HashMap();
		Iterator itlistCoursAnnule = avant.iterator();
		   while(itlistCoursAnnule.hasNext()) {
			Objet next = (Objet)itlistCoursAnnule.next();
			hMap.put(next.getId(), next);}
		return hMap;
	}
	
	
	public static Set SetannulationCours(Set avant,Set  apres){
		HashSet listCoursAnnule = new HashSet();
		listCoursAnnule = (HashSet) ((HashSet) avant).clone();
		listCoursAnnule.removeAll(apres);
		
		return listCoursAnnule;
	}

	
	public static HashSet SetajoutCours(Set avant, Set apres){
		String annonce="";
		HashSet listCoursAjoute = new HashSet();
		listCoursAjoute = (HashSet) ((HashSet) apres).clone();
		listCoursAjoute.removeAll(avant);
		return listCoursAjoute;
	}
	
	public static String AffichageHashMapAjout(Map hMap){
		String annonce="";
		 Iterator k = hMap.keySet().iterator();
		    while (k.hasNext()) {
		      String key = (String) k.next();
		     annonce =annonce + "Le cours de " + ((Objet) hMap.get(key)).getResume() + " du " + ((Objet) hMap.get(key)).getDebutJour() + "/" + ((Objet) hMap.get(key)).getDebutMois() + " à " + ((Objet) hMap.get(key)).getDebutHeure() + ":" + ((Objet) hMap.get(key)).getDebutMinute() + " a été ajouté" + "\n";
		    }
		
		return annonce;
	}
	
	public static String AffichageHashMapAnnule(Map hMap){
		String annonce="";
		 Iterator k = hMap.keySet().iterator();
		    while (k.hasNext()) {
		      String key = (String) k.next();
		     annonce =annonce + "Le cours de " + ((Objet) hMap.get(key)).getResume() + " du " + ((Objet) hMap.get(key)).getDebutJour() + "/" + ((Objet) hMap.get(key)).getDebutMois() + " à " + ((Objet) hMap.get(key)).getDebutHeure() + ":" + ((Objet) hMap.get(key)).getDebutMinute() + " a été Annulé" + "\n";
		    }
		
		return annonce;
	}
	
	public static String AffichageHashMapDeplace(Map hMap,Map hMapAvant, Map hMapApres){
		String annonce="";
		 Iterator k = hMap.keySet().iterator();
		    while (k.hasNext()) {
		      String key = (String) k.next();
		     annonce =annonce + "Le cours de " + ((Objet) hMap.get(key)).getResume() + " a été déplacé du " + ((Objet) hMapAvant.get(key)).getDebutJour() + "/" + ((Objet) hMapAvant.get(key)).getDebutMois() + " à " + ((Objet) hMapAvant.get(key)).getDebutHeure() + ":" + ((Objet) hMapAvant.get(key)).getDebutMinute() + " au " + ((Objet) hMapApres.get(key)).getDebutJour() + "/" + ((Objet) hMapApres.get(key)).getDebutMois() + " à " + ((Objet) hMapApres.get(key)).getDebutHeure() + ":" + ((Objet) hMapApres.get(key)).getDebutMinute()+ "\n";
		    }
	
		return annonce;
	}
	
}
