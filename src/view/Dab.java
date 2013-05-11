 package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;

import sun.awt.WindowClosingListener;
import view.usercreenview.ScreenManagerView;

import controller.*;

import model.MainModel;

import java.awt.Font;
import java.awt.Window.Type;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 * Represent the DAB
 */
/**
 * @author Guillaume.Cornet
 *
 */
public class Dab extends JFrame
{

	private JPanel contentPane;
	
	private ScreenManagerView mainPanel;
	/**
	 * Create the frame.
	 */
	public Dab(MainModel model) 
	{
		setTitle("Projet DAB");
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 502);
		
		UserScreenController controller = new UserScreenController(model);
		mainPanel = new ScreenManagerView(model, controller);
		mainPanel.setToolTipText("Screen principale");
		
		this.add(mainPanel);
		
	}	
	
}
