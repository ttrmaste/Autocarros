package autocarros;
import java.util.ArrayList;
import java.util.Scanner;
public class GerirRotas {
	private ArrayList<Empressas>empressas;
	private Scanner ler =new Scanner(System.in);
	static String nomeempressa;
	static int contacto;
	static int numident;
	static int matriculas;
	static int lotacao;
	static String nomerota;
	static int horarios;
	static int tempo;
	static String nomeparag;
	static String loc ; 
	
	
	public GerirRotas() 
	{
		this.empressas= new ArrayList<>();
	}

	public void adicionarEmpressas() 
	{
		System.out.println("Escvreva o nome da empressa:");
		nomeempressa= ler.next();
		System.out.println("Escreva o contacto da sua empressa:");
		contacto= ler.nextInt();
		Empressas empressa= new Empressas(nomeempressa,contacto);
		empressas.add(empressa);
		System.out.println("Empressa adicionada!");
	}
	public void adicionarAutocarros() 
	{
		System.out.println("Escreva o numero do autocarro:");
		numident=ler.nextInt();
		System.out.println("Escreva a matricula do autocarro:");
		matriculas=ler.nextInt();
		System.out.println("Escreva a lotaçáo do Autocarros:");
		lotacao= ler.nextInt();
		System.out.println("Escreva o nome da empressa que este autocarro pertence:");
		nomeempressa=ler.next();
		Empressas empressa= getNomeempressa(nomeempressa);
		if(empressa==null) 
		{
			
			System.out.println("Empressa não encontrada");
			
		}		
		Autocarros autocarro= new Autocarros(numident,matriculas,lotacao);
		//falta teminar aqui 
		autocarro.setRotas(getRotaspelonome());// erro devio a faltar acabar 
		empressa.addAutocarros(autocarro);
		System.out.println("Autocarro adicionado com sucesso!");
	}
	
	
	public Empressas getNomeempressa(String nomeempresa) 
	{
		for(Empressas empressa: empressas) 
		{
			if(empressa.getEmpressa().equalsIgnoreCase(nomeempresa)) 
			{
				return empressa;
			}
			
			
		}
		return null;
	}
	
	
	
	public Rotas getRotaspelonome(String x) // Este metodo sera para procur
	{
		System.out.println("Escreva o nome da sua rota: ");
		nomerota=ler.next();
		for(Empressas empressa: empressas) 
		{
			for(Autocarros autocarro: empressa.getAutocarros()) 
			{
				if(autocarro.getRotas()!=null && autocarro.getRotas().getNomerota().equalsIgnoreCase(nomerota))//ver a razao do erro  
				{
					return autocarro.getRotas();// qual o erro da cena 
				}
			}
			
		}
		System.out.println("Rota não encontrada");
		return null; 
		
	}
	public void adicionarRotas() 
	{
		System.out.println("Isira o nome da rota(Esvreva com a primeira paragem da rota e o ultima paragem da rota)");
		nomerota=ler.next();
		System.out.println("Qual o horario desta rota:");
		horarios= ler.nextInt();
		System.out.println("Qual é a duração desta rota : ");
		tempo= ler.nextInt();
		
		Rotas rota = new Rotas(horarios,tempo,nomerota);
		System.out.println("Escreva o nome das paragens que pretende adicionar a esta rota(Escreva um por linha, quando terminar de enserir escreva fim)");
		nomeparag= ler.next();
		System.out.println("Escreva a localizaçao da paragem: ");
		 loc= ler.next();
		while(!nomeparag.equalsIgnoreCase("fim") ) 
		{
			Paragens paragem= new Paragens(nomeparag,loc);
			rota.adicionarParagens(paragem);
			nomeparag=ler.next();
			 loc = ler.next();
		}
		System.out.println("Rota adicionada com sucesso.");
		
	}
	public void mostrarEmpressas() 
	{
		System.out.println("Empressas;");
		for(Empressas empressa: empressas) 
		{
			System.out.println("-"+empressa.getEmpressa());
			
		}
	
	}
	// ainda falta adicionar alguns metodos para terminar a parte do adm da parte do utilizador tambem falta adicionar o resto todo 
	// desde metodos para procurar as loc as rotas os autocarros perguntar as horas etc 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}



