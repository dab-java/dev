package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;




import model.MainModel;

import controller.MainController;

import controller.UserScreenController;

public class CardView extends MainView
{

	private JLabel labelInsertCard;
	private JTextField inputCard;
	private JButton padValid;
	private  Card currentCard = null;
	public CardView(MainModel model, MainController controller) {
		super(model, controller);
		// TODO Auto-generated constructor stub
		labelInsertCard = new JLabel("Entrez votre carte : ");
		labelInsertCard.setHorizontalAlignment(SwingConstants.CENTER);
		
		inputCard = new JTextField();
		padValid = new JButton("Valider");
		JPanel panCenter = new JPanel();
		panCenter.setLayout(new GridLayout(2, 1));
		panCenter.add(labelInsertCard);
		panCenter.add(inputCard);
		this.add(panCenter, BorderLayout.CENTER);
		
		
		this.add(padValid, BorderLayout.SOUTH);
		
		//padValid.addActionListener(new JButtonListener());
	}
	public JButton getPadValid() {
		return padValid;
	}

	public JTextField getInputCard() {
		return inputCard;
	}
	public void setInputCard(JTextField inputCard) {
		this.inputCard = inputCard;
	}
	public void setPadValid(JButton padValid) {
		this.padValid = padValid;
	}
	@Override
	public void update(Observable o, Object arg) 
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
}	
