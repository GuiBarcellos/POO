
public class DVD extends Produto{
	
	String diretor;
	
	public DVD(long codigo, int qnt, String nome, String diretor){
		this.codigoBarras = codigo;
		this.qntDisponivel = qnt;
		this.nome = nome;
		
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	
@Override
	
	public String toString(){
		String retorno = "";
		retorno += "-----DVD-----\n";
		retorno += "Nome: "+this.nome+"\n";
		retorno += "Diretor: "+this.diretor+"\n";
		retorno += "Cod Barras: "+this.codigoBarras+"\n";
		retorno += "Estoque: "+this.qntDisponivel+"\n";
		return retorno;
	}
	
}
