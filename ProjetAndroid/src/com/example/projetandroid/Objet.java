package com.example.projetandroid;
import java.io.IOException;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Objet{
	public Objet(String id, String debutAnnee, String debutMois,
			String debutJour, String debutHeure, String debutMinute,
			String finAnnee, String finMois, String finJour, String finMinute,
			String finSeconde, String resume) {
		super();
		this.id = id;
		this.debutAnnee = debutAnnee;
		this.debutMois = debutMois;
		this.debutJour = debutJour;
		this.debutHeure = debutHeure;
		this.debutMinute = debutMinute;
		this.finAnnee = finAnnee;
		this.finMois = finMois;
		this.finJour = finJour;
		this.finMinute = finMinute;
		this.finSeconde = finSeconde;
		this.resume = resume;
	}
	public String id ;
	public String debutAnnee;
	public String debutMois;
	public String debutJour;
	public String debutHeure;
	public String debutMinute;
	public String finAnnee;
	public String finMois;
	public String finJour;
	public String finMinute;
	public String finSeconde;
	public String resume;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((debutAnnee == null) ? 0 : debutAnnee.hashCode());
		result = prime * result
				+ ((debutHeure == null) ? 0 : debutHeure.hashCode());
		result = prime * result
				+ ((debutJour == null) ? 0 : debutJour.hashCode());
		result = prime * result
				+ ((debutMinute == null) ? 0 : debutMinute.hashCode());
		result = prime * result
				+ ((debutMois == null) ? 0 : debutMois.hashCode());
		result = prime * result
				+ ((finAnnee == null) ? 0 : finAnnee.hashCode());
		result = prime * result + ((finJour == null) ? 0 : finJour.hashCode());
		result = prime * result
				+ ((finMinute == null) ? 0 : finMinute.hashCode());
		result = prime * result + ((finMois == null) ? 0 : finMois.hashCode());
		result = prime * result
				+ ((finSeconde == null) ? 0 : finSeconde.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((resume == null) ? 0 : resume.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Objet other = (Objet) obj;
		if (debutAnnee == null) {
			if (other.debutAnnee != null)
				return false;
		} else if (!debutAnnee.equals(other.debutAnnee))
			return false;
		if (debutHeure == null) {
			if (other.debutHeure != null)
				return false;
		} else if (!debutHeure.equals(other.debutHeure))
			return false;
		if (debutJour == null) {
			if (other.debutJour != null)
				return false;
		} else if (!debutJour.equals(other.debutJour))
			return false;
		if (debutMinute == null) {
			if (other.debutMinute != null)
				return false;
		} else if (!debutMinute.equals(other.debutMinute))
			return false;
		if (debutMois == null) {
			if (other.debutMois != null)
				return false;
		} else if (!debutMois.equals(other.debutMois))
			return false;
		if (finAnnee == null) {
			if (other.finAnnee != null)
				return false;
		} else if (!finAnnee.equals(other.finAnnee))
			return false;
		if (finJour == null) {
			if (other.finJour != null)
				return false;
		} else if (!finJour.equals(other.finJour))
			return false;
		if (finMinute == null) {
			if (other.finMinute != null)
				return false;
		} else if (!finMinute.equals(other.finMinute))
			return false;
		if (finMois == null) {
			if (other.finMois != null)
				return false;
		} else if (!finMois.equals(other.finMois))
			return false;
		if (finSeconde == null) {
			if (other.finSeconde != null)
				return false;
		} else if (!finSeconde.equals(other.finSeconde))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (resume == null) {
			if (other.resume != null)
				return false;
		} else if (!resume.equals(other.resume))
			return false;
		return true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDebutAnnee() {
		return debutAnnee;
	}
	public void setDebutAnnee(String debutAnnee) {
		this.debutAnnee = debutAnnee;
	}
	public String getDebutMois() {
		return debutMois;
	}
	public void setDebutMois(String debutMois) {
		this.debutMois = debutMois;
	}
	public String getDebutJour() {
		return debutJour;
	}
	public void setDebutJour(String debutJour) {
		this.debutJour = debutJour;
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
	public String getFinAnnee() {
		return finAnnee;
	}
	public void setFinAnnee(String finAnnee) {
		this.finAnnee = finAnnee;
	}
	public String getFinMois() {
		return finMois;
	}
	public void setFinMois(String finMois) {
		this.finMois = finMois;
	}
	public String getFinJour() {
		return finJour;
	}
	public void setFinJour(String finJour) {
		this.finJour = finJour;
	}
	public String getFinMinute() {
		return finMinute;
	}
	public void setFinMinute(String finMinute) {
		this.finMinute = finMinute;
	}
	public String getFinSeconde() {
		return finSeconde;
	}
	public void setFinSeconde(String finSeconde) {
		this.finSeconde = finSeconde;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public static Set CreationHashet(String fichier1) throws IOException{
		HashSet Hset = new HashSet();
				//Fabrication du match
				Pattern p = Pattern.compile("(BEGIN:VEVENT)\\n(UID:)(.*?)(-)(.*?)@(.*?)\\n(DTSTART;TZID=Europe/Paris:)(....)(..)(..)T(..)(..)(.*?)\\n(DTEND;TZID=Europe/Paris:)(....)(..)(..)T(..)(..)(.*?)\\n(SUMMARY:)(.*?)\\n(END:VEVENT\\n)");
				//creation du set1
				Matcher m = p.matcher(Url.lire(fichier1));
					//cr�ation des objets du set1
					while(m.find()){
						Objet eventDur = new Objet(m.group(5), m.group(8), m.group(9), m.group(10), m.group(11), m.group(12), m.group(15), m.group(16), m.group(17), m.group(18), m.group(19), m.group(22));
						if(DatS.NumSemaineDurcpt(eventDur.getDebutAnnee(),eventDur.getDebutMois(),eventDur.getDebutJour())== DatS.NumSemaineActuelle()){
						Hset.add(eventDur);		    
						}
					}	
		return Hset;
	}
	
	public static String nouvelleSemainse(String fichier) throws IOException{
		String annonce="";
		HashSet Hset = new HashSet();
		//Fabrication du match
		Pattern p = Pattern.compile("(BEGIN:VEVENT)\\n(UID:)(.*?)(-)(.*?)@(.*?)\\n(DTSTART;TZID=Europe/Paris:)(....)(..)(..)T(..)(..)(.*?)\\n(DTEND;TZID=Europe/Paris:)(....)(..)(..)T(..)(..)(.*?)\\n(SUMMARY:)(.*?)\\n(END:VEVENT\\n)");
		//creation du set1
		Matcher m = p.matcher(Url.lire(fichier));
			//cr�ation des objets du set1
			while(m.find()){
				Objet eventDur = new Objet(m.group(5), m.group(8), m.group(9), m.group(10), m.group(11), m.group(12), m.group(15), m.group(16), m.group(17), m.group(18), m.group(19), m.group(22));
				if(DatS.NumSemaineDurcpt(eventDur.getDebutAnnee(),eventDur.getDebutMois(),eventDur.getDebutJour())==(DatS.NumSemaineActuelle()+1)){
				Hset.add(eventDur);		    
				}
			}	
			if (Hset.size() != 0){
				annonce ="Une nouvelle semaine est disponible";
			}
			return annonce;
	}
	
	
	
}