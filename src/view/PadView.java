package view;

import java.awt.Font;
import java.util.Observable;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.MainModel;
import controller.MainController;

import controller.UserScreenController;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * extends MainView who Implements Observable.
 * So PadPanel must implement update method
 */
/**
 * @author Guillaume.Cornet
 * @param <PadController>
 *
 */
public class PadView extends MainView
{
	JLabel labelCode = null;
	JLabel lblPad = null;
	JTextField inputCode = null;
	JButton padValid = null;
	public PadView(MainModel model, UserScreenController controller) 
	{
		super(model, controller);
		setLayout(new BorderLayout(0, 0));
		
		lblPad = new JLabel("Pad");
		lblPad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(lblPad, BorderLayout.NORTH);
		// TODO Auto-generated constructor stub
		labelCode = new JLabel("Entrez votre choix : ");
		labelCode.setHorizontalAlignment(SwingConstants.CENTER);
	
		inputCode = new JTextField();
		
		padValid = new JButton("valider");
		JPanel panCenter = new JPanel();
		panCenter.setLayout(new GridLayout(2, 1));
		panCenter.add(labelCode);
		panCenter.add(inputCode);
		this.add(panCenter, BorderLayout.CENTER);
		this.add(padValid, BorderLayout.SOUTH);
		
		
		
		
	}
	
	public JTextField getInputCode() {
		return inputCode;
	}

	public void setInputCode(JTextField inputCode) {
		this.inputCode = inputCode;
	}

	public JButton getPadValid() {
		return padValid;
	}

	public void setPadValid(JButton padValid) {
		this.padValid = padValid;
	}

	public void setInputCode(String str)
	{
		labelCode.setText(str);
	}
	
	
	@Override
	public void update(Observable o, Object arg) 
	{
		
		
	}

}
