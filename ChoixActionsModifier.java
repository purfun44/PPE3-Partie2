package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class ChoixActionsModifier extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblChoisirUnMdecin;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixActionsModifier frame = new ChoixActionsModifier();
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
	public ChoixActionsModifier() {
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
		
		textField = new JTextField();
		textField.setColumns(10);
		panel.add(textField);
		
		textField_1 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_1, -170, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_1, -106, SpringLayout.EAST, panel);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.SOUTH, textField_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_2, -148, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, textField_1);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.SOUTH, textField_2);
		sl_panel.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_1);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField_1);
		textField_4.setColumns(10);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.SOUTH, textField_5);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.SOUTH, textField_4);
		sl_panel.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, textField_1);
		textField_5.setColumns(10);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		sl_panel.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_4, 22, SpringLayout.SOUTH, textField_6);
		sl_panel.putConstraint(SpringLayout.NORTH, textField_6, 0, SpringLayout.SOUTH, textField_3);
		sl_panel.putConstraint(SpringLayout.SOUTH, textField_6, -104, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, textField_1);
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		JComboBox comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 0, SpringLayout.SOUTH, textField);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 200, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboBox, -16, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, textField);
		panel.add(comboBox);
		
		JLabel lblRemplirLesChamps = new JLabel("Remplir les champs \u00E0 modifier:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblRemplirLesChamps, 31, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblRemplirLesChamps, 10, SpringLayout.WEST, panel);
		panel.add(lblRemplirLesChamps);
		
		lblChoisirUnMdecin = new JLabel("Choisir un m\u00E9decin \u00E0 modifier:");
		sl_panel.putConstraint(SpringLayout.WEST, lblChoisirUnMdecin, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblChoisirUnMdecin, -5, SpringLayout.NORTH, lblRemplirLesChamps);
		panel.add(lblChoisirUnMdecin);
		
		comboBox_1 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, 7, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_1, 14, SpringLayout.EAST, lblChoisirUnMdecin);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, 0, SpringLayout.EAST, textField);
		panel.add(comboBox_1);
	}
}
