package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import controleur.Ctrl;

public class ChoixActions extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblQuelleActionChoisir; 
	private JButton btnAjouter;
	private JButton btnModifier;
	private JButton btnSupprimer;
	private JButton btnRetour;
	/**
	 * Create the frame.
	 */
	public ChoixActions(Ctrl ctrl) {
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
		
		lblQuelleActionChoisir = new JLabel("Quelle action choisir?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblQuelleActionChoisir, 40, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblQuelleActionChoisir, 65, SpringLayout.WEST, panel);
		panel.add(lblQuelleActionChoisir);
		
		btnAjouter = new JButton("Ajouter");
		sl_panel.putConstraint(SpringLayout.NORTH, btnAjouter, 24, SpringLayout.SOUTH, lblQuelleActionChoisir);
		sl_panel.putConstraint(SpringLayout.WEST, btnAjouter, 0, SpringLayout.WEST, lblQuelleActionChoisir);
		panel.add(btnAjouter);
		
		btnModifier = new JButton("Modifier");
		sl_panel.putConstraint(SpringLayout.NORTH, btnModifier, 6, SpringLayout.SOUTH, btnAjouter);
		sl_panel.putConstraint(SpringLayout.WEST, btnModifier, 0, SpringLayout.WEST, lblQuelleActionChoisir);
		sl_panel.putConstraint(SpringLayout.EAST, btnModifier, 0, SpringLayout.EAST, btnAjouter);
		panel.add(btnModifier);
		
		btnSupprimer = new JButton("Supprimer");
		sl_panel.putConstraint(SpringLayout.NORTH, btnSupprimer, 6, SpringLayout.SOUTH, btnModifier);
		sl_panel.putConstraint(SpringLayout.EAST, btnAjouter, 0, SpringLayout.EAST, btnSupprimer);
		sl_panel.putConstraint(SpringLayout.WEST, btnSupprimer, 0, SpringLayout.WEST, lblQuelleActionChoisir);
		panel.add(btnSupprimer);
		
		btnRetour = new JButton("Retour");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnRetour, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnRetour, -10, SpringLayout.EAST, panel);
		panel.add(btnRetour);
	}
	public void assignListener(Ctrl ctrl){
		this.btnAjouter.setActionCommand("choix_actions_ajouter");
		this.btnAjouter.addActionListener(ctrl);
		this.btnModifier.setActionCommand("choix_actions_modifier");
		this.btnModifier.addActionListener(ctrl);
		this.btnSupprimer.setActionCommand("choix_actions_supprimer");
		this.btnSupprimer.addActionListener(ctrl);
		this.btnRetour.setActionCommand("choix_actions_retour");
		this.btnRetour.addActionListener(ctrl);
	}
}
