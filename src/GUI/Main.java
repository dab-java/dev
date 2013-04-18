package GUI;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;

/*
 * Distributeur Automatique de Billets (DAB)
 * 
 * Maurice Phutthavong
 * Charles Bizet
 * Guillaume Cornet
 * 
 */

public final class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowView frame = new MainWindowView();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}