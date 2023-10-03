package Excepciones;

public class InvalidDepoException extends Exception {

	private double cantidadInvalidad;
	
	public InvalidDepoException(String arg0,double cantidadInvalida){
		super(arg0);
		this.cantidadInvalidad = cantidadInvalida;
	}
	
	public double getCantidadInvalidad(){
		return this.cantidadInvalidad;
	}
	
}
