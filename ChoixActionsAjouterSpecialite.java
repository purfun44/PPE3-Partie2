package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import controleur.Ctrl;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ChoixActionsAjouterSpecialite extends View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblLaSpcialitDu;
	private JButton btnOui;
	private JButton btnNon;
	public JList listSpecialite;
	private JButton btnRetour2;
	/**
	 * Create the frame.
	 */
	public ChoixActionsAjouterSpecialite(Ctrl ctrl, String[] tableauSpecialite) {
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
		
		lblLaSpcialitDu = new JLabel("La sp\u00E9cialit\u00E9 du m\u00E9decin \u00E0 ajouter est-elle dans la liste suivante?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblLaSpcialitDu, 33, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblLaSpcialitDu, 10, SpringLayout.WEST, panel);
		panel.add(lblLaSpcialitDu);
		
		btnOui = new JButton("OUI");
		panel.add(btnOui);
		
		btnNon = new JButton("NON");
		sl_panel.putConstraint(SpringLayout.EAST, btnOui, 0, SpringLayout.EAST, btnNon);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNon, 140, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnNon, 254, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNon, -99, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnOui, 0, SpringLayout.WEST, btnNon);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnOui, -24, SpringLayout.NORTH, btnNon);
		panel.add(btnNon);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_panel.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, lblLaSpcialitDu);
		sl_panel.putConstraint(SpringLayout.WEST, scrollPane, 59, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, scrollPane, 79, SpringLayout.SOUTH, btnNon);
		sl_panel.putConstraint(SpringLayout.EAST, scrollPane, 222, SpringLayout.WEST, panel);
		panel.add(scrollPane);
		
		listSpecialite = new JList(tableauSpecialite);
		
		scrollPane.setViewportView(listSpecialite);
		
		btnRetour2 = new JButton("Retour");
		sl_panel.putConstraint(SpringLayout.SOUTH, btnRetour2, -10, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnRetour2, -10, SpringLayout.EAST, panel);
		panel.add(btnRetour2);
	}
	
	public void assignListener(Ctrl ctrl){
		this.btnOui.setActionCommand("choix_actions_ajouter_oui");
		this.btnOui.addActionListener(ctrl);
		this.btnNon.setActionCommand("choix_actions_ajouter_non");
		this.btnNon.addActionListener(ctrl);
		this.btnRetour2.setActionCommand("choix_actions_ajouter_retour2");
		this.btnRetour2.addActionListener(ctrl);
	}
}
