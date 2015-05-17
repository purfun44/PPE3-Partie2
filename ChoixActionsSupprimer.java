package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import controleur.Ctrl;

public class ChoixActionsSupprimer extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JButton btnSupprimer;
	private JLabel label;
	private JComboBox comboBox;
	private JButton btnRetour;


	/**
	 * Create the frame.
	 */
	public ChoixActionsSupprimer(Ctrl ctrl) {
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
		
		btnSupprimer = new JButton("Supprimer");
		panel.add(btnSupprimer);
		
		label = new JLabel("Choisir un m\u00E9decin:");
		sl_panel.putConstraint(SpringLayout.WEST, btnSupprimer, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.EAST, btnSupprimer, 114, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.NORTH, label, 43, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 149, SpringLayout.WEST, panel);
		panel.add(label);
		
		comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, btnSupprimer, 20, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 23, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 114, SpringLayout.WEST, label);
		panel.add(comboBox);
		
		btnRetour = new JButton("Retour");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnRetour, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnRetour, -10, SpringLayout.EAST, panel);
		panel.add(btnRetour);
	}
	public void assignListener(Ctrl ctrl){
		this.btnRetour.setActionCommand("choix_actions_supprimer_retour");
		this.btnRetour.addActionListener(ctrl);
	}
}
