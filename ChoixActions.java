package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class ChoixActions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixActions frame = new ChoixActions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChoixActions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblQuelleActionChoisir = new JLabel("Quelle action choisir?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblQuelleActionChoisir, 40, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblQuelleActionChoisir, 65, SpringLayout.WEST, panel);
		panel.add(lblQuelleActionChoisir);
		
		JButton btnAjouter = new JButton("Ajouter");
		sl_panel.putConstraint(SpringLayout.NORTH, btnAjouter, 24, SpringLayout.SOUTH, lblQuelleActionChoisir);
		sl_panel.putConstraint(SpringLayout.WEST, btnAjouter, 0, SpringLayout.WEST, lblQuelleActionChoisir);
		panel.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		sl_panel.putConstraint(SpringLayout.NORTH, btnModifier, 6, SpringLayout.SOUTH, btnAjouter);
		sl_panel.putConstraint(SpringLayout.WEST, btnModifier, 0, SpringLayout.WEST, lblQuelleActionChoisir);
		sl_panel.putConstraint(SpringLayout.EAST, btnModifier, 0, SpringLayout.EAST, btnAjouter);
		panel.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		sl_panel.putConstraint(SpringLayout.NORTH, btnSupprimer, 6, SpringLayout.SOUTH, btnModifier);
		sl_panel.putConstraint(SpringLayout.EAST, btnAjouter, 0, SpringLayout.EAST, btnSupprimer);
		sl_panel.putConstraint(SpringLayout.WEST, btnSupprimer, 0, SpringLayout.WEST, lblQuelleActionChoisir);
		panel.add(btnSupprimer);
	}
}
