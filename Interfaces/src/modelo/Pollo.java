package modelo;

public class Pollo extends animal implements EmiteSonido {

	private String sonido;
	
	public Pollo(String raza, String sonido) {
		super(raza);
		this.sonido = sonido;
	}

	
	public void emiteSonido (int VecesParaSonar) {
		for(int i=0; i< VecesParaSonar; i++) {
		System.out.println(sonido);
		}
	}

}
