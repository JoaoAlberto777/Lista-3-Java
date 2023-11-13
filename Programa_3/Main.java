package Java;

public class Main {

	public static void main(String[] args) {
		Casa C = new Casa();
		
		C.pinta("Azul");
		C.p1.abre();
		C.p2.abre();
		C.p3.abre();
		C.p3.fecha();
		C.pinta("Verde");
		C.p2.abre();
		C.p3.abre();
		System.out.println("Numero de portas abertas: " + C.quantasPortasEstaoAbertas()); 

	}

}
