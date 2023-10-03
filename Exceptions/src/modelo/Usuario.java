package modelo;

import excepciones.InvalidUserException;
import excepciones.InvalidNameException;
import excepciones.InvalidPasswordException;

public class Usuario {

	private String nombre;
	private String contrasena;

	public Usuario(String nombre, String contasena) throws InvalidUserException {
		setNombre(nombre);
		setContrasena(contrasena);
	}

	public Usuario() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setNombre(String nombre) throws InvalidNameException {

		if (nombre == null || nombre == "") {
			throw new InvalidNameException("El nombre no puede estar vacio");
		} else {
			this.nombre = nombre;
		}

	}

	public void setContrasena(String contrasena) throws InvalidPasswordException {

		if (contrasena == null) {
			throw new InvalidPasswordException("La contraseña no puede estar vacio");
		} else if (contrasena.length() < 6) {
			throw new InvalidPasswordException("La contraseña debe tener mas de 6 caracteres");
		} else {
			char FirstChar = contrasena.charAt(0);
			if (!Character.isLetter(FirstChar)) {
				throw new InvalidPasswordException("La contraseña debe de empezar con una letra");
			} else {
				this.contrasena = contrasena;
			}
		}
	}

	@Override
	public String toString() {
		return "Su nombre es: " + nombre + ", su contraseña es: " + contrasena;
	}

}
