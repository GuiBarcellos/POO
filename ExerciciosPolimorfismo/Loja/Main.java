
public class Main {
	
	public static void main(String[] args){
		
		Livro l = new Livro(123456, 5, "Harry Porra", "JK Louca");
		
		CD c = new CD(456789, 2, "Topissimo", "MC LAN");
		
		
		DVD d = new DVD(789456, 8, "Bastardos Inglorios", "Quentin Tarantino");
		
		
		Loja loja = new Loja();
		
		loja.armazenarProduto(d);
		loja.armazenarProduto(l);
		loja.armazenarProduto(c);
		
		String s = loja.verificaEstoque();
		System.out.println(s);
		
		System.out.println("\n\n");
		
		loja.adicionarEstoqueProduto(789456, 22);
		loja.vendaProduto(456789);
		
		loja.vendaProduto(123456);
		s = loja.verificaEstoque();
		System.out.println(s);
		
		
	}
}
