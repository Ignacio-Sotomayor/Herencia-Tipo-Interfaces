package modelo;

public class Gato extends animal implements EmiteSonido {

	private String sonido;
	
	public Gato(String raza, String sonido) {
		super(raza);
		this.sonido = sonido;
	}

	@Override
	public void emiteSonido (int VecesParaSonar) {
		for(int i=0; i< VecesParaSonar; i++) {
		System.out.println(sonido);
		}
	}
}
