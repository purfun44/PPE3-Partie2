package view;

import javax.swing.JFrame;
import controleur.Ctrl;

public abstract class View extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public View() {
		
	}
	public abstract void assignListener(Ctrl ctrl);
}
