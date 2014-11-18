package classe;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class medecin {
	private int identifiant;
	private String nom;
	private String prenom;
	private String adresse;
	private String commune;
	private int codePostal;
	private int telephone;
	private GregorianCalendar dateInstall;
	public static ArrayList<medecin> tousLesMedecins=new ArrayList<medecin>();
	
	public medecin(int identifiant,String nom,String prenom,String adresse,String commune,int codePostal,int telephone,GregorianCalendar dateInstall){
		this.identifiant=identifiant;
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.commune=commune;
		this.codePostal=codePostal;
		this.telephone=telephone;
		this.dateInstall=dateInstall;
		tousLesMedecins.add(this);
	}
	
	public int getIdentifiant(){
		return identifiant;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public String getAdresse(){
		return adresse;
	}
	
	public String getCommune(){
		return commune;
	}
	
	public int getCodePostal(){
		return codePostal;
	}
	
	public int getTelephone(){
		return telephone;
	}
	
	public GregorianCalendar getDateInstall(){
		return dateInstall;
	}
	
}
