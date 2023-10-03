package Modelo;


import Excepciones.InvalidExtractionException;

import java.time.Instant;

import Excepciones.InvalidDepoException;

public class CuentaBancaria {

	private static CuentaBancaria cuenta;
	private String titular;
	private double saldo = 0;
	
	private CuentaBancaria(String titular) {
		this.titular = titular;
	}

	public static CuentaBancaria getCuenta(){
		
		if(cuenta == null) 
		cuenta = new CuentaBancaria("TU CUENTA") ;
		
		return cuenta;
		
	}
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void extraer(double extraccion) throws InvalidExtractionException{
		if(extraccion <=0 ) {
			throw new InvalidExtractionException("La extraccion no puede ser menor 0",extraccion, saldo);
		}else if(extraccion>saldo){
			throw new InvalidExtractionException("La extraccion no puede ser mayor al saldo",extraccion, saldo);
		}else { 
			saldo-= extraccion;
			System.out.println("La extraccion se realizo correctamente, actualmente tienes "+this.getSaldo());
		}
	}
	public void depositar(double deposito) throws InvalidDepoException {
		if(deposito< 0 ) {
			throw new InvalidDepoException("El deposito no puede ser menor a 0",deposito);
			}else {
				saldo+= deposito;
				System.out.println("El deposito fue realizado correctamente, actulamente tienes " + this.getSaldo());
			}

	}
	
	
}
