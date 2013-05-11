package view.usercreenview;

import java.awt.Color;
import java.awt.Component;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import model.MainModel;
import controller.MainController;
import controller.UserScreenController;
import view.CardView;
import view.MainView;
import view.PadView;
import view.ReceiptView;
import view.ScreenView;
import view.TicketView;

public abstract class UserAbstractScreen extends MainView<Object>
{
	
	private static final long serialVersionUID = 1L;
	protected JPanel contentPane;
	protected ScreenView mainPanel = null;
	protected PadView padPanel= null;
	protected CardView cardPanel = null;
	protected ReceiptView receiptPanel = null;
	protected TicketView ticketPanel = null;
	
	
	public String nextView = ""; 
	public UserAbstractScreen(MainModel model, MainController controller)
	{
		super(model, controller);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.add(contentPane);
		
		
		mainPanel = new ScreenView(model, (UserScreenController) controller);
		
		padPanel = new PadView(model, (UserScreenController) controller);
		padPanel.setBackground(new Color(176, 224, 230));
		
		cardPanel = new CardView(model, controller);
		cardPanel.setBackground(new Color(176, 224, 230));
		
		ticketPanel= new TicketView(model, controller);
		ticketPanel.setBackground(new Color(176, 224, 230));
		
		receiptPanel = new ReceiptView(model, controller);
		receiptPanel.setBackground(new Color(176, 224, 230));
		/////////////////////////////
		//Généré par Windows builder
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
		.addGroup(gl_contentPane.createSequentialGroup()
		.addContainerGap()
		.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(padPanel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
					.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
			.addGroup(gl_contentPane.createSequentialGroup()
				.addComponent(ticketPanel, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(receiptPanel, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
		.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
		gl_contentPane.createParallelGroup(Alignment.LEADING)
		.addGroup(gl_contentPane.createSequentialGroup()
		.addContainerGap()
		.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
			.addGroup(gl_contentPane.createSequentialGroup()
				.addComponent(padPanel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(cardPanel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
			.addComponent(mainPanel, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
		.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
			.addComponent(ticketPanel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
			.addComponent(receiptPanel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
		.addContainerGap())
		);
		//Généré par windows Builder
		///////////////////////////////




		contentPane.setLayout(gl_contentPane);

	}
	protected String getNextView() {
		return nextView;
	}

	protected void setNextView(String nextView) {
		this.nextView = nextView;
	}

	public abstract boolean conditionForSuccess();

	
}
