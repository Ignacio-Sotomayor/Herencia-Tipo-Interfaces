package Excepciones;

public class InvalidExtractionException extends Exception {

	private double datoExtraccion;
	private double saldo;
	
	public InvalidExtractionException(String arg0,double datoExtraccion, double saldo) {
		super(arg0);
		this.datoExtraccion = datoExtraccion;
		this.saldo = saldo;
	}

	public double getDatoExtraccion() {
		return datoExtraccion;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
