package Simbolo;

public class Simbolos {
	public static Simbolo[] simbolos = {
		 new Simbolo("("),
	        new Simbolo(")"),
	        new Simbolo("^"),
	        new Simbolo("*"),
	        new Simbolo("/"),
	        new Simbolo("+"),
	        new Simbolo("-")
	};
	
	public static boolean mayorIgualQue(String simbolo1, String simbolo2){
		return new Simbolo(simbolo1).mayorIgualQue(simbolo2);
	}
	
	public static boolean menorIgualQue(String simbolo1, String simbolo2){
		return new Simbolo(simbolo1).menorIgualQue(simbolo2);
	}
	
	public static boolean mayorQue(String simbolo1, String simbolo2){
		return new Simbolo(simbolo1).mayorQue(simbolo2);
	}
	
	public static boolean menorQue(String simbolo1, String simbolo2){
		return new Simbolo(simbolo1).menorQue(simbolo2);
	}
	
	public static boolean isOperando(String simbolo){
		return !(contains(simbolos, new Simbolo(simbolo)));
	}
	
	public static boolean isOperador(String simbolo){
		return (contains(simbolos, new Simbolo(simbolo)));
	}
	
	private static boolean contains(Simbolo[] arreglo, Simbolo simbolo){
		boolean esta = false;
		for(Simbolo simb: arreglo){
			if(simb.equals(simbolo)){
				esta = true;
				break;
			}
		}
		
		return esta;
	}
	
}
