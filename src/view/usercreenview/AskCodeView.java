package view.usercreenview;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import view.MainView;
import view.PadView;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;

public class AskCodeView extends UserAbstractScreen
{

	private JTextField askCode;
	private JLabel labelCode;
	private JLabel labelEtatCode;

	public AskCodeView(MainModel model, MainController controller) 
	{
		super(model, controller);
		// TODO Auto-generated constructor stub
		
		mainPanel.setLabelText("Entrez votre code.");
		cardPanel.setVisible(false);
		padPanel.getPadValid().addActionListener(new JButtonListener());
	}
	
	@Override
	public void update(Observable o, Object arg) 
	{
		System.out.println("Update AskCode, etat du code : " + model.testCode());
		// TODO Auto-generated method stub
		if(!model.testCode())
		{
			mainPanel.setLabelText("Code incorrecte");
		}
		
	}
	
	@Override
	public boolean conditionForSuccess() {
		// TODO Auto-generated method stub
		return model.testCode();
	}
	
	public class JButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(model.getCardUser().equals("0000"))
			{
				nextView = "addMoney";
			}
			// TODO Auto-generated method stub
			System.out.println("Etat AskCodeView : Reception de l'action");
			((UserScreenController) controller).setCode(Integer.parseInt(padPanel.getInputCode().getText()));
		}

		
		
	}

	
}
