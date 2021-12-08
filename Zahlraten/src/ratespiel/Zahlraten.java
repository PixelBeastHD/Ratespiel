package ratespiel;

import java.util.Random;
import javax.swing.JOptionPane;

public class Zahlraten {
	private int zufallszahl;
	private int ratezahl;
	
	Zahlraten() {
		ratezahl = -1;
	}
	
	void setZufallszahl(int zahl) {
		zufallszahl = zahl;
	}
	
	int getZufallszahl() {
		return zufallszahl;
	}
	
	void setRatezahl(int zahl) {
		ratezahl = zahl;
		}
	
	int getRatezahl() {
		return ratezahl;
	}

	public static void main(String[] args) {
		
		var spiel = new Zahlraten();
		var geraten = false;
		var versuchzaehler = 0;
		JOptionPane.showMessageDialog(null, "Erraten Sie eine ganze Zahl aus dem Bereich von 1 bis 100!");
		var randomGenerator = new Random();
		spiel.setZufallszahl(randomGenerator.nextInt(101));
		while (!geraten) {
			spiel.setRatezahl(Integer.parseInt(JOptionPane.showInputDialog("Welche Zahl wird gesucht?")));
			versuchzaehler++;
			if (spiel.getRatezahl() < spiel.getZufallszahl()) {
				JOptionPane.showMessageDialog(null, "Ihre Zahl ist zu klein!");
			} else {
				if (spiel.getRatezahl() > spiel.getZufallszahl()) {
					JOptionPane.showMessageDialog(null, "Ihre Zahl ist zu groß!");
				} else {
					geraten = true;
					JOptionPane.showMessageDialog(null, "Glückwunsch! Sie haben die Zahl mit " + versuchzaehler + " Versuchen erraten!");
				}
			}
		}
		
	}

}
