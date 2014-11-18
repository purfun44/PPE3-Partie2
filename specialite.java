package classe;

import java.util.ArrayList;

public class specialite {
	private int identifiant;
	private String libelle;
	public static ArrayList<specialite> toutesLesSpecialites=new ArrayList<specialite>();
	
	public specialite(int identifiant,String libelle){
		this.identifiant=identifiant;
		this.libelle=libelle;
		toutesLesSpecialites.add(this);
	}
	
	public int getIdentifiant(){
		return identifiant;
	}
	
	public String getLibelle(){
		return libelle;
	}
	
}
