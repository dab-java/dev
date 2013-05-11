package view;

import java.util.Observable;

import javax.swing.JLabel;

import model.MainModel;
import controller.UserScreenController;

public class ScreenView extends MainView
{

	private static final long serialVersionUID = -6787750025383445255L;
	private JLabel label;
	
	public ScreenView(MainModel model, UserScreenController controller)
	{
		super(model, controller);
		label = new JLabel();
		this.add(label);
	}
	
	public void setLabelText(String text)
	{
		this.label.setText(text);
		this.repaint();
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
