package view.usercreenview;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import view.TicketView;
import view.usercreenview.chooseActionView.JButtonListener;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;

public class GetMoney extends UserAbstractScreen 
{

	public GetMoney(MainModel model, MainController controller) 
	{
		super(model, controller);
		// TODO Auto-generated constructor stub
		mainPanel.setLabelText
		( "Quelle somme voulez vous retirez ?"
		);
		cardPanel.setVisible(false);
		padPanel.getPadValid().addActionListener(new JButtonListener());
		receiptPanel.setVisible(false);
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		// TODO Auto-generated method stub
		mainPanel.setLabelText
		(	model.getInstanceAccount().getEtat()
		);
		ticketPanel.setLabelText("Récuperez vos billets.");
		cardPanel.getInputCard().setText("Récupérez la carte.");
		cardPanel.setVisible(true);
	}
	@Override
	public boolean conditionForSuccess() 
	{
		// TODO Auto-generated method stub
		return false;
	}
	public class JButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// TODO Auto-generated method stub
			System.out.println("Etat GetMoney : Reception de l'action");
			((UserScreenController) controller).debiterMoney(padPanel.getInputCode().getText());
			
		}

		
		
	}
	
}
