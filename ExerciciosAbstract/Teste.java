
public class Teste {
	
	/**
	 * Vetor de funcionarios com 100 posicoes. qntPessoas controla qntidade pessoas.
	 */
	static Funcionario vetor[] = new Funcionario[100];
	static int qntPessoas = 0;
	
	/**
	 * Metodo para calcular a folha salarial. Percorre o vetor de funcionarios e calcula salario de cada um, retornando a soma.
	 * @return
	 */
	public static double folhaSalarial(){
		double total = 0;
		for(int i = 0; i < qntPessoas; i++){
			total += vetor[i].calculaSalario();
		}
		return total;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		boolean verifica = false;
		String nome;
		String cpf = null;
		double salario, valorFolhaSalarial;
	
		
		System.out.println("Digite nome:");
		nome = EntradaTeclado.leString();
		
		System.out.println("Digite cpf:");
		while(!verifica){
			try{
				cpf = EntradaTeclado.leString();
				verifica = Funcionario.verificaCPF(cpf);
				
			}
			catch(Exception e){
				e.getMessage();
			}
		}
		
		System.out.println("Digite salario:");
		
		salario = EntradaTeclado.leDouble();
		
		Gerente g = new Gerente(nome, cpf, salario);
		vetor[qntPessoas] = g;
		qntPessoas++;
		
	

		
		
		
		
		
		System.out.println("Digite nome:");
		nome = EntradaTeclado.leString();
		
		System.out.println("Digite cpf:");
		verifica = false;
		while(!verifica){
			try{
				cpf = EntradaTeclado.leString();
				verifica = Funcionario.verificaCPF(cpf);
				
			}
			catch(Exception e){
				e.getMessage();
			}
		}
		
		System.out.println("Digite salario:");
		
		salario = EntradaTeclado.leDouble();
		
		Assistente a = new Assistente(nome, cpf, salario);
		vetor[qntPessoas] = a;
		qntPessoas++;
		
		
		
		
		
		
		
		System.out.println("Digite nome:");
		nome = EntradaTeclado.leString();
		
		System.out.println("Digite cpf:");
		verifica = false;
		while(!verifica){
			try{
				cpf = EntradaTeclado.leString();
				verifica = Funcionario.verificaCPF(cpf);
				
			}
			catch(Exception e){
				e.getMessage();
			}
		}
		
		System.out.println("Digite salario:");
		
		salario = EntradaTeclado.leDouble();
		
		System.out.println("Digite comissao:");
		
		double comissao = EntradaTeclado.leDouble();
		
		Vendedor v = new Vendedor(nome, cpf, salario, comissao);
		vetor[qntPessoas] = v;
		qntPessoas++;
		
		
		valorFolhaSalarial = folhaSalarial();
		
		
		
		
		
		
		
		System.out.print("Total Folha Salarial: ");
		System.out.println(valorFolhaSalarial);
	}
	
}
