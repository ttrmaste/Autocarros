package autocarros;
import java.util.ArrayList;
public class Autocarros {

 private int numident;
 private int matriculas;
 private int lotacao;
 private Rotas  rotas;


 public Autocarros(int numident,int matriculas,int lotacao ) 
 {
	 
	 this.numident=numident;
	 this.matriculas=matriculas;
	 this.lotacao=lotacao;
	 this.rotas= null;
	 
	 
 }



public int getNumident() {
	return numident;
}



public void setNumident(int numident) {
	this.numident = numident;
}



public int getMatriculas() {
	return matriculas;
}



public void setMatriculas(int matriculas) {
	this.matriculas = matriculas;
}



public int getLotacao() {
	return lotacao;
}



public void setLotacao(int lotacao) {
	this.lotacao = lotacao;
}



public Rotas getRotas() {
	return rotas;
}



public void setRotas(Rotas rotas) {
	this.rotas = rotas;
}	







}
