package modelo;

public abstract class Vehiculo implements EmiteSonido {

	private String patente;
	private String numeroChasis;
	private String numeroMotor;
	
	
	
	public Vehiculo(String patente, String numeroChasis, String numeroMotor) {
		this.patente = patente;
		this.numeroChasis = numeroChasis;
		this.numeroMotor = numeroMotor;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getNumeroChasis() {
		return numeroChasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public String getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	
	
}
