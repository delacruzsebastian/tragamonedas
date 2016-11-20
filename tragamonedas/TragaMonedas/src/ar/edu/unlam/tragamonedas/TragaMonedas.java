package ar.edu.unlam.tragamonedas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TragaMonedas {
	//Resolucion con colecciones
	private List<Rodillo> misRodillos;

	public TragaMonedas(){
		this.misRodillos = new ArrayList<Rodillo>();
	}
	
	public Boolean agregarRodillo(Rodillo rodillo){
		return this.misRodillos.add(rodillo);
	}
	
	public Boolean bajarPalanca(){
		
		//Ejemplo resuelto con colecciones
		Iterator<Rodillo> rodilloIterator = this.misRodillos.iterator();
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		Boolean gano = true;
		
		System.out.println("Resultado:");
		while(rodilloIterator.hasNext()){			
			resultado.add(rodilloIterator.next().seleccionarCara());
			System.out.println("Rodillo" + resultado.size() + ": " + resultado.get(resultado.size()-1));
			
			if(resultado.size() != 1){
				if(resultado.get(resultado.size()-1) != resultado.get(resultado.size()-2)){
					gano = false;
				}
			}
		}
		
		System.out.println((gano ? "Gano!" : "Perdio"));
		return gano;
	}
	
	public List<Rodillo> getMisRodillos() {
		return misRodillos;
	}	
	
	//Resolucion sin colecciones
	
/*
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
		System.out.println("Rodillo 1: " + resultado1);		
		
		Integer resultado2 = this.rodillo2.seleccionarCara();
		System.out.println("Rodillo 2: " + resultado2);
				
		Integer resultado3 = this.rodillo3.seleccionarCara();
		System.out.println("Rodillo 3: " + resultado3);	
			
		return resultado1 == resultado2 ? resultado2 == resultado3 ? true : false : false;
	}	
*/

	 
	
	
}
