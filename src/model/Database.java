package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

import com.sun.java_cup.internal.runtime.Symbol;

public class Database 
{
	private BufferedReader fileReadUser;
	private BufferedWriter fileWriteUser;
	private float currentSoldeUser;
	
	private BufferedReader fileReadDab;
	private BufferedWriter fileWriteDab;
	private float currentSoldeDab;
	
	private DecimalFormat decFormat;
	
	private String dabUrl = "ListAccount/0000.txt";
	private String url;
	
	private String etat = "";
	
	public  Database(String url) 
	{
		this.url = url;
		System.out.println("Database : nouvelle instance avec le compte :" + url);
		NumberFormat.getInstance().setMaximumFractionDigits(3);
		
		
		try 
		{
			fileReadUser = new BufferedReader(new FileReader(new File(url)));
			try 
			{
				if(fileReadUser.ready())
				{
					this.setCurrentSoldeUser(fileReadUser.readLine());
				}
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				System.out.println("Une erreur est apparue lors de l'accès au compte " + url);
				e.printStackTrace();
			}
			
			fileReadDab = new BufferedReader(new FileReader(new File(dabUrl)));
			
			try 
			{
				if(fileReadDab.ready())
				{
					this.setCurrentSoldeDab(fileReadDab.readLine());
				}
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
	}
	public void setCurrentSoldeUser(String currentSolde)
	{
		float setSolde;
		setSolde = Float.parseFloat(currentSolde);
		NumberFormat.getInstance().format(setSolde);
		this.currentSoldeUser = setSolde;
		System.out.println("Nouveau solde User : " + this.currentSoldeUser);
	}
	public void setCurrentSoldeDab(String currentSolde)
	{
		float setSolde;
		setSolde = Float.parseFloat(currentSolde);
		NumberFormat.getInstance().format(setSolde);
		this.currentSoldeDab = setSolde;
		System.out.println("Nouveau solde Dab : " + this.currentSoldeDab);
	}
	
	public void debiter(Float operation)
	{
		
		try 
		{
			if(this.currentSoldeDab < operation)
			{
				System.out.println("Solde sur le Dab insufisant");
				etat = "Solde sur le Dab insufisant";
			}
			else if(this.currentSoldeUser < operation)
			{
				System.out.println("Solde sur le compte User insufisant");
				etat = "Solde sur le compte User insufisant";
	
			}
			else
			{
				this.currentSoldeUser -= operation;
				fileWriteUser = new BufferedWriter(new FileWriter(new File(url), false));
				fileWriteUser.write(Float.toString(this.currentSoldeUser));
				fileWriteUser.flush();
				
				this.currentSoldeDab -= operation;
				fileWriteDab = new BufferedWriter(new FileWriter(new File(dabUrl), false));
				fileWriteDab.write(Float.toString(this.currentSoldeDab));
				fileWriteDab.flush();
				
				etat="Fin de l'opération débiter : Solde User : "  + this.currentSoldeUser;
				System.out.println("Fin de l'opération débiter : \n Solde Dab : " + this.currentSoldeDab + ", Solde User : "  + this.currentSoldeUser);
			}
		
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void crediter(Float operation)
	{
		
		try 
		{			
			this.currentSoldeDab += operation;
			fileWriteDab = new BufferedWriter(new FileWriter(new File(dabUrl), false));
			fileWriteDab.write(Float.toString(this.currentSoldeDab));
			fileWriteDab.flush();
			
			etat= "Fin de l'opération crediter : \n Solde Dab : " + this.currentSoldeDab;
			System.out.println("Fin de l'opération crediter : \n Solde Dab : " + this.currentSoldeDab);		
		
		
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public float getCurrentSoldeUser() {
		return currentSoldeUser;
	}
	public float getCurrentSoldeDab() {
		return currentSoldeDab;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public void close() 
	{
		try 
		{
			this.fileReadDab.close();
			this.fileReadUser.close();
			this.fileWriteDab.close();
			this.fileWriteUser.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Echec de fermeture des objets");
		}
		
	}
	
}
