package view;

import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JLabel;

import model.MainModel;
import controller.MainController;

public class TicketView extends MainView
{

	private JLabel label;
	private JButton ticketValid;

	public TicketView(MainModel model, MainController controller) {
		super(model, controller);
		// TODO Auto-generated constructor stub
		ticketValid = new JButton("valider");
		this.add(ticketValid);
		
		label = new JLabel("Billet");
		this.add(label);
		
	}
	public void setLabelText(String text)
	{
		this.label.setText(text);
		this.repaint();
	}
	public JButton getTicketValid() {
		return ticketValid;
	}
	public void setTicketValid(JButton padValid) {
		this.ticketValid = padValid;
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
