package Java;

public class Marca {

	int cod;
	String desc;
	
	public void cadastroMarca(int cod, String desc){
		this.cod = cod;
		this.desc = desc;
	}
	public void mostrarMarca(){
		System.out.println("Codigo da marca: " + cod);
		System.out.println("Descrição: " + desc);
	}
	
}
