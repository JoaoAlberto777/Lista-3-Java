package Java;

public class pT {

	public static void main(String[] args) {
		Portas p1 = new Portas();
		//Porta p2 = new Porta();
		//Porta p3 = new Porta();
		p1.abre();
		p1.abre();
		p1.fecha();
		p1.abre();
		p1.pintar("Azul");
		System.out.println("A porta está aberta? " + (p1.estaAberta() ? "Sim" : "Não"));
		p1.pintar("Verde");
		p1.abre();
		p1.fecha();
		p1.dimensaoX = 1;
		p1.dimensaoY = 2;
		p1.dimensaoZ = 0.5f;
		p1.pintar("Roxa");
		System.out.println("A porta está aberta? " + (p1.estaAberta() ? "Sim" : "Não"));
		

		
	}

}
