package view;

public class Card 
{
	private String numero;
	private int code = 0;

	public Card(String numero)
	{
		this.numero = numero;
		switch(numero)
		{
		 case "1234" :
		 	code = 1111;
		break;
		 case "5678" :
			 	code = 2222;
		break;
		 case "9ABC" :
			 	code = 3333;
		break;
		case "0000" :
			 	code = 4444;
		break;
		default:
			System.out.println("Numero inconnu");
		break;
		}
	
		
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
