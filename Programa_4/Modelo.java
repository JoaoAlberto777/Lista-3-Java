package Java;

public class Modelo {
	int cod;
	String desc;
	
	public void cadastroModelo(int cod, String desc){
		this.cod = cod;
		this.desc = desc;
	}
	public void mostrarModelo(){
		System.out.println("Codigo do Modelo: " + cod);
		System.out.println("Descrição: " + desc);
	}
}
