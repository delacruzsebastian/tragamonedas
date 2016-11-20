package ar.edu.unlam.tragamonedas;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class TragaMonedasTest {
	
	//Resolucion con colecciones
	@Test
	public void crearTragaMonedasConRodillosYJugar() throws Exception{
		//Ejemplo resuelto con colecciones
		TragaMonedas miTragaMonedas = new TragaMonedas();
		miTragaMonedas.agregarRodillo(new Rodillo(4));
		miTragaMonedas.agregarRodillo(new Rodillo(4));
		miTragaMonedas.agregarRodillo(new Rodillo(4));
		
		//JUnit dara verde cuando ganes.
		Assert.assertTrue(miTragaMonedas.bajarPalanca());
	}
	@Test
	public void queNoCreeRodilloConUnaCara() throws Exception{
		//Ejemplo resuelto con colecciones
		TragaMonedas miTragaMonedas = new TragaMonedas();
		
		Rodillo miRodillo = new Rodillo(1);
		miTragaMonedas.agregarRodillo(miRodillo);
		
		//JUnit dara verde cuando ganes.
		Assert.assertTrue(miTragaMonedas.getMisRodillos().size() == 0);
	}	
	
	/*
	//Resolucion sin colecciones	
	@Test
	public void crearTragaMonedasConRodillosYJugarSinColecciones(){
		
		TragaMonedas miTragaMonedas = new TragaMonedas(new Rodillo(4), new Rodillo(4), new Rodillo(4));
		
		//JUnit dara verde cuando ganes.
		Assert.assertTrue(miTragaMonedas.bajarPalanca());
	}	
	*/
}
