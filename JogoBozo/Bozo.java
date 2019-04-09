
public class Bozo {


	/**
	 * Método inicial do Programa. Cuida da execução do jogo "Bozó", no qual cada iteração representa uma rodada do jogo. Em cada rodada,
	 * o jogador joga os dados até 3 vezes e depois escolhe a posição que deseja ocupar no placar. No final, pontuação total é exibida.
	 * @param args
	 * @throws java.io.IOException
	 */
	public static void main (java.lang.String[] args) throws java.io.IOException{
		
		RolaDados principal = new RolaDados(5);
		Placar placar = new Placar();
		int[] dados;
		String printaInfo;
		String rodaDados;
		int pos = 0;
		int totalPontos = 0;
		
		System.out.println("Bem vindo ao Bozó");
		
		
		for(int i =0; i<10; i++){
			
			System.out.println("Pressione ENTER para dar inicio a "+(i+1)+ "ª rodada");
			
			String pressEnter = EntradaTeclado.leString();
			dados = principal.rolar();
			printaInfo = principal.toString();
			System.out.println(printaInfo);
			
			for(int j = 0; j < 2; j++){
				System.out.println("Digite os dados a serem rolados novamente(separados por um espaço)");
				rodaDados = EntradaTeclado.leString();
				dados = principal.rolar(rodaDados);
				printaInfo = principal.toString();
				System.out.println(printaInfo);
			}
			
			printaInfo = placar.toString();
			System.out.println(printaInfo);
			System.out.println("Digite a posicao a ser ocupada");
			
			
			while(true){
				try{
					pos = EntradaTeclado.leInt();
					while(pos< 1 || pos > 10){
						System.out.println("Posiçaõ inválida. Digite uma posição entre 1 e 10");
						pos = EntradaTeclado.leInt();
					}
					placar.add(pos, dados);
					break;
					
				}
				catch(IllegalArgumentException e){
					System.out.println("Posição já preenchida, digite novamente: ");
				}	
			}
			printaInfo = placar.toString();
			System.out.println(printaInfo);	
		}
		
		totalPontos = placar.getScore();
		System.out.println("Pontuacao total: "+totalPontos);
		
		
		
		}
	
	
}

