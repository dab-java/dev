package controller;

import view.usercreenview.ScreenManagerView;
import model.MainModel;

public class UserScreenController extends MainController
{
	private int code;
	ScreenManagerView mainScreen = null;
	public UserScreenController(MainModel model) 
	{
		super(model);
		// TODO Auto-generated constructor stub
	}
	public void setMainScreen(ScreenManagerView userScreenView) 
	{
		mainScreen = userScreenView;
		
	}
	
	public void setCode(int code)
	{
			System.out.println("Controller : Réception du code : " + code);	
			model.setCodeUser(code);
		
		
	}
	public void setCardUser(String user, int code)
	{
		System.out.println("Controller : Réception de la carte : " + user);
		model.setCardUser(user, code); 
		
	}
	public void setAction(int numAction) 
	{	
		System.out.println("Controller : Réception de l'action  " +  numAction);
		model.updateModel();
			
	}
	public void debiterMoney(String text) 
	{
		// TODO Auto-generated method stub
		model.debiterMoney(Float.parseFloat(text));
	}
	public void addMoney(String text) 
	{
		// TODO Auto-generated method stub
		model.crediterMoney(Float.parseFloat(text));
		
	}
	public void returnWelcome() 
	{
		// TODO Auto-generated method stub
		model.updateModel();
	}
		
		
}
		
	
	
	

