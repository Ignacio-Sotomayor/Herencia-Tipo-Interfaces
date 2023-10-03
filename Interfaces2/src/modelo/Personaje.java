package modelo;

public abstract class Personaje extends Unidad implements IMovible {

	public Personaje(int costo, int energia, String equipo, int PosX, int PosY) {
		super(costo, energia, equipo, PosX, PosY);
	}

	@Override
	public void mover(int x, int y) {
		int posX = super.getPosX();
		int posY = super.getPosY();
		
		posX += x;
		posY += y;
		
		super.setPosY(posY);
		super.setPosX(posX);
		
	}
}
