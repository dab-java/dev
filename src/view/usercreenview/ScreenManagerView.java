package view.usercreenview;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Observable;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import com.sun.corba.se.impl.orb.ParserTable.TestContactInfoListFactory;

import view.MainView;

import controller.MainController;
import controller.UserScreenController;

import model.MainModel;

public class ScreenManagerView extends MainView
{

	
	private CardLayout cardPanelLayout;
	private JPanel userScreenPanel;
	
	@SuppressWarnings("unchecked")
	public ScreenManagerView(MainModel model, MainController controller) 
	{
		super(model, controller);
		model.addObserver(this);
				
		userScreenPanel =  new JPanel();
		cardPanelLayout = new CardLayout();
		userScreenPanel.setLayout(cardPanelLayout);
		//Tableau d'écran
		
		AskCodeView askCode = new AskCodeView(model, controller);
		AskCardView askCard = new AskCardView(model, controller);
		chooseActionView chooseAction = new chooseActionView(model, controller);
		ViewAccount viewAccount = new ViewAccount(model, controller);
		GetMoney getMoney = new GetMoney(model, controller);
		AddMoney addMoney = new AddMoney(model, controller);
		EndScreen endScreen = new EndScreen(model, controller);
		
		userScreenPanel.add("askCard", askCard);
		userScreenPanel.add("askCode", askCode);
		userScreenPanel.add("chooseAction", chooseAction);
		userScreenPanel.add("viewAccount", viewAccount);
		userScreenPanel.add("getMoney", getMoney);
		userScreenPanel.add("addMoney", addMoney);
		userScreenPanel.add("endScreen", endScreen);
		
		cardPanelLayout.show(userScreenPanel, "welcome");
		
		
		
		model.addObserver(askCard);
		add(userScreenPanel);
		
		
	}
	public void switchScreen()
	{
		System.out.println("Switch");
		cardPanelLayout.next(userScreenPanel);
		//this.repaint();
		//System.out.println("Switch : " + this.currentJPan.toString());
	}
	@Override
	public void update(Observable o, Object arg) 
	{	System.out.println("ScreenManager : Update");
		 Component c[] = userScreenPanel.getComponents(); // on récupère les vues disponibles dans cardLayout
	      int i = 0;
	      int j = c.length;
	      while (i < j)  
	      {
	        if (c[i].isVisible()) // si c'est cette vue qui est affiché
	        {	
	        	if(((UserAbstractScreen) c[i]).conditionForSuccess()) // on regarde si la condition pour passer à la prochaine vue est respecté
	        	{	
	        		System.out.println("Next view : " + ((UserAbstractScreen) c[i]).getNextView());
	        		if(((UserAbstractScreen) c[i]).nextView != "") // si l'écran à une nextview d'entrée
	        		{
	        			System.out.println("ecran nextView");
	        			cardPanelLayout.show(userScreenPanel, ((UserAbstractScreen) c[i]).getNextView()); // affichage de l'écran
	        			// on récupère son component et on l'ajoute en observer
	        			for(Component component : userScreenPanel.getComponents()) // on récupère son component
	        			{
	        				if(component.isVisible())
	        				{
	        					model.addObserver((UserAbstractScreen)component);
	        					((UserAbstractScreen)component).repaint();
	        					System.out.println("Ajout dynamiquement de l'écran en observer");
	        				}
	        			}
	        		}
	        		else
	        		{
	        			switchScreen();
		        		model.addObserver((UserAbstractScreen) c[i]);
		        		System.out.println(((UserAbstractScreen) c[i]).conditionForSuccess());
	        		}
	        		
	        		 
	        	}
	        	break; 
	        }
	        else
	          i ++;
	      }
		
		
	}
	
	
	

}
