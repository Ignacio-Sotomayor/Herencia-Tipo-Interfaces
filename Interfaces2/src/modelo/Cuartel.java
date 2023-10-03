package modelo;

public class Cuartel extends Construcciones {

	public Cuartel( String equipo, int PosX, int PosY) {
		super(500, 3000, equipo, PosX, PosY, 60);
	}

	@Override
	public void recibeDanio(int danio) {
		int remanente = super.getEnergia()- danio/2;
		super.setEnergia(remanente);

	}

}
