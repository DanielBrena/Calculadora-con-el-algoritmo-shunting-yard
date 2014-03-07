package pilacola;

import excepcion.ListaException;

import listasLigadas.Lista;
public class PilaLista <T> {
	
	Lista<T> lista = new Lista<>();
	
	public void push(T dato){
		this.lista.insertarInicio(dato);
		
	}
	
	public T pop() throws Exception{
		try{
			return this.lista.obtenerPrimero();
		}catch(Exception e){
			throw new Exception("Lista vacia");
		}
		
		
	}
	
	public T peek() throws Exception{
		try{
			return this.lista.obtenerPrimeroSinELiminar();
		}catch(Exception e){
			throw new Exception("Lista vacia");
		}
	} 
	
	public boolean vacia(){
		return this.lista.getP() == null;
	}
	
	public void mostrar(){
		this.lista.mostrarLista();
	}
	
}
