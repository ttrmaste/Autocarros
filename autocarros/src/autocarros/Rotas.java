package autocarros;
import java.util.ArrayList;
public class Rotas
{
	private ArrayList<Paragens>paragens;
	private int tempo; 
	private int horarios; 
	private String nomerota;
	public Rotas (int tempo , int horarios , String nomerota) 
	{
		this.tempo=tempo;
		this.horarios= horarios;
		this.nomerota=nomerota;	
		this.paragens=new ArrayList<>();		
	} 
	
	public void adicionarParagens(Paragens paragem) 
	{
		paragens.add(paragem);
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public int getHorarios() {
		return horarios;
	}

	public void setHorarios(int horarios) {
		this.horarios = horarios;
	}
	
	public ArrayList<Paragens> getParagens()
	{
		return paragens;
	}
	

	public String getNomerota() 
	{
		return nomerota;
	}
	public void setNomerota(String nomerota) 
	{
		this.nomerota= nomerota;
	}


}
