

public class Main {

	public static void main(String[] args){
		
		
	
		
		 		
				
		PessoaFisica pf = new PessoaFisica("Guilherme", "Jacinto Favoreto", "guitargon@usp.br",10L , "09/10/1998", "solteiro");
		
		Agenda principal = new Agenda();
		
		principal.adicionaAgenda(pf);
		
		
		PessoaJuridica pj = new PessoaJuridica("nome", "endereco", "email", 10, 1200, "razosociak");
		principal.adicionaAgenda(pj);
		
		pj = new PessoaJuridica("nome", "endereco", "email", 20, 1200, "razosociak");
		principal.adicionaAgenda(pj);
		
		pj = new PessoaJuridica("nome", "endereco", "email", 5, 1200, "razosociak");
		principal.adicionaAgenda(pj);
		
		pj = new PessoaJuridica("nome", "endereco", "email", 2, 1200, "razosociak");
		principal.adicionaAgenda(pj);

		
		pf = new PessoaFisica("Igao", "Fisica", "gayzao@usp.br",1L , "09/10/2001", "casado");
		
		principal.adicionaAgenda(pf);
		
		pf = new PessoaFisica("Igao", "Fisica", "gayzao@usp.br",4L , "09/10/2001", "casado");
		
		principal.adicionaAgenda(pf);
		
		pf = new PessoaFisica("Igao", "Fisica", "gayzao@usp.br",2L , "09/10/2001", "casado");
		
		principal.adicionaAgenda(pf);
		
		principal.ordenacao();
		
		String printa = principal.toString();
				
		System.out.println(printa);
		 
		
		
		
	}
	
}
