package modelo;

public abstract class Construcciones extends Unidad implements IConstruible {

	private int tiempoConstruccion;
	
	public Construcciones(int costo, int energia, String equipo, int PosX, int PosY, int tiempoConstruccion) {
		super(costo, energia, equipo, PosX, PosY);
		this.tiempoConstruccion = tiempoConstruccion; 
	}

	@Override
	public int getTiempoConstruccion() {
		return this.tiempoConstruccion;
	}
	
}
