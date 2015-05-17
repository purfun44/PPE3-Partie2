package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import controleur.Ctrl;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Choix extends View {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JPanel contentPane;
	private JLabel lblChoixDeLaction;
	private JButton btnImporterUnFichier;
	private JLabel lblOu; 
	private JButton btnActionsSurLa; 
	private JButton btnQuitter;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//INSTANCIATION DU CONTROLEUR
					Ctrl ctrl = new Ctrl();
					Choix frame = new Choix(ctrl);
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
	public Choix(Ctrl ctrl) {
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
		
		lblChoixDeLaction = new JLabel("Choix de l'action \u00E0 effectuer:");
		panel.add(lblChoixDeLaction);
		
		btnImporterUnFichier = new JButton("Importer un fichier de donn\u00E9es...");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnImporterUnFichier, -145, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnImporterUnFichier, -97, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblChoixDeLaction, 0, SpringLayout.WEST, btnImporterUnFichier);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblChoixDeLaction, -21, SpringLayout.NORTH, btnImporterUnFichier);
		panel.add(btnImporterUnFichier);
		
		lblOu = new JLabel("OU");
		sl_panel.putConstraint(SpringLayout.NORTH, lblOu, 6, SpringLayout.SOUTH, btnImporterUnFichier);
		sl_panel.putConstraint(SpringLayout.EAST, lblOu, -194, SpringLayout.EAST, panel);
		panel.add(lblOu);
		
		btnActionsSurLa = new JButton("Actions sur la Base de Donn\u00E9es...");
		sl_panel.putConstraint(SpringLayout.NORTH, btnActionsSurLa, 6, SpringLayout.SOUTH, lblOu);
		sl_panel.putConstraint(SpringLayout.WEST, btnActionsSurLa, 0, SpringLayout.WEST, lblChoixDeLaction);
		btnActionsSurLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.add(btnActionsSurLa);
		
		btnQuitter = new JButton("Quitter");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnQuitter, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnQuitter, -10, SpringLayout.EAST, panel);
		panel.add(btnQuitter);
		this.assignListener(ctrl);
	}
	public void assignListener(Ctrl ctrl){
		this.btnImporterUnFichier.setActionCommand("choix_fichier");
		this.btnImporterUnFichier.addActionListener(ctrl);
		this.btnActionsSurLa.setActionCommand("choix_actions");
		this.btnActionsSurLa.addActionListener(ctrl);
		this.btnQuitter.setActionCommand("quitter");
		this.btnQuitter.addActionListener(ctrl);
	}
}
