package modelo;

public class Vaca extends animal implements EmiteSonido {

	private String sonido;
	
	public Vaca(String raza, String sonido) {
		super(raza);
		this.sonido = sonido;
	}

	public void emiteSonido (int VecesParaSonar) {
		for(int i=0; i< VecesParaSonar; i++) {
		System.out.println(sonido);
		}
	}
}
