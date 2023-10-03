package Prueba;

import Excepciones.InvalidDepoException;
import Excepciones.InvalidExtractionException;
import Modelo.CuentaBancaria;

public class Test {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta = CuentaBancaria.getCuenta();
		
		try {
			cuenta.depositar(100);
		} catch (InvalidDepoException e) {
			System.out.println(e.getMessage());
		}
		 try {
			cuenta.extraer(50);
		} catch (InvalidExtractionException e) {
			System.out.println(e.getMessage());
		}
		 try {
			cuenta.depositar(-1);
		} catch (InvalidDepoException e) {
			System.out.println(e.getMessage());
		}
		 try {
			cuenta.extraer(100);
		} catch (InvalidExtractionException e) {
			System.out.println(e.getMessage());
		}
		 try {
			cuenta.extraer(-200);
		} catch (InvalidExtractionException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
