package Java;

public class Pessoa {
	String nome;
	int idade;

		
		public void fazAniversario() {
			this.idade = this.idade + 1;
			System.out.println("Parabens " + this.nome + " Voce fez aniversario!");
		}
		
		public void imprimirIdade() {
			System.out.println("Idade: " + this.idade);
		}
		
		
		

	}


