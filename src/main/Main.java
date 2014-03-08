package main;

import notacion.Notacion;
import pilacola.ColaLista;
import pilacola.PilaLista;

public class Main {
	public static void main(String[] args) {
		
		pruebaConvertirPostfija();
		//pruebaPila();
	}
	
	
	public static void pruebaPila(){
		
			
			
			try {
				PilaLista<String> pila = new PilaLista<>();
				pila.push("1");
				pila.push("2");
				pila.push("3");
				pila.mostrar();
				System.out.println("Pop" + pila.pop());
				System.out.println("Pop" + pila.pop());
				pila.mostrar();
				System.out.println("Peek" +pila.peek());
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	public static void pruebaCola(){
		
		try {
			ColaLista<String> cola = new ColaLista<>();
			cola.push("1");
			cola.push("2");
			cola.push("3");
			System.out.println("pop: " +cola.pop());
			cola.mostrar();
			System.out.println("pop: " +cola.pop());
			System.out.println("pop: " +cola.pop());
			
			
			cola.mostrar();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void pruebaConvertirPostfija(){
		
		
		
			Notacion notacion = new Notacion();
			try {
				System.out.println(notacion.convertirPostfija("2+5*6"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}