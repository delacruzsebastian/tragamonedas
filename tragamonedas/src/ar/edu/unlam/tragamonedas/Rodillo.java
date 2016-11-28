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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cantidadCaras == null) ? 0 : cantidadCaras.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rodillo other = (Rodillo) obj;
		if (cantidadCaras == null) {
			if (other.cantidadCaras != null)
				return false;
		} else if (!cantidadCaras.equals(other.cantidadCaras))
			return false;
		return true;
	}	
}
