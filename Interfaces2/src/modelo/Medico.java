package modelo;

public class Medico extends Personaje {

	public Medico( String equipo, int PosX, int PosY) {
		super(40, 100, equipo, PosX, PosY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void recibeDanio(int danio) {
		int remanente = super.getEnergia() - (danio + danio/2);
		super.setEnergia(remanente);

	}

}
