package model;

import java.util.ArrayList;
import controleur.AccesBD;

public class specialite {
	private int identifiant;
	private String libelle;
	public static ArrayList<specialite> toutesLesSpecialites=new ArrayList<specialite>();
	
	public specialite(String libelle){
		this.libelle=libelle;
		
		try {
			String [][] tableau = AccesBD.ajoutSpecialite(libelle);
			for (int i = 0; i < tableau.length; i++) {
				String identifiant = tableau[0][0];
				this.identifiant = Integer.parseInt(identifiant);
				}
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		toutesLesSpecialites.add(this);
		}
	
	public int getIdentifiant(){
		return identifiant;
		}
	
	public String getLibelle(){
		return libelle;
		}
}
