package modelo;
import excepciones.InvalidPasswordException;
import excepciones.InvalidUserException;
import excepciones.InvalidNameException;

public class Prueba {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();

		try {
			u1.setNombre("juan");
			u1.setContrasena(null);
		}
		catch(InvalidNameException e){
			System.out.println(e.getMessage());
			
		}
		catch(InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidUserException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(u1.toString());

	}

}
