
public class ControleRemoto {

	
	
	/**
	 * Aumenta o volume em uma unidade.
	 * @param x
	 */
	public void aumentarVolume(Televisao x){
		
		if(x.getVolume() < x.getVolumeMax()){
			x.setVolume(x.getVolume()+1);
		}
	}
	
	/**
	 * Diminui o volume em uma unidade.
	 * @param x
	 */
	public void diminuirVolume(Televisao x){
		if(x.getVolume() > 0){
			x.setVolume(x.getVolume()-1);
		}
	}
	
	
	/**
	 * Aumenta o canal(apenas uma "unidade").
	 * @param x
	 */
	public void aumentaCanal(Televisao x){
		if(x.getCanal() < x.getNumCanais()){
		x.setCanal(x.getCanal()+1);
		}
	}
	
	
	/**
	 * Diminui o canal(apenas uma "unidade").
	 * @param x
	 */
	public void diminuiCanal(Televisao x){
		if(x.getCanal() > 0){
		x.setCanal(x.getCanal()-1);
		}
	}
	
	
	/**
	 * Escolhe o canal e direciona para o mesmo.
	 * @param x
	 * @param canal
	 */
	public void escolheCanal(Televisao x, int canal){
		if(canal > 0 && canal < x.getNumCanais()){
			x.setCanal(canal);
		}
	}
}


