package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choix extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Choix frame = new Choix();
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
	public Choix() {
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
		
		JLabel lblChoixDeLaction = new JLabel("Choix de l'action \u00E0 effectuer:");
		sl_panel.putConstraint(SpringLayout.WEST, lblChoixDeLaction, 65, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblChoixDeLaction, -187, SpringLayout.SOUTH, panel);
		panel.add(lblChoixDeLaction);
		
		JButton btnImporterUnFichier = new JButton("Importer un fichier de donn\u00E9es...");
		sl_panel.putConstraint(SpringLayout.NORTH, btnImporterUnFichier, 20, SpringLayout.SOUTH, lblChoixDeLaction);
		panel.add(btnImporterUnFichier);
		
		JLabel lblOu = new JLabel("OU");
		sl_panel.putConstraint(SpringLayout.WEST, lblOu, 199, SpringLayout.WEST, panel);
		panel.add(lblOu);
		
		JButton btnActionsSurLa = new JButton("Actions sur la Base de Donn\u00E9es...");
		sl_panel.putConstraint(SpringLayout.NORTH, btnActionsSurLa, 161, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnActionsSurLa, -95, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblOu, -21, SpringLayout.NORTH, btnActionsSurLa);
		sl_panel.putConstraint(SpringLayout.EAST, btnImporterUnFichier, 0, SpringLayout.EAST, btnActionsSurLa);
		btnActionsSurLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnActionsSurLa);
	}
}
