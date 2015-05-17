package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

import model.medecin;
import model.specialite;
import view.Choix;
import view.ChoixActions;
import view.ChoixActionsAjouter1;
import view.ChoixActionsAjouter2;
import view.ChoixActionsAjouterSpecialite;
import view.ChoixActionsModifier;
import view.ChoixActionsSupprimer;
import view.ChoixFichier;
import view.View;

public class Ctrl implements ActionListener{
	private ArrayList<View> allTheViews = new ArrayList<View>();
	/*private ArrayList<medecin> tousLesMedecins = new ArrayList<medecin>();
	private ArrayList<specialite> toutesLesSpecialites = new ArrayList<specialite>();*/
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String action=evt.getActionCommand();
		String details[]=action.split("_");
		
		//Afficher les données de la BDMED
		/*
		String[][] tableau1=AccesBD.selectMedecins("medecin");
		for (int j = 0; j < tableau1.length; j++) {
			for (int i = 0; i < tableau1[j].length; i++) {
				System.out.println(tableau1[j][i]);
				}
			}
		
		//Afficher nom medecin
		String[][] listeNomMedecin=AccesBD.selectMedecins("medecin");
		for (int j = 0; j < listeNomMedecin.length; j++) {
			System.out.println(listeNomMedecin[j][1]);
			}
		*/
		
		switch(details[0]){
			case "choix":
				if(details[1].equals("actions"))
					{
					//Vue ChoixActions:
					View actions = new ChoixActions(this);
					allTheViews.add(actions);
					actions.assignListener(this);
					actions.setVisible(true);
					if(details.length >= 3)
						{
						if(details[2].equals("ajouter"))
							{
							//Récupérer les spécialités
							String[][] tableauSpecialite=AccesBD.selectMedecins("specialite");
							
							//Vérification des données de tableauSpecialite
							for (int i = 0; i < tableauSpecialite.length; i++) {
								for (int k = 0; k <= 1; k++) {
									System.out.println(tableauSpecialite[i][k]);
									}
								}
							
							String[] tableauSpecialite2 = new String[tableauSpecialite.length];
							for (int j = 0; j < tableauSpecialite.length; j++) {
								tableauSpecialite2[j]=tableauSpecialite[j][1];
								}
							//Trier par ordre alphabétique
							/*Arrays.sort(tableauSpecialite2);
							List l=Arrays.asList(tableauSpecialite2);
					        for (int i = 0; i < l.size(); i++) {
					            System.out.print(l.get(i)+",");
					        	}*/
							
							//Vue ChoixActionsAjouterSpecialite:
							View ajouter = new ChoixActionsAjouterSpecialite(this,tableauSpecialite2);
							allTheViews.add(ajouter);
							ajouter.assignListener(this);
							ajouter.setVisible(true);
							
							if(details.length >= 4)
								{
								if(details[3].equals("oui"))
									{
									//Vue ChoixActionsAjouter1:
									View oui = new ChoixActionsAjouter1(this);
									allTheViews.add(oui);
									oui.assignListener(this);
									oui.setVisible(true);
									if(details.length == 5)
										{
										if(details[4].equals("retour"))
											{
											//Vue ChoixActionsAjouterSpecialite:
											View retour = new ChoixActionsAjouterSpecialite(this,tableauSpecialite2);
											allTheViews.add(retour);
											retour.assignListener(this);
											retour.setVisible(true);
											}
										}
									}
								else if(details[3].equals("non"))
									{
									//Vue ChoixActionsAjouter2:
									View non = new ChoixActionsAjouter2(this);
									allTheViews.add(non);
									non.assignListener(this);
									non.setVisible(true);
									if(details.length == 5)
										{
										if(details[4].equals("retour"))
											{
											//Vue ChoixActionsAjouterSpecialite:
											View retour = new ChoixActionsAjouterSpecialite(this,tableauSpecialite2);
											allTheViews.add(retour);
											retour.assignListener(this);
											retour.setVisible(true);
											}
										}
									}
								else if(details[3].equals("retour2"))
									{
									//Vue ChoixActions:
									View retour2 = new ChoixActions(this);
									allTheViews.add(retour2);
									retour2.assignListener(this);
									retour2.setVisible(true);
									}
								}
							}
						else if(details[2].equals("modifier"))
							{
							//Vue ChoixActionsModifier:
							View modifier = new ChoixActionsModifier(this);
							allTheViews.add(modifier);
							modifier.assignListener(this);
							modifier.setVisible(true);
							
							if(details.length == 4)
								{
								if(details[3].equals("retour"))
									{
									//Vue ChoixActions:
									View retour = new ChoixActions(this);
									allTheViews.add(retour);
									retour.assignListener(this);
									retour.setVisible(true);
									}
								}
							}
						else if(details[2].equals("supprimer"))
							{
							//Vue ChoixActionsSupprimer:
							View supprimer = new ChoixActionsSupprimer(this);
							allTheViews.add(supprimer);
							supprimer.assignListener(this);
							supprimer.setVisible(true);
							if(details.length == 4)
								{
								if(details[3].equals("retour"))
									{
									//Vue ChoixActions:
									View retour = new ChoixActions(this);
									allTheViews.add(retour);
									retour.assignListener(this);
									retour.setVisible(true);
									}
								}
							}
						else if(details[2].equals("retour"))
							{
							//Vue Choix:
							View actions1 = new Choix(this);
							allTheViews.add(actions1);
							actions1.assignListener(this);
							actions1.setVisible(true);
							}
						}
					}
				else if(details[1].equals("fichier"))
					{
					//Vue ChoixFichier:
					View fichier = new ChoixFichier(this);
					allTheViews.add(fichier);
					fichier.assignListener(this);
					fichier.setVisible(true);
					if(details.length == 3)
						{
						if(details[2].equals("retour"))
							{
							//Vue Choix:
							View retour = new Choix(this);
							allTheViews.add(retour);
							retour.assignListener(this);
							retour.setVisible(true);
							}
						if(details[2].equals("parcourir"))
							{
							JFileChooser chooser = new JFileChooser();
					        int returnVal = chooser.showOpenDialog(null);
					        if(returnVal == JFileChooser.APPROVE_OPTION) {
					        	String chemin;
					        	chemin = chooser.getSelectedFile().getAbsolutePath().toString(); //Ouverture de la fenêtre de choix de fichier
								//String csvFile = "C:\\Users\\tpasquier\\Desktop\\dataMed.csv";
								BufferedReader br = null;
								String line = "";
								int ligne = 0;
								try {
									br = new BufferedReader(new FileReader(chemin));//Lecture du fichier
									while ((line = br.readLine()) != null) {//Tant qu'il y a des lignes
										String[] Medecins = line.split(";");//On sépare les données par un point virgule
										//Traitement des apostrophes
										Medecins[2]=Medecins[2].replace("'", "''");
										Medecins[3]=Medecins[3].replace("'", "''");
										//Début du traitement
										int idSpecialite = 0;
										if(ligne>0){
											//Spécialité
											for (int i = 0; i < specialite.toutesLesSpecialites.size(); i++) {
												if(Medecins[7].equals( specialite.toutesLesSpecialites.get(i).getLibelle())){
													idSpecialite = specialite.toutesLesSpecialites.get(i).getIdentifiant();
													}
												}
											//On vérifie si la valeur de idSpecialite à changé et sinon on crée une nouvelle spécialité
											if(idSpecialite == 0){
												new specialite(Medecins[7].replace("'", "''"));
												for (int j = 0; j < specialite.toutesLesSpecialites.size(); j++) {
													if (specialite.toutesLesSpecialites.get(j).getLibelle().equals(Medecins[7])){
														idSpecialite = specialite.toutesLesSpecialites.get(j).getIdentifiant();
														}
													}
												}
											
											//Création du nouveau Medecin
											if (idSpecialite != 0){
												new medecin(Medecins[0], Medecins[1], Medecins[2],Medecins[3],Medecins[4],Medecins[5],Medecins[6],idSpecialite);
												}
											}
										ligne++;
										}
									}
								catch (FileNotFoundException e) {
									e.printStackTrace();}
								catch (IOException e) {
									e.printStackTrace();}
								finally {
									if (br != null) {
										try {
											br.close();}
										catch (IOException e) {
											e.printStackTrace();}
										}
									}
							
								String specialite1 = "";
								//Affichage des conteneurs
								for (int j = 0; j < medecin.tousLesMedecins.size(); j++) {
									for (int k = 0; k < specialite.toutesLesSpecialites.size(); k++) {
										if (medecin.tousLesMedecins.get(j).getIdSpecialite() == specialite.toutesLesSpecialites.get(k).getIdentifiant()){
											specialite1 = specialite.toutesLesSpecialites.get(k).getLibelle();
											}
										}
									System.out.println(medecin.tousLesMedecins.get(j).getNom() + " ; "+ medecin.tousLesMedecins.get(j).getPrenom() + " ; " + medecin.tousLesMedecins.get(j).getAdresse() + " ; " + medecin.tousLesMedecins.get(j).getCommune() + " ; " + medecin.tousLesMedecins.get(j).getCodePostal() + " ; " +  medecin.tousLesMedecins.get(j).getTelephone() + " ; " +medecin.tousLesMedecins.get(j).getDateInstall() + " ; " + specialite1);
									}
					        	}
							}
						}
					}
			break;
			
			case "quitter":
				System.exit(0);
			break;
			
		}
	}
}
