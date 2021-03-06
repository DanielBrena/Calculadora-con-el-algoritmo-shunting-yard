package pilacola;

import nodos.Nodo;
import excepcion.ListaException;
import listasLigadas.Lista;
public class ColaLista<T> {
	
	private Lista<T> lista = new Lista<>();
	
	public void push(T dato){
		this.lista.insertarInicio(dato);
	}
	
	public T pop() throws Exception{
		try{
			return this.lista.obtenerUltimo();
		}catch(Exception e){
			throw new Exception("Lista vacia");
		}
		
	}
	
	public T peek() throws Exception{
		try{
			return this.lista.obtenerUltimoSinEliminar();
		}catch(Exception e){
			throw new Exception("Lista vacia");
		}
		
	}
	
	public void mostrar(){
		this.lista.mostrarLista();
	}
	
	public boolean vacia(){
		return this.lista.getP() == null;
	}
	
	public String toString(){
		String resultado = "";
		
		Nodo<T> aux = lista.invierteLista(lista).getP();
		while(aux != null){
			resultado = resultado + aux.getValor().toString();
			aux = aux.getLiga();
		}
		return resultado;
	}
}
