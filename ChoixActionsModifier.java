package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

import controleur.AccesBD;
import controleur.Ctrl;

public class ChoixActionsModifier extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblChoisirUnMdecin;
	private JComboBox comboBox_1;
	private JPanel panel;
	private JComboBox comboBox;
	private JLabel lblRemplirLesChamps;
	private JLabel lblNom; 
	private JLabel lblPrnom;
	private JLabel lblAdresse;
	private JLabel lblCommune;
	private JLabel lblCodePostal;
	private JLabel lblTlphone;
	private JLabel lblDateDinstallation;
	private JLabel lblSpcialit;
	private JButton btnValider;
	private JButton btnRetour;

	/**
	 * Create the frame.
	 */
	public ChoixActionsModifier(Ctrl ctrl) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_1, -170, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_1, -106, SpringLayout.EAST, panel);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.SOUTH, textField_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_2, -148, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_1);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.SOUTH, textField_2);
		sl_panel.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_1);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_1);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.SOUTH, textField_5);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.SOUTH, textField_4);
		sl_panel.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField_1);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_4, 22, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_6, 0, SpringLayout.SOUTH, textField_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_6, -104, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, textField_1);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, textField);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboBox, -16, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, textField);
		panel.add(comboBox);
		//Remplir la JComboBox (libelle specialite)
		String[][] listeLibelleSpecialite=AccesBD.selectMedecins("specialite");
		for (int j = 0; j < listeLibelleSpecialite.length; j++) {
			comboBox.addItem(listeLibelleSpecialite[j][1]);
			}
		
		lblRemplirLesChamps = new JLabel("Remplir les champs \u00E0 modifier:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblRemplirLesChamps, 31, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblRemplirLesChamps, 10, SpringLayout.WEST, panel);
		panel.add(lblRemplirLesChamps);
		
		lblChoisirUnMdecin = new JLabel("Choisir un m\u00E9decin \u00E0 modifier:");
		sl_panel.putConstraint(SpringLayout.WEST, lblChoisirUnMdecin, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblChoisirUnMdecin, -5, SpringLayout.NORTH, lblRemplirLesChamps);
		panel.add(lblChoisirUnMdecin);
		
		comboBox_1 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 7, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_1, 14, SpringLayout.EAST, lblChoisirUnMdecin);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, textField);
		panel.add(comboBox_1);
		//Remplir la JComboBox (nom mécecin)
		String[][] listeNomMedecin=AccesBD.selectMedecins("medecin");
		for (int j = 0; j < listeNomMedecin.length; j++) {
			comboBox_1.addItem(listeNomMedecin[j][1]);
			}
		
		lblNom = new JLabel("Nom:");
		sl_panel.putConstraint(SpringLayout.WEST, lblNom, 72, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNom, 0, SpringLayout.SOUTH, textField_1);
		panel.add(lblNom);
		
		lblPrnom = new JLabel("Pr\u00E9nom:");
		sl_panel.putConstraint(SpringLayout.WEST, lblPrnom, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblPrnom, 0, SpringLayout.SOUTH, textField_2);
		panel.add(lblPrnom);
		
		lblAdresse = new JLabel("Adresse:");
		sl_panel.putConstraint(SpringLayout.WEST, lblAdresse, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblAdresse, 0, SpringLayout.SOUTH, textField_3);
		panel.add(lblAdresse);
		
		lblCommune = new JLabel("Commune:");
		sl_panel.putConstraint(SpringLayout.WEST, lblCommune, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblCommune, 0, SpringLayout.SOUTH, textField_6);
		panel.add(lblCommune);
		
		lblCodePostal = new JLabel("Code postal:");
		sl_panel.putConstraint(SpringLayout.WEST, lblCodePostal, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblCodePostal, 0, SpringLayout.SOUTH, textField_4);
		panel.add(lblCodePostal);
		
		lblTlphone = new JLabel("T\u00E9l\u00E9phone:");
		sl_panel.putConstraint(SpringLayout.WEST, lblTlphone, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblTlphone, 0, SpringLayout.SOUTH, textField_5);
		panel.add(lblTlphone);
		
		lblDateDinstallation = new JLabel("Date d'installation:");
		sl_panel.putConstraint(SpringLayout.WEST, lblDateDinstallation, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblDateDinstallation, 0, SpringLayout.SOUTH, textField);
		panel.add(lblDateDinstallation);
		
		lblSpcialit = new JLabel("Sp\u00E9cialit\u00E9:");
		sl_panel.putConstraint(SpringLayout.WEST, lblSpcialit, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblSpcialit, -16, SpringLayout.SOUTH, panel);
		panel.add(lblSpcialit);
		
		btnValider = new JButton("Valider");
		sl_panel.putConstraint(SpringLayout.NORTH, btnValider, -1, SpringLayout.NORTH, textField);
		sl_panel.putConstraint(SpringLayout.EAST, btnValider, -10, SpringLayout.EAST, panel);
		panel.add(btnValider);
		
		btnRetour = new JButton("Retour");
		sl_panel.putConstraint(SpringLayout.NORTH, btnRetour, 0, SpringLayout.SOUTH, btnValider);
		sl_panel.putConstraint(SpringLayout.EAST, btnRetour, 0, SpringLayout.EAST, btnValider);
		panel.add(btnRetour);
	}
	
	/*
	public void remplir_Jcomb() {
		String req= "SELECT Nom_Champ1,Nom_Champ2 FROM  Nom_Table  ORDER BY  Nom_Champ1"; 
		Statement stmt;
	    try
	    	{
			stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(req);
			while(res.next()){
			jComboName.addItem(res.getString(indexe de la colonne));     
//le nom du jComboBox est jComboName et  <indexe de la colonne > est l'indexe de la colonne dont vous voulez afficher dans le combobox ,elle peut prendre l'une des valeurs 1,2...
				}
				res.close();
			}
	    catch (SQLException e)
	    	{
			e.printStackTrace();
			}
		}
	*/
	
	public void assignListener(Ctrl ctrl){
		this.btnRetour.setActionCommand("choix_actions_modifier_retour");
		this.btnRetour.addActionListener(ctrl);
	}
}
