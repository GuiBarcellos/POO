
public class CD extends Produto {

	String banda;
	
	public CD(long codigo, int qnt, String nome, String banda){
		this.codigoBarras = codigo;
		this.qntDisponivel = qnt;
		this.nome = nome;
		
		this.banda = banda;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	
@Override
	
	public String toString(){
		String retorno = "";
		retorno += "-----CD-----\n";
		retorno += "Nome: "+this.nome+"\n";
		retorno += "Banda: "+this.banda+"\n";
		retorno += "Cod Barras: "+this.codigoBarras+"\n";
		retorno += "Estoque: "+this.qntDisponivel+"\n";
		return retorno;
	}
	
}
