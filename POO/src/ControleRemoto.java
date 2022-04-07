
public class ControleRemoto extends Televisao{
	
	//M�todos
	public void ligarTV() {
		if (this.isLigada() == true) {
			System.out.println("J� est� ligada");
		} else {
			this.setLigada(true);
			System.out.println("Ligada : " + isLigada());
		}
	}
	
	public int volumeAtual() {
		return getVolume();
	}
	public int canalAtual() {
		return getCanal();
	}
	public void aumentaVolume() {
		this.setVolume(getVolume() + 10);
	}
	public void diminuiVolume() {
		this.setVolume(getVolume() - 10);
	}
	public void aumentaCanal() {
		this.setCanal(getCanal() + 10);
	}
	public void diminuiCanal() {
		this.setCanal(getCanal() - 10);
	}
}
