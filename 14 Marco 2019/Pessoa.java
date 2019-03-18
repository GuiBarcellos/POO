
public class Pessoa {

	String nome = null;
	int idade = 0;
	double altura = 0;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public void mostraDados(){
		System.out.println("Nome: " +getNome());
		System.out.println("Idade: " +getIdade());
		System.out.println("Altura: " +getAltura());
	}

	
}
