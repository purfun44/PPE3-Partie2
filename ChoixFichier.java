package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import controleur.Ctrl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoixFichier extends View {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblSlectionnerLeFichier;
	private JButton btnParcourir;
	private JButton btnRetour;
	
	/**
	 * Create the frame.
	 */
	public ChoixFichier(Ctrl ctrl) {
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
		
		lblSlectionnerLeFichier = new JLabel("S\u00E9lectionner le fichier de donn\u00E9es:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSlectionnerLeFichier, 40, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSlectionnerLeFichier, 65, SpringLayout.WEST, panel);
		panel.add(lblSlectionnerLeFichier);
		
		btnParcourir = new JButton("Parcourir...");
		btnParcourir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnParcourir, 18, SpringLayout.SOUTH, lblSlectionnerLeFichier);
		sl_panel.putConstraint(SpringLayout.WEST, btnParcourir, 150, SpringLayout.WEST, panel);
		panel.add(btnParcourir);
		
		btnRetour = new JButton("Retour");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnRetour, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnRetour, -10, SpringLayout.EAST, panel);
		panel.add(btnRetour);
	}
	public void assignListener(Ctrl ctrl){
		this.btnParcourir.setActionCommand("choix_fichier_parcourir");
		this.btnParcourir.addActionListener(ctrl);
		this.btnRetour.setActionCommand("choix_fichier_retour");
		this.btnRetour.addActionListener(ctrl);
	}

}
