package modelo;

public abstract class animal  {
	
	private String Raza;

	public animal(String raza) {
		Raza = raza;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	
}
