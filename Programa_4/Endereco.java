package Java;

public class Endereco {
	String rua;
	String bairro;
	int numero;
	String cidade;
	
	public void cadastrarEnd(String rua, String bairro, int numero, String cidade){
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
	}
	public void mostrarEnd(){
		System.out.println("Endereço do Cliente");
		System.out.println("Rua: " + this.rua);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Número: " + this.numero);
		System.out.println("Cidade: " + this.cidade);
		
	}
}
