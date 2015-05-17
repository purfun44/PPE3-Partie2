package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesBD {
	private static Statement connection()
		{
		String host="192.168.222.72";
		String base="BDMED";
		String user="pasquier";
		String passwd="pasquier";
		Connection conn=null;
		Statement stmt=null;
		try{
			String connectionString="jdbc:sqlserver://"+host+";";
			connectionString += "database="+base+";";
			connectionString += "user="+user+";";
			connectionString += "password="+passwd;
			conn = DriverManager.getConnection(connectionString);
			stmt = conn.createStatement();
			}
		catch (Exception e) {System.out.println(e.getMessage());}
		return stmt;
		}
	
	public static String[][] selectMedecins(String table){
		//Déclaration des variables
		Statement stmt=AccesBD.connection();
		ResultSet rs=null;
		ResultSetMetaData metadata;
		int rowCount,columnCount,rowNum;
		String columnName;
		String[][] result=null;
		try{
			//Définition de la requête pour connaître le nombre de tuples
			rs=stmt.executeQuery("SELECT count(*) FROM "+table);
			//Récupération de la valeur
			rs.next();
			rowCount=rs.getInt(1);
			//Définition de la requête pour construire le jeu d'enregistrement
			rs = stmt.executeQuery("SELECT * FROM "+table);
			metadata = rs.getMetaData();
			//Récupération du nombre de colonnes du jeu d'enregistrement
			columnCount = metadata.getColumnCount();
			//Déclaration du tableau qui contiendra toutes les informations
			result=new String[rowCount][columnCount];
			//Parcours du jeu d'enregistrement
			rowNum=0;
			while(rs.next())
				{
				for(int numCol=0;numCol<columnCount;numCol++)
					{
					//Insertion de la valeur dans une case du tableau
					columnName=metadata.getColumnName(numCol+1);
					result[rowNum][numCol]=rs.getString(columnName);
					}
				rowNum++;
				}
			}
		catch(SQLException e) {System.out.println(e.getMessage());}
		return result;
		}
	
	//Fonction qui ajoute un Médecin à la base de données
	public static String[][] ajoutMedecin(String nom,String prenom,String adresse,String commune,String codePostal,String telephone,String dateInstall,int idSpecialite) throws Exception{
		dateInstall = dateInstall.replace('/', '-');
		Statement stmt = connection();
		try {
			stmt.executeUpdate("INSERT INTO medecin VALUES ('"+nom+"','"+prenom+"','"+adresse+"','"+commune+"','"+codePostal+"','"+telephone+"', '"+dateInstall+"', '"+idSpecialite+"')");
			}
		catch (SQLException e){
			throw new Exception(e);
			}
		
		ResultSet resultat = null;
		int rowCount,rowNum;
		String[][] result = null;

		try {
			//Définition de la requête pour connaître le nombre de tuples
			String req ="SELECT count(identifiant) FROM medecin WHERE nom like '"+nom+"' AND prenom like '"+prenom+"' AND adresse like '"+adresse+"' AND commune like '"+commune+"' AND codePostal = '"+codePostal+"' AND telephone = '"+telephone+"' AND dateInstall like '"+dateInstall+"' AND idSpecialite = '"+idSpecialite+"'";
			resultat = stmt.executeQuery(req);
			
			//Récupération de la valeur
			resultat.next();
			rowCount=resultat.getInt(1);
			
			//Définition de la requête pour construire le jeu d'enregistrement
			String requete = "SELECT identifiant FROM medecin WHERE nom like '"+nom+"' AND prenom like '"+prenom+"' AND adresse like '"+adresse+"' AND commune like '"+commune+"' AND codePostal = '"+codePostal+"' AND telephone = '"+telephone+"' AND dateInstall like '"+dateInstall+"' AND idSpecialite = '"+idSpecialite+"'";
			resultat = stmt.executeQuery(requete);
			result = new String[rowCount][1];
			
			//Parcours du jeu d'enregistrement
			rowNum = 0;
			while (resultat.next()){
				//Insertion de la valeur dans une case du tableau
				result[rowNum][0] = resultat.getString(1);
				rowNum++;
				}
			}
		catch (SQLException e){
			throw new Exception(e);
			}
		return result;
		}

	
	//Fonction qui ajoute une Spécialité à la base de données
	public static String[][] ajoutSpecialite(String libelle) throws Exception{
		Statement stmt = connection();
		
		try {
			stmt.executeUpdate("INSERT INTO specialite VALUES ('"+libelle+"')");
			}
		catch (SQLException e){
			throw new Exception(e);
			}
		
		ResultSet resultat = null;
		int rowCount,rowNum;
		String[][] result = null;

		try {
			//Définition de la requête pour connaître le nombre de tuples
			String req ="SELECT count(identifiant) FROM specialite WHERE libelle like '"+libelle+"'";
			resultat = stmt.executeQuery(req);
			
			//Récupération de la valeur
			resultat.next();
			rowCount=resultat.getInt(1);
			
			//Définition de la requête pour construire le jeu d'enregistrement
			String requete = "SELECT identifiant FROM specialite WHERE libelle like '"+libelle+"'";
			resultat = stmt.executeQuery(requete);
			result = new String[rowCount][1];
			
			//Parcours du jeu d'enregistrement
			rowNum = 0;
			while (resultat.next()){
				//Insertion de la valeur dans une case du tableau
				result[rowNum][0] = resultat.getString(1);
				rowNum++;
				}
			}
		catch (SQLException e){
			throw new Exception(e);
			}
		return result;
		}
	

		//REMPLIR JCOMBOBOX
		//voir https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
		//voir http://docs.oracle.com/javase/tutorial/jdbc/basics/retrieving.html
		//voir http://www.commentcamarche.net/forum/affich-1346967-java-comment-remplir-une-jcombobox
		//voir http://openclassrooms.com/courses/creez-votre-application-web-avec-java-ee/communiquez-avec-votre-bdd
	
	/*
	public static void insertChiffre(int id, String lib) throws Exception{
			Statement stmt=AccesBD.connection();
			try {stmt.executeUpdate("INSERT INTO chiffre VALUES ("+id+",'"+lib+"')");}
			catch(SQLException e) {throw new Exception(e);}
		}*/
	
}
