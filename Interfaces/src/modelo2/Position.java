package modelo2;

public class Position implements Movible{
	
	private int PosX;
	private int PosY;
	
	public Position(int PosX, int PosY) {
		this.PosX = PosX;
		this.PosY = PosY;
	}
	
	public void setPosX(int posX) {
		PosX = posX;
	}


	public void setPosY(int posY) {
		PosY = posY;
	}

	
	
	public int getPosX() {
		return PosX;
	}
	public int getPosY() {
		return PosY;
	}

	@Override
	public void mover(int x, int y) {
		PosX += x;
		PosY += y;
		
	}

	@Override
	public double getPosition() {
		double position = Math.sqrt(Math.pow(PosY, 2)*Math.pow(PosX, 2));
		return position;
	}
	
	
	
}