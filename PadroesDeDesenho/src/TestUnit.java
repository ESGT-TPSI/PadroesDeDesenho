import static org.junit.Assert.*;

import java.io.Console;

import org.junit.Test;

public class TestUnit {

	@Test
	public void VerificaPeso()  throws Exception {
		
		var carros= new Garagem();
		var carro = carros.criarCarro(TipoVeiculo.Carro, "12-12-ZZ");

		if(carro.PesoMaximo==0)
		{
			fail("Peso Invalido");
		}
		
	}
	
	@Test
	public void VerificaRodasMota() throws Exception {
		
		var carros= new Garagem();
		var carro = carros.criarCarro(TipoVeiculo.Mota, "12-12-ZZ");
		
		if(carro.Rodas!=2)
		{
			fail("Uma mota tem que ter duas rodas");
		}
	}
	@Test
	public void VerificaRodasCarro() throws Exception {
		
		var carros= new Garagem();
		var carro = carros.criarCarro(TipoVeiculo.Carro, "12-12-ZZ");
		
		if(carro.Rodas<4)
		{
			fail("Um Carro tem que ter 4 rodas");
		}
	}
	

	@Test
	public void VerificaMatricula()  throws Exception {
		
		var carros= new Garagem();
		var carro = carros.criarCarro(TipoVeiculo.Carro, "12-12-ZZ");
		
		if(carro.Matricula=="")
		{
			fail("Matricula");
		}
	}
}
