package model;

import java.util.ArrayList;
import controleur.AccesBD;

public class medecin {
	private int identifiant;
	private String nom;
	private String prenom;
	private String adresse;
	private String commune;
	private String codePostal;
	private String telephone;
	private String dateInstall;
	private int idSpecialite;
	public static ArrayList<medecin> tousLesMedecins=new ArrayList<medecin>();
	
	public medecin(String nom,String prenom,String adresse,String commune,String codePostal,String telephone,String dateInstall,int idSpecialite){
		this.nom=nom;
		this.prenom=prenom;
		this.adresse=adresse;
		this.commune=commune;
		this.codePostal=codePostal;
		this.telephone=telephone;
		this.dateInstall=dateInstall;
		this.idSpecialite=idSpecialite;
		
		try {
			String [][] tableau = AccesBD.ajoutMedecin(nom, prenom, adresse, commune, codePostal, telephone, dateInstall, idSpecialite);
			for (int i = 0; i < tableau.length; i++) {
				String identifiant = tableau[0][0];
				this.identifiant = Integer.parseInt(identifiant);
				}
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
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
	
	public String getCodePostal(){
		return codePostal;
	}
	
	public String getTelephone(){
		return telephone;
	}
	
	public String getDateInstall(){
		return dateInstall;
	}
	
	public int getIdSpecialite(){
		return idSpecialite;
	}
}
