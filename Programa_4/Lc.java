package Java;

public class Lc {

	public static void main(String[] args) {
		Carro v1 = new Carro();
		Carro v2 = new Carro();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Endereco e1 = new Endereco();
		Endereco e2 = new Endereco();
		
		
		Modelo m1 = new Modelo();
		Marca ma1 = new Marca();
		m1.cadastroModelo(01, "Uno");
		ma1.cadastroMarca(01, "Fiat");
		Modelo m2 = new Modelo();
		Marca ma2 = new Marca();
		ma2.cadastroMarca(02, "Mitsubish");
		m2.cadastroModelo(02, "Lancer evo VII");
		
		
		
		e1.cadastrarEnd("Rua da Morte", "Mei do Nada", 666, "São Paulo");
		c1.cadastrarCliente("Jhon \n" , "29387355809 \n" , "11 985746407" , e1);
		v1.cadastrarCarro("HDHJ-231", "Preto", 2015, "Gasolina", 4 , "09826475328", "8BF083DX07DSU752W", 2500, 123500, m1, ma1);
		
		
		e2.cadastrarEnd("Sem Saida", "Caja" , 335, "Rio de Janeiro");
		c2.cadastrarCliente("Big Allan \n", "99923454611 \n", "68 937485728", e2);
		v2.cadastrarCarro("FAFS-0307", "Amarelo", 2002, "Gasolina", 4, "39493857382", "7JM039D023BDQ2634", 5000, 94300, m2, ma2);
		
		
		Locação L1 = new Locação();
		Locação L2 = new Locação();
			
		L1.dadosAlocacao(v1, "29-10-2023", "12:00", "29-12-2023", "16:00", c1, 5000);
		L1.Locacao();
		L2.dadosAlocacao(v2, "07-08-2024", "09:00", "30-08-2024", "17:00", c2, 10000);
		L2.Locacao();
	
		
		

	}

}
