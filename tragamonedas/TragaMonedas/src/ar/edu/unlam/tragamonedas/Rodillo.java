package ar.edu.unlam.tragamonedas;

import java.util.concurrent.ThreadLocalRandom;

public class Rodillo {
	private Integer cantidadCaras;
	
	public Rodillo (Integer cantidadCaras) throws Exception{	
		if(cantidadCaras > 1)
			this.cantidadCaras = cantidadCaras;
		else
			throw new Exception("Excepcion: el rodillo debe tener mas de una cara");
			//System.out.println("Excepcion: el rodillo debe tener mas de una cara");
	}
	
	public Integer seleccionarCara(){
		return ThreadLocalRandom.current().nextInt(1, this.cantidadCaras + 1);
	}
	
}
