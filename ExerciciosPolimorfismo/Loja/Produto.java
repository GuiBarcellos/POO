
public class Produto {

	long codigoBarras;
	int qntDisponivel;
	String nome;
	
	
	
	public long getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(long codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public int getQntDisponivel() {
		return qntDisponivel;
	}
	public void setQntDisponivel(int qntDisponivel) {
		this.qntDisponivel = qntDisponivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addQnt(int qntd){
		this.qntDisponivel = this.qntDisponivel + qntd;
	}
	
	
}
