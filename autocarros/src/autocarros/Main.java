package autocarros;

import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	static ArrayList<Autocarros>autocarros= new ArrayList<>();
	static ArrayList<Utilizador>utilizadores= new ArrayList<>();
	static int password;
	static String email;
	public static void main (String [] args) 
	{
	
	
		Utilizador novoutilizador;
		Scanner ler = new Scanner(System.in);
		int opcao;
		do 
		{
			System.out.println("1-Para utilizador\n2-Para administrador.\n 3-Exit");
			opcao=ler.nextInt();

		}while(opcao!=1 && opcao!=2 && opcao!=3 );
		
		switch(opcao) 
		{
		case 1 :
			int choise;
			do 
			{
				System.out.println("1-Criar conta.\n 2-Entrar na conta.");
				choise= ler.nextInt();
			
			}while (choise != 1 && choise !=2);

			switch(choise) 
			{
				
				case 1:
					System.out.println("Qual é o seu email?");
					email=ler.next();
					System.out.println("Qual a sua palavra passe(So pode ter 6 numeros)");
					password = ler.nextInt();
					// e preciso validar ambas das opcoes da passe e do email
					
					novoutilizador= new Utilizador(email,password);
					utilizadores.add(novoutilizador);
					System.out.print("Bem vindo!;"+ email);
				break;
				case 2 :// perguntar a stora qual +e a melhor opcao para fazer o menu do utilzador se com metodo ou com ifs
					System.out.println("Escreva o seu email:");
					email= ler.next();
					System.out.println("Escreva a sua palvra passe:");
					password= ler.nextInt();
					for(Utilizador utilizador: utilizadores) 
					{
						if(utilizador.getEmail().equals(email)&& utilizador.getPassword()== password) 
						{
							System.out.println("Bem vindo:"+email+"!");
							
						}
						else
						{
							System.out.print("Não foi encontrado o seu utilizador por favor se não tiver criado uma conta crie uma nova, se já tiver criado uma por favor volte a tentar");
							
						}
						
					}
					break;
			}
		break;
		case 2:
			int escolha;
			do 
			{
			System.out.println("1- Adicionar um autocarro.\n 2- Adicionar uma rota. \n 3- Adicionar paragens.\n ");
			// falta faze a parte do adm o menu todo e as opcoes todas 
			escolha = ler.nextInt();
			}while(escolha != 1 && escolha != 2 && escolha != 3 );//fazer as restantes opcoes para o adm
			switch(escolha) 
			{
			case 1 :
				
			
			
			
			
			
			
			
			
			
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	}
	
}