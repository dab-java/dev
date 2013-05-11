package view.usercreenview;

import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;

import view.Card;
import view.usercreenview.chooseActionView.JButtonListener;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;

public class ViewAccount extends UserAbstractScreen 
{

	public ViewAccount(MainModel model, MainController controller) 
	{
		super(model, controller);
		cardPanel.setVisible(false);
		padPanel.getPadValid().addActionListener(new JButtonListener());
		// TODO Auto-generated constructor stub
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
			mainPanel.setLabelText("Etat de votre compte " + model.getCardUser() + "\n- solde : " + model.getSolde());
			
			
		}
		
	}
	

}
