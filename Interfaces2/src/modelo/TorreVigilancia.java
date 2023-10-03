package modelo;

public class TorreVigilancia extends Construcciones implements IHostil {

	public TorreVigilancia( String equipo, int PosX, int PosY) {
		super(200, 2000, equipo, PosX, PosY, 40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Unidad Adversario) {
		Adversario.recibeDanio(10);
	}

	@Override
	public void recibeDanio(int danio) {
		int remanente = super.getEnergia()- danio;
		super.setEnergia(remanente);
	}

}
