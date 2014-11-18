package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ChoixActionsAjouterSpecialite extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixActionsAjouterSpecialite frame = new ChoixActionsAjouterSpecialite();
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
	public ChoixActionsAjouterSpecialite() {
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
		
		JLabel lblLaSpcialitDu = new JLabel("La sp\u00E9cialit\u00E9 du m\u00E9decin \u00E0 ajouter est-elle dans la liste suivante?");
		sl_panel.putConstraint(SpringLayout.NORTH, lblLaSpcialitDu, 33, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblLaSpcialitDu, 10, SpringLayout.WEST, panel);
		panel.add(lblLaSpcialitDu);
		
		JButton btnOui = new JButton("OUI");
		sl_panel.putConstraint(SpringLayout.WEST, btnOui, -166, SpringLayout.EAST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnOui, -137, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnOui, -99, SpringLayout.EAST, panel);
		panel.add(btnOui);
		
		JButton btnNon = new JButton("NON");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNon, 25, SpringLayout.SOUTH, btnOui);
		sl_panel.putConstraint(SpringLayout.WEST, btnNon, 254, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnNon, 0, SpringLayout.EAST, btnOui);
		panel.add(btnNon);
	}

}
