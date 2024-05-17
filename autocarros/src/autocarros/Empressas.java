package autocarros;
import java.util.Scanner; 
import java.util.ArrayList;
public class Empressas 
{
	private String nomeempressa;
	private int contacto;
	private ArrayList<Autocarros> autocarros;


	public Empressas (String nomeempressa, int contacto) 
	{
		
		this.nomeempressa= nomeempressa;
		this.contacto= contacto;
		this.autocarros= new ArrayList<>();
		
	}


	public String getEmpressa() {
		return nomeempressa;
	}


	public void setEmpressa(String nomeempressa) {
		this.nomeempressa = nomeempressa;
	}


	public int getContacto() {
		return contacto;
	}


	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public ArrayList<Autocarros> getAutocarros()
	{
		
		return autocarros;
		
	}


	public void setAutocarros(ArrayList<Autocarros> autocarros) {
		this.autocarros = autocarros;
	}

	public void addAutocarros(Autocarros autocarro) 
	{
		autocarros.add(autocarro);
	}
	
	
	
}
