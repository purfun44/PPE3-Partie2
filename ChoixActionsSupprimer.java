package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ChoixActionsSupprimer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixActionsSupprimer frame = new ChoixActionsSupprimer();
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
	public ChoixActionsSupprimer() {
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
		
		JButton btnSupprimer = new JButton("Supprimer");
		panel.add(btnSupprimer);
		
		JLabel label = new JLabel("Choisir un m\u00E9decin:");
		sl_panel.putConstraint(SpringLayout.WEST, btnSupprimer, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.EAST, btnSupprimer, 114, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.NORTH, label, 43, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, label, 149, SpringLayout.WEST, panel);
		panel.add(label);
		
		JComboBox comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, btnSupprimer, 20, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 23, SpringLayout.SOUTH, label);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 0, SpringLayout.WEST, label);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 114, SpringLayout.WEST, label);
		panel.add(comboBox);
	}
}
