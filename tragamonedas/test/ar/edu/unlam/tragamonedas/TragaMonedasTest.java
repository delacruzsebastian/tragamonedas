package ar.edu.unlam.tragamonedas;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("deprecation")
public class TragaMonedasTest {
	
	@Test
	public void crearTragaMonedasConRodillosYJugar() throws Exception{
		
		TragaMonedas miTragaMonedas = new TragaMonedas(new Rodillo(4), new Rodillo(4), new Rodillo(4));
		
		Assert.assertTrue(miTragaMonedas.bajarPalanca());
	}	
	
	@SuppressWarnings("unused")
	@Test
	public void queNoCreeRodilloConUnaCara() throws Exception{
		
		TragaMonedas miTragaMonedas = new TragaMonedas(new Rodillo(1), new Rodillo(1), new Rodillo(1));
			
	}		
	
	@Test
	public void queElRodilloDevuelvaValorAlAzar() throws Exception{
		
		Rodillo miRodillo = new Rodillo(4);
		
		Integer valorObtenido = miRodillo.seleccionarCara();
		
		Assert.assertTrue(valorObtenido <= 4 && valorObtenido > 0);
			
	}			
	
}
