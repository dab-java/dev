package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import view.usercreenview.ScreenManagerView;

public class MainModel extends Observable
{
	private ScreenManagerView mainScreen;
	
	private int codeUser;
	private String cardUser;
	private String user = "";
	private Database instanceAccount;
	public Database getInstanceAccount() {
		return instanceAccount;
	}
	public void setInstanceAccount(Database instanceAccount) {
		this.instanceAccount = instanceAccount;
	}
	private int code = 0;
	

	public void setCodeUser(int code)
	{
		codeUser= code;
		System.out.println(this.countObservers());
		setChanged();
		notifyObservers();
		
	}
	public void setCode(int code) 
	{
		codeUser=code;
	}
	public boolean testCode()
	{
		return (codeUser == code)?true:false;
	}
	

	public String getCardUser()
	{
		return cardUser;
	}
	public void setCardUser(String user, int code) 
	{
		// TODO Auto-generated method stub
		cardUser = user;
		this.code = code;
		instanceAccount = new Database("ListAccount/" + user + ".txt");
		setChanged();
		notifyObservers();
	}
	public int getCode()
	{
		return this.code;
	}
	public ScreenManagerView getMainScreen() 
	{
		return mainScreen;
	}

	public void setMainScreen(ScreenManagerView mainScreen) 
	{
		this.mainScreen = mainScreen;
	}

	public void setUserByCard(String user) 
	{
		// TODO Auto-generated method stub
		this.user = user;
		setChanged();
		notifyObservers();
	}
	public String getUserByCard()
	{
		return user;
	}
	public void updateModel() 
	{	
		setChanged();
		notifyObservers();
		
	}
	public float getSolde()
	{
		return instanceAccount.getCurrentSoldeUser();
	}
	public void debiterMoney(float money)
	{
		instanceAccount.debiter(money);
		setChanged();
		notifyObservers();
	}
	public void crediterMoney(float money)
	{
		instanceAccount.crediter(money);
		setChanged();
		notifyObservers();
	}
	
}
