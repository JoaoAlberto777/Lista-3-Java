package Java;

public class Casa {
	String cor;
	Portas p1 = new Portas();
	Portas p2 = new Portas();
	Portas p3 = new Portas();
	
	public void pinta(String cor) {
		System.out.println("Casa pintada de " + cor);
	}
	
	public int quantasPortasEstaoAbertas() {
		int contador = 0;
        if (p1.estaAberta()) {
            contador++;
        }
        if (p2.estaAberta()) {
            contador++;
        }
        if (p3.estaAberta()) {
            contador++;
        }
        return contador ;
	}
}
