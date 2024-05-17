package autocarros;

public class Paragens 
{
	private String nomeparag;
	private String  loc;

	public Paragens (String nomeparag, String loc ) 
	{
		this.nomeparag= nomeparag;
		this.loc= loc ; 
		
	}
	public String toString() 
	{
		return ("Nome paragem:"+nomeparag+"Localização:"+loc);
		
	}
	public String getNomeparag() 
	{
		return nomeparag;
	}
	
	
	public String getLoc() 
	{
		return loc;
	}
	
	
	
	
}
