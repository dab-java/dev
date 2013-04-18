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

public class MainWindowView extends JFrame {
	
	/*
	 * Variables de classe
	 */

	private JPanel contentPane;
	
	private JPanel mainFrame;
	private JPanel padFrame;
	private JPanel cardFrame;
	private JPanel ticketFrame;
	private JPanel receiptFrame;
	
	JLabel lblBillet = new JLabel("Billet");
	JLabel lblEditeurRecu = new JLabel("Fente reçu");
	JLabel lblLecteurCarte = new JLabel("Fente pour CB");
	JLabel lblPad = new JLabel("Pavé numérique");
	JLabel lblScreenPrincipale = new JLabel("Ecran DAB");
	
	/**
	 * Méthodes de classe
	 */
	
	public MainWindowView() {
		setTitle("Projet DAB"); // nom de l'applet
		//setBackground(Color.BLACK);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 502); // emplacement de l'applet à 100px h/v avec une fenêtre de 658*502
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane); // affichage du container
		
		/**
		 * Attribution des couleurs pour les différentes zones du DAB
		 */
		
		mainFrame = new JPanel();
		mainFrame.setBackground(new Color(0, 224, 230));
		mainFrame.setToolTipText("Ecran DAB");
		
		padFrame = new JPanel();
		padFrame.setBackground(new Color(176, 0, 230));
		
		cardFrame = new JPanel();
		cardFrame.setBackground(new Color(176, 224, 0));
		
		ticketFrame = new JPanel();
		ticketFrame.setBackground(new Color(255, 224, 230));
		
		receiptFrame = new JPanel();
		receiptFrame.setBackground(new Color(176, 255, 230));
		
		/**
		 *  Instanciation d'un Group Layout pour l'interface graphique
		 */
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		
		/**
		 * Positionnement horizonatal des Layouts
		 */
		
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
		
		/**
		 * Positionnement vertical des Layouts
		 */
		
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
		
		/**
		 * Instanciation des labels pour l'interface
		 */
		
		lblBillet.setFont(new Font("Calibri", Font.PLAIN, 18));
		ticketFrame.add(lblBillet);
		
		lblEditeurRecu.setFont(new Font("Calibri", Font.PLAIN, 18));
		receiptFrame.add(lblEditeurRecu);
		
		lblLecteurCarte.setFont(new Font("Calibri", Font.PLAIN, 18));
		cardFrame.add(lblLecteurCarte);
		
		lblPad.setFont(new Font("Calibri", Font.PLAIN, 18));
		padFrame.add(lblPad);
		
		lblScreenPrincipale.setFont(new Font("Calibri", Font.PLAIN, 18));
		mainFrame.add(lblScreenPrincipale);
		contentPane.setLayout(gl_contentPane);		
	}
}
