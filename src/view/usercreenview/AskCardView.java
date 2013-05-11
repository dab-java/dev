package view.usercreenview;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JLabel;

import view.Card;
import view.CardView;
import view.PadView;
import view.ReceiptView;
import view.ScreenView;
import view.TicketView;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;

public class AskCardView extends UserAbstractScreen 
{

	private JLabel labelUser;

	public AskCardView(MainModel model, MainController controller) {
		super(model, controller);
		
		mainPanel.setLabelText("Bienvenue, Entrez votre carte : ");
		cardPanel.getPadValid().addActionListener(new JButtonListener());
		padPanel.setVisible(false);
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		// TODO Auto-generated method stub
		mainPanel.setLabelText("Carte insérée.");
	}

	@Override
	public boolean conditionForSuccess() {
		// TODO Auto-generated method stub
		if(model.getCardUser() != "" && model.getCode() != 0)
			return true;
		else 
			return false;
	}
	public class JButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Etat AskCardView : Reception de l'action");
			Card currentCard = new Card(cardPanel.getInputCard().getText() );
			if(cardPanel.getInputCard().getText().length() == 4 && currentCard.getCode() != 0)
			{
				((UserScreenController)controller).setCardUser(currentCard.getNumero(), currentCard.getCode());
			}
			else
			{
				mainPanel.setLabelText("Carte inconnue.");
			}
			
		}
		
	}

}
 