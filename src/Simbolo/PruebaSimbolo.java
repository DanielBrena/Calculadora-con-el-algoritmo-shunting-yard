package Simbolo;

public class PruebaSimbolo {
	public  static void main(String[] args){
		Simbolo potencia = new Simbolo("^");
		Simbolo menos = new Simbolo("-");
		
		
		System.out.println(potencia.mayorQue(menos.getSimbolo()));
	}
}
