
public class Principal {

	public static void main(String[] args) {
		 
		Televisao t = new Televisao();
		ControleRemoto c = new ControleRemoto();
		
		c.ligarTV();
		c.ligarTV();
		c.aumentaVolume();
		c.aumentaVolume();
		c.aumentaVolume();
		c.diminuiVolume();
		c.aumentaCanal();
		c.aumentaCanal();
		//c.diminuiCanal();
		System.out.println("Está ligado: " + t.isLigada());
		System.out.println("Volume atual: " + c.volumeAtual());
		System.out.println("Canal atual: " + c.canalAtual());
		
	}

}
