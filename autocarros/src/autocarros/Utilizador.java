package autocarros;

public class Utilizador 
{

	private  String email;
	private int password;

	public Utilizador(String email , int password) 
	{
		this.email=email;
		this.password=password;
		
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String toString() 
	{
		return("Utilizador: email-"+email+", palavara-passe-"+password);
		
	}




}
