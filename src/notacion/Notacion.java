package notacion;

import Simbolo.Simbolos;
import pilacola.ColaLista;
import pilacola.PilaLista;

public class Notacion {
	
	public ColaLista<String>  convertirPostfija(String infija) throws Exception{
		ColaLista<String> colaPostfija = new ColaLista<>();
		PilaLista<String> pila = new PilaLista<>();
		
		for(char letra_char: infija.toCharArray()){
			String letra = String.valueOf(letra_char);
			
			if(letra.equals("(")){
				pila.push(letra);
			}else{
				if(letra.equals(")")){
					while(!pila.peek().equals("(")){
						colaPostfija.push(pila.peek());
						
					}
					pila.pop();
				}else{
					if(Simbolos.isOperando(letra)){
						colaPostfija.push(letra);
					}else{
						while(!pila.vacia() && Simbolos.menorIgualQue(letra, pila.peek()) && !pila.peek().equals("(")){
							colaPostfija.push(pila.pop());
						}
						pila.push(letra);
					}
				}
				
			}
			
			
		}
		while(!pila.vacia()){
			colaPostfija.push(pila.pop());
		}
		
		
		return colaPostfija;
	}
}
