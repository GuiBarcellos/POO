import java.util.ArrayList;
import java.util.List;

public class Loja {
	
	List<Produto> produtos = new ArrayList<>();
	
	
	public void armazenarProduto(Produto aux){
		produtos.add(aux);
	}
	
	public void adicionarEstoqueProduto(long codigo, int quantidade){
		int pos;
		pos = buscaCodigoRetornaPos(codigo);
		if(pos >= 0)produtos.get(pos).addQnt(quantidade);
	}
	
	public Produto buscaCodigo(long codigo){
		for(int i = 0; i < produtos.size(); i++){
			if(produtos.get(i).getCodigoBarras() == codigo){
				return produtos.get(i);
			}
		}
		return null;
	}
	
	public Produto buscaNome(String nome){
		for(int i = 0; i < produtos.size(); i++){
			if(nome.equals(produtos.get(i).getNome())){
				return produtos.get(i);
			}
		}
		return null;
	}
	
	public int buscaCodigoRetornaPos(long codigo){
		for(int i = 0; i < produtos.size(); i++){
			if(produtos.get(i).getCodigoBarras() == codigo){
				return i;
			}
		}
		return -1;
	}
	
	
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
	
	
	public String verificaEstoque(){
		String retorno = "";
		String aux = "";
		
		for(int i = 0; i < produtos.size(); i++){
			aux = produtos.get(i).toString();
			retorno += aux;
		}
		
		return retorno;
	}
	
	
}
