package Java;

public class Carro {
	String placa;
	String cor;
	int ano;
	String combustivel;
	int numeroPortas;
	String renavam;
	String chassi;
	float valorLocacao;
	double kilometragem;
	boolean situacao;
	Modelo modelo;
	Marca marca;

	
	public void cadastrarCarro(String placa, String cor, int ano, String combustivel, int numeroPortas, String renavam,
			String chassi, int valorLocacao, double kilometragem, Modelo modelo, Marca marca){
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.combustivel = combustivel;
		this.renavam = renavam;
		this.chassi = chassi;
		this.valorLocacao = valorLocacao;
		this.kilometragem = kilometragem;
		this.modelo = modelo;
		this.marca = marca;
		
	}
	public void dadosCarro(){
		System.out.println(">> Dados do Veiculo << ");
		System.out.println("Placa: " + this.placa);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ano: " + this.ano);
		System.out.println("Combustivel: " + this.combustivel);
		System.out.println("Renavam: " + this.renavam);
		System.out.println("Chassi: " + this.chassi);
		System.out.println("Valor de Locação: " + this.valorLocacao);
		System.out.println("Kms Rodados: " + this.kilometragem);
		System.out.println("Marca: " + this.marca.desc); 
		System.out.println("Modelo: " + this.modelo.desc);
		System.out.println("Situação do veiculo: " + this.situacao);
		System.out.println("");
		
	}
	public void situacaoCarro(){
		if (this.situacao == true){
			System.out.println("Este veículo já esta alugado!");
		}else{
			System.out.println("Esse veiculo NÃO está alugado!");
		}
	}
	 
		
		
}

