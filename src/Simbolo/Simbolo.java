package Simbolo;


public class Simbolo {
	
	
	
	private String simbolo;
	private Tipo tipo;
	private Integer prioridad;
	
	public Simbolo(String simbolo, Tipo tipo, Integer prioridad){
		this.simbolo = simbolo;
		this.tipo = tipo;
		this.prioridad = prioridad;
	}
	
	public Simbolo(String simbolo){
		this.simbolo = simbolo;
		switch(simbolo){
		case "^":
			this.tipo = Tipo.OPERADOR;
			this.prioridad = -1;
		break;
				
		case "*": 
			this.tipo = Tipo.OPERADOR;
			this.prioridad = -2;
			break;
		
		
		case "/":
			this.tipo = Tipo.OPERADOR;
			this.prioridad = -2;
			break;
			
		case "+":
			this.tipo = Tipo.OPERADOR;
			this.prioridad = -3;
			break;
			
		case "-":
			this.tipo = Tipo.OPERADOR;
			this.prioridad = -3;
			break;
			
		case "(":
			this.tipo = Tipo.OPERADOR;
			this.prioridad = 0;
			break;
			
		case ")":
			this.tipo = Tipo.OPERADOR;
			this.prioridad = 0;
			break;
			
		}
			
	}
	
	@Override
	public boolean equals(Object obj){
	
		return (this.simbolo.equals(((Simbolo)obj).simbolo));
	}
	
	public boolean mayorQue(String simbolo){
		return this.getPrioridad() > new Simbolo(simbolo).getPrioridad();
	}
	public boolean menorQue(String simbolo){
		return this.getPrioridad() <  new Simbolo(simbolo).getPrioridad();
	}
	public boolean mayorIgualQue(String simbolo){
		return this.getPrioridad() >= new Simbolo(simbolo).getPrioridad();
	}
	
	public boolean menorIgualQue(String simbolo){
		return this.getPrioridad() <= new Simbolo(simbolo).getPrioridad();
	}
	
	
	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}
	
	
	
	
	
	
	
}
