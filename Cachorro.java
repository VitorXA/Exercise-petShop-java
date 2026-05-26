package petShop;

public class Cachorro {
	public static int qntC;
	private String nome;
	private String raca;
	private int idade;
	private boolean faminto = true;
	private Cliente dono;

	public void comer() {
		if (faminto == true) {
			System.out.println("O " + nome + " comeu!");
			faminto = false;
		} else {
			System.out.println(nome + " já está satisfeito");
		}
	}

	public void latir() {
		System.out.println("O " + raca + "chamado: " + nome + "diz: AU AU");
	}

	public void exibirDados() {
		System.out.println("O nome do seu cachorro é: " + nome);
		System.out.println("A raça do seu cachorro é: " + raca);
		System.out.println("A idade do seu cachorro é: " + idade);
		if (faminto == true) {
			System.out.println("O seu cachorro está com fome!");
		} else {
			System.out.println("O seu cachorro está satisfeito!");
		}
		System.out.println("O dono do " + nome + " é " + dono.getNome());
		System.out.println("E seu telefone é " + dono.getTelefone());
		System.out.println("==========================================");

	}	

	Cachorro(String nome, String raca, int idade, Cliente dono) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.dono = dono;
		qntC++;

	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setFaminto(boolean faminto) {
		this.faminto = faminto;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}

};