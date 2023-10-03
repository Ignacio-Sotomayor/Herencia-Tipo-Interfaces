package modelo;

public class Test {

	public static void main(String[] args) {
		
		Perro Rufus = new Perro("Dobberman", "Guau");
		Gato Negrito = new Gato("Negro", "Miau");
		Pollo Amarillito = new Pollo("Pollo", "Pio Pio");
		Vaca Lola = new Vaca("Vaca", "Muuu");
		Ambulancia Ambu = new Ambulancia("AA 000 AA","244en","deaes54","Sirena Sonando");
		
		Rufus.emiteSonido(1);
		Lola.emiteSonido(1);
		Negrito.emiteSonido(1);
		Amarillito.emiteSonido(1);
		Ambu.emiteSonido(1);

	}

}
