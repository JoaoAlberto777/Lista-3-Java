package Java;

public class Locação {
	Carro carroAlocado;
	String dataAlocacao;
	String horaAlocacao;
	String dataDevolucao;
	String horaDevolucao;
	Cliente clienteLocador;
	double valorLocacao;
	
	
	public void dadosAlocacao(Carro carroAlocado, String dataAlocacao, String horaAlocacao, String dataDevolucao, String horaDevolucao, Cliente clienteLocador, double valorLocacao){
		this.carroAlocado = carroAlocado;
		this.dataAlocacao = dataAlocacao;
		this.horaAlocacao = horaAlocacao;
		this.dataDevolucao = dataDevolucao;
		this.horaDevolucao = horaDevolucao;
		this.clienteLocador = clienteLocador;
		this.valorLocacao = valorLocacao;
	
		
	}

	public void Locacao(){
		System.out.println("Dados Cliente");
		clienteLocador.mostrarCliente();
		System.out.println("\n");
		carroAlocado.dadosCarro();
	}
		
}
	

