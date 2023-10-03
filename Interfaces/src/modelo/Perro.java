package modelo;

public class Perro extends animal implements EmiteSonido {

	private String sonido;
	
	public Perro(String raza, String sonido) {
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
