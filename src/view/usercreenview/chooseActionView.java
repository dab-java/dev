package view.usercreenview;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JLabel;

import view.usercreenview.AskCodeView.JButtonListener;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;

public class chooseActionView extends UserAbstractScreen
{

	private JLabel labelChooseView;
	
	public chooseActionView(MainModel model, MainController controller) 
	{
		super(model, controller);
		// TODO Auto-generated constructor stub
		
		mainPanel.setLabelText
		( "<html>Que voulez vous faire : <br>" +
			"1) 	Retirer de l'argent ? <br>" +
			"2) 	Consulter votre comptes ? </html>"
		);
		cardPanel.setVisible(false);
		padPanel.getPadValid().addActionListener(new JButtonListener());
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		
		
	}

	@Override
	public boolean conditionForSuccess() {
		// TODO Auto-generated method stub
		return true;
	}
	public class JButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Etat chooseActionView : Reception de l'action");
			int inputCodeText = Integer.parseInt(padPanel.getInputCode().getText());
			
			switch(inputCodeText)
			{
				case 1:
					nextView = "getMoney";
				break;
			   	case 2:
			   		nextView = "viewAccount";
				break;
			}
			System.out.println("Etat chooseActionView : nextView " + nextView);
			((UserScreenController) controller).setAction(inputCodeText);
		}

		
		
	}
}
