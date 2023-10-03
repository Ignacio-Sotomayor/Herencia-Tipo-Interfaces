package modelo;

public class Ambulancia  extends Vehiculo{

	public String sonido;

	public Ambulancia(String patente, String numeroChasis, String numeroMotor, String sonido) {
		super(patente, numeroChasis, numeroMotor);
		this.sonido = sonido;
	}

	@Override
	public void emiteSonido(int VecesParaSonar) {
		for(int i=0; i< VecesParaSonar; i++) {
		System.out.println(sonido);
		}
	}

}
