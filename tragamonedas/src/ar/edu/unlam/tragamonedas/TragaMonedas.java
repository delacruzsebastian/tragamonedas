package ar.edu.unlam.tragamonedas;

public class TragaMonedas {
	private Rodillo rodillo1;
	private Rodillo rodillo2;
	private Rodillo rodillo3;
	
	public TragaMonedas(Rodillo rodillo, Rodillo rodillo2, Rodillo rodillo3){
		this.rodillo1 = rodillo;
		this.rodillo2 = rodillo2;
		this.rodillo3 = rodillo3;
	}	
	
	public Boolean bajarPalanca(){
		
		Integer resultado1 = this.rodillo1.seleccionarCara();
		
		Integer resultado2 = this.rodillo2.seleccionarCara();
				
		Integer resultado3 = this.rodillo3.seleccionarCara();
			
		//Compruebo si los resultados son iguales o no.
		return resultado1 == resultado2 ? resultado2 == resultado3 ? true : false : false;
	}	

}
