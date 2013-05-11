package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import controller.MainController;

import model.MainModel;

/**
 * Main view, represent the Ticket dispenser
 */
/**
 * @author Guillaume.Cornet
 *
 */

public abstract class MainView<T> extends JPanel implements Observer
{
	
	protected MainModel model;
	protected T controller;
	public MainView(MainModel model, T controller) 
	{
		this.model = model;
		this.controller = controller;
		
	}
	public MainView() 
	{	
		
	}
	
}
