package GUI;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;
import javax.xml.crypto.Data;

import controller.MainController;

import model.Database;
import model.MainModel;

import view.Dab;



/**
 * Classe principale (point d'entrée dans l'application)
 *
 *
 */
public final class Main {

	public static void main(String[] args) 
	{
		/*Database instanceAccount = new Database("ListAccount/1234.txt");
		instanceAccount.debiter((float)50);
		instanceAccount.close();*/
		EventQueue.invokeLater(new Runnable() {
			public void run()
			{
				try 
				{
					MainModel model = new MainModel();
					
					Dab frame = new Dab(model);
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
		
	}
}
