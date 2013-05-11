package view.usercreenview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import view.Card;
import view.usercreenview.AskCodeView.JButtonListener;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;

public class AddMoney extends UserAbstractScreen
{

	public AddMoney(MainModel model, MainController controller) {
		super(model, controller);
		// TODO Auto-generated constructor stub
		mainPanel.setLabelText("Bienvenue administrateur. \nQuelle somme voulez-vous ajouter ?");
		cardPanel.setVisible(false);
		padPanel.getPadValid().addActionListener(new JButtonListener());
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean conditionForSuccess() {
		// TODO Auto-generated method stub
		return false;
	}
	public class JButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Etat AddMoney : Reception de l'action");
			
			if(padPanel.getInputCode().getText() != "")
			{
				((UserScreenController)controller).addMoney(padPanel.getInputCode().getText());
				mainPanel.setLabelText("Ajout de " + padPanel.getInputCode().getText());
			}
			else
			{
				mainPanel.setLabelText("Entrez une somme.");
			}
			
		}
		
	}

}
