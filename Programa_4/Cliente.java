package Java;

public class Cliente {
	String nome;
	String cpf;
	String telefone;
	Endereco endereco;
	


	public void cadastrarCliente(String nome, String cpf, String telefone, Endereco end) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = end;
		
		
	}
	public void mostrarCliente(){
		System.out.println("Nome: " + nome + "Cpf: " + cpf + "Telefone: " + telefone);
		endereco.mostrarEnd();
	}

	
	
}
