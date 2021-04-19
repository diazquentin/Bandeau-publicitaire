package fr.quentin.banniere;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Lanceur {

	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e){}
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 60);
		Banniere banniere = new Banniere("Ce texte defile de droite a gauche", 90);
		f.add(banniere);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		banniere.start();

	}

}
