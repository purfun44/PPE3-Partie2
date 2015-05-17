package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import controleur.Ctrl;

public class ChoixActionsAjouter1 extends View {

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
	private JPanel panel;
	private JLabel lblNom;
	private JLabel lblRemplirChaqueChamps;
	private JLabel lblPrnom;
	private JLabel lblAdresse;
	private JLabel lblCommune;
	private JLabel lblCodePostal;
	private JLabel lblTlphone;
	private JLabel lblSpcialit;
	private JLabel lblDateDinstallation;
	private JComboBox comboBox;
	private JButton btnValider;
	private JButton btnRetour;
	
	
	
	
	/**
	 * Create the frame.
	 */
	public ChoixActionsAjouter1(Ctrl ctrl) {
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
		
		lblNom = new JLabel("Nom:");
		sl_panel.putConstraint(SpringLayout.WEST, lblNom, 44, SpringLayout.WEST, panel);
		panel.add(lblNom);
		
		lblRemplirChaqueChamps = new JLabel("Remplir chaque champs caract\u00E9ristique du m\u00E9decin \u00E0 ajouter:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNom, 27, SpringLayout.SOUTH, lblRemplirChaqueChamps);
		sl_panel.putConstraint(SpringLayout.NORTH, lblRemplirChaqueChamps, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblRemplirChaqueChamps, 10, SpringLayout.WEST, panel);
		panel.add(lblRemplirChaqueChamps);
		
		lblPrnom = new JLabel("Pr\u00E9nom:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPrnom, 6, SpringLayout.SOUTH, lblNom);
		sl_panel.putConstraint(SpringLayout.WEST, lblPrnom, 0, SpringLayout.WEST, lblNom);
		panel.add(lblPrnom);
		
		lblAdresse = new JLabel("Adresse:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblAdresse, 6, SpringLayout.SOUTH, lblPrnom);
		sl_panel.putConstraint(SpringLayout.WEST, lblAdresse, 0, SpringLayout.WEST, lblNom);
		panel.add(lblAdresse);
		
		lblCommune = new JLabel("Commune:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblCommune, 6, SpringLayout.SOUTH, lblAdresse);
		sl_panel.putConstraint(SpringLayout.WEST, lblCommune, 0, SpringLayout.WEST, lblNom);
		panel.add(lblCommune);
		
		lblCodePostal = new JLabel("Code postal:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblCodePostal, 6, SpringLayout.SOUTH, lblCommune);
		sl_panel.putConstraint(SpringLayout.WEST, lblCodePostal, 0, SpringLayout.WEST, lblNom);
		panel.add(lblCodePostal);
		
		lblTlphone = new JLabel("T\u00E9l\u00E9phone:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblTlphone, 6, SpringLayout.SOUTH, lblCodePostal);
		sl_panel.putConstraint(SpringLayout.WEST, lblTlphone, 0, SpringLayout.WEST, lblNom);
		panel.add(lblTlphone);
		
		lblSpcialit = new JLabel("Sp\u00E9cialit\u00E9:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSpcialit, 28, SpringLayout.SOUTH, lblTlphone);
		sl_panel.putConstraint(SpringLayout.WEST, lblSpcialit, 0, SpringLayout.WEST, lblNom);
		panel.add(lblSpcialit);
		
		textField = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblNom);
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_1, -3, SpringLayout.NORTH, lblPrnom);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField_2);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, -3, SpringLayout.NORTH, lblAdresse);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_3);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, -3, SpringLayout.NORTH, lblCommune);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_4);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, -3, SpringLayout.NORTH, lblCodePostal);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_5);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_5, -3, SpringLayout.NORTH, lblTlphone);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField_6);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		lblDateDinstallation = new JLabel("Date d'installation:");
		sl_panel.putConstraint(SpringLayout.NORTH, textField_6, -3, SpringLayout.NORTH, lblDateDinstallation);
		sl_panel.putConstraint(SpringLayout.WEST, textField_6, 13, SpringLayout.EAST, lblDateDinstallation);
		sl_panel.putConstraint(SpringLayout.WEST, lblDateDinstallation, 0, SpringLayout.WEST, lblNom);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblDateDinstallation, -6, SpringLayout.NORTH, lblSpcialit);
		panel.add(lblDateDinstallation);
		
		comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 59, SpringLayout.EAST, lblSpcialit);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, textField);
		panel.add(comboBox);
		
		btnValider = new JButton("Valider");
		sl_panel.putConstraint(SpringLayout.NORTH, btnValider, 9, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.WEST, btnValider, 0, SpringLayout.WEST, textField);
		panel.add(btnValider);
		
		btnRetour = new JButton("Retour");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnRetour, 0, SpringLayout.SOUTH, btnValider);
		sl_panel.putConstraint(SpringLayout.EAST, btnRetour, -10, SpringLayout.EAST, panel);
		panel.add(btnRetour);
	}
	public void assignListener(Ctrl ctrl){
		this.btnValider.setActionCommand("choix_actions_ajouter_oui_valider");
		this.btnValider.addActionListener(ctrl);
		this.btnRetour.setActionCommand("choix_actions_ajouter_oui_retour");
		this.btnRetour.addActionListener(ctrl);
	}
}
