package view.usercreenview;

import java.util.Observable;

import javax.swing.JLabel;

import view.MainView;

import model.MainModel;
import controller.MainController;

public class WelcomeView extends UserAbstractScreen
{

	private JLabel labelUser;
	
	public WelcomeView(MainModel model, MainController controller) 
	{
		super(model, controller);
		// TODO Auto-generated constructor stub
		labelUser = new JLabel("Bienvenue");
		this.add(labelUser);
	}

	@Override
	public void update(Observable arg0, Object arg1) 
	{
		System.out.println("Action sur welcomeView");
	}

	@Override
	public boolean conditionForSuccess() {
		
		return true;
	}
	
}
