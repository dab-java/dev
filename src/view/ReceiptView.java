package view;

import java.util.Observable;

import javax.swing.JLabel;

import model.MainModel;
import controller.MainController;

public class ReceiptView extends MainView 
{

	private JLabel label;

	public ReceiptView(MainModel model, MainController controller) {
		super(model, controller);
		// TODO Auto-generated constructor stub
		label = new JLabel("Recue");
		this.add(label);
	}
	
	public void setLabelText(String text)
	{
		this.label.setText(text);
		this.repaint();
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
