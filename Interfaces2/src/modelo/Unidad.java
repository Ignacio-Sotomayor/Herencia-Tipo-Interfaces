package modelo;

public abstract class Unidad implements IPosicionable{

	private int costo;
	private int energia;
	private String equipo;
	private int PosX;
	private int PosY;

	public Unidad(int costo, int energia, String equipo, int PosX, int PosY) {
		this.costo = costo;
		this.energia = energia;
		this.equipo = equipo;
		setPosX(PosX);
		setPosY(PosY);
	}
	

	public int getCosto() {
		return costo;
	}
	

	public void setCosto(int costo) {
		this.costo = costo;
	}
	

	public int getEnergia() {
		return energia;
	}
	

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	
	public String getEquipo() {
		return equipo;
	}
	

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	@Override
	public int getPosX() {
		return this.PosX;}
	@Override
	public int getPosY() {
		return this.PosY;}
	@Override
	public void setPosX(int PosX) {
		this.PosX = PosX;
	}
	@Override
	public void setPosY(int PosY) {
		this.PosY = PosY;
	}
	
	public abstract void recibeDanio(int danio);
	
	
}
