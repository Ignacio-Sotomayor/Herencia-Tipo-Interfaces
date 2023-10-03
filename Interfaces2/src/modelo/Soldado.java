package modelo;

public class Soldado extends Personaje implements IHostil {

	public Soldado( String equipo, int PosX, int PosY) {
		super(100, 500, equipo, PosX, PosY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidad Adversario) {
		Adversario.recibeDanio(50);
	}

	@Override
	public void recibeDanio(int danio) {
		int remanente = super.getEnergia()- danio;
		super.setEnergia(remanente);
	}

}
