package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ChoixFichier extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixFichier frame = new ChoixFichier();
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
	public ChoixFichier() {
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
		
		JLabel lblSlectionnerLeFichier = new JLabel("S\u00E9lectionner le fichier de donn\u00E9es:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSlectionnerLeFichier, 40, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSlectionnerLeFichier, 65, SpringLayout.WEST, panel);
		panel.add(lblSlectionnerLeFichier);
		
		JButton btnParcourir = new JButton("Parcourir...");
		sl_panel.putConstraint(SpringLayout.NORTH, btnParcourir, 18, SpringLayout.SOUTH, lblSlectionnerLeFichier);
		sl_panel.putConstraint(SpringLayout.WEST, btnParcourir, 150, SpringLayout.WEST, panel);
		panel.add(btnParcourir);
		
		JButton btnValider = new JButton("Valider");
		sl_panel.putConstraint(SpringLayout.NORTH, btnValider, 55, SpringLayout.SOUTH, btnParcourir);
		sl_panel.putConstraint(SpringLayout.WEST, btnValider, 163, SpringLayout.WEST, panel);
		panel.add(btnValider);
	}

}
