package GUI;

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
import java.awt.Font;
import java.awt.Window.Type;

public class MainWindowView extends JFrame 
{

	private JPanel contentPane;
	
	private JPanel mainFrame;
	private JPanel padFrame;
	private JPanel cardFrame;
	private JPanel ticketFrame;
	private JPanel receiptFrame;
	/**
	 * Create the frame.
	 */
	public MainWindowView() {
		setTitle("Projet DAB");
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		mainFrame = new JPanel();
		mainFrame.setBackground(new Color(176, 224, 230));
		mainFrame.setToolTipText("Screen principale");
		
		padFrame = new JPanel();
		padFrame.setBackground(new Color(176, 224, 230));
		
		cardFrame = new JPanel();
		cardFrame.setBackground(new Color(176, 224, 230));
		
		ticketFrame = new JPanel();
		ticketFrame.setBackground(new Color(176, 224, 230));
		
		receiptFrame = new JPanel();
		receiptFrame.setBackground(new Color(176, 224, 230));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(mainFrame, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(padFrame, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
								.addComponent(cardFrame, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(ticketFrame, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(receiptFrame, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(padFrame, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(cardFrame, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addComponent(mainFrame, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(ticketFrame, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(receiptFrame, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		/** Mettre ces JLabel en haut */
		
		JLabel lblBillet = new JLabel("Billet");
		lblBillet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ticketFrame.add(lblBillet);
		
		JLabel lblEditeurRecu = new JLabel("Editeur recu");
		lblEditeurRecu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		receiptFrame.add(lblEditeurRecu);
		
		JLabel lblLecteurCarte = new JLabel("Lecteur Carte");
		lblLecteurCarte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cardFrame.add(lblLecteurCarte);
		
		JLabel lblPad = new JLabel("Pad");
		lblPad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		padFrame.add(lblPad);
		
		JLabel lblScreenPrincipale = new JLabel("Screen principale");
		lblScreenPrincipale.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mainFrame.add(lblScreenPrincipale);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
