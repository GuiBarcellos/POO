import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	List<Produto> produtos = new ArrayList<>();
	
	/**
	 * Adiciona um produto na loja(vetor de produtos).
	 * @param aux - Produto a ser adicionado.
	 */
	public void armazenarProduto(Produto aux){
		produtos.add(aux);
	}
	
	/**
	 * Adiciona mais unidades ao estoque de determinado produto.
	 * @param codigo - Codigo do produto a ter estoque aumentado.
	 * @param quantidade - Quantidade a ser adicionada.
	 */
	public void adicionarEstoqueProduto(long codigo, int quantidade){
		int pos;
		pos = buscaCodigoRetornaPos(codigo);
		if(pos >= 0)produtos.get(pos).addQnt(quantidade);
	}
	
	/**
	 * Busca um produto pelo codigo e retorna o produto.
	 * @param codigo - Codigo do produto procurado.
	 * @return o produto
	 */
	public Produto buscaCodigo(long codigo){
		for(int i = 0; i < produtos.size(); i++){
			if(produtos.get(i).getCodigoBarras() == codigo){
				return produtos.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Busca um produto pelo nome e retorna o produto.
	 * @param nome - Nome do produto procurado.
	 * @return o produto
	 */
	public Produto buscaNome(String nome){
		for(int i = 0; i < produtos.size(); i++){
			if(nome.equals(produtos.get(i).getNome())){
				return produtos.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Busca um produto pelo codigo e retorna sua posicao no vetor de produtos.
	 * @param codigo - Codigo do produto procurado.
	 * @return posicao do produto no vetor(-1 caso nao encontre)
	 */
	public int buscaCodigoRetornaPos(long codigo){
		for(int i = 0; i < produtos.size(); i++){
			if(produtos.get(i).getCodigoBarras() == codigo){
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Venda de uma unidade do produto a partir do seu codigo de barras
	 * @param codigo - Codigo do produto a ser vendido.
	 */
	public void vendaProduto(long codigo){
		int pos;
		pos = buscaCodigoRetornaPos(codigo);
		if(pos >=0){
			if(produtos.get(pos).getQntDisponivel() == 1){
				produtos.remove(pos);
			}
			else{
				produtos.get(pos).addQnt(-1);
			}
		}
	}
	
	/**
	 * Retorna uma string que lista os itens do vetor, mostrando a quantidade disponivel para cada um. No final da string, 
	 * contagem total de produtos disponiveis por categoria(Livro/CD/DVD).
	 * @return
	 */
	public String verificaEstoque(){
		String retorno = "";
		String aux = "";
		int livros = 0;
		int cds = 0;
		int dvds = 0;
		
		for(int i = 0; i < produtos.size(); i++){
			aux = produtos.get(i).toString();
			retorno += aux;
			if(produtos.get(i) instanceof Livro){
				livros = livros + produtos.get(i).getQntDisponivel();
			}
			else if(produtos.get(i) instanceof CD){
				cds = cds + produtos.get(i).getQntDisponivel();
			}
			else if(produtos.get(i) instanceof DVD){
				dvds = dvds + produtos.get(i).getQntDisponivel();
			}
		}
		
		retorno+= "Total livros no estoque: "+livros+"\n";
		retorno+= "Total CDs no estoque: "+cds+"\n";
		retorno+= "Total DVDs no estoque: "+dvds+"\n";
		
		return retorno;
	}
	
	
}
