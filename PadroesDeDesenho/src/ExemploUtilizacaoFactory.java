
public class ExemploUtilizacaoFactory {
	public void MinhaGaragem()
	{
		// Forma manual, onde não temos a logica
		// if ( TipoVeiculo.Mota )
		//   pesoMax = 500;
		// var carro = new Veiculo("",  TipoVeiculo.Mota, pesoMax, 2, "");
		
		var carros= new Garagem();
		carros.criarCarro(TipoVeiculo.Carro, "00-00-ZZ");
		}
	
	public void GaragemPaulo()
	{
		var carros= new Garagem();
		carros.criarCarro(TipoVeiculo.Carro, "12-12-ZZ");
		carros.criarCarro(TipoVeiculo.Mota,"Qq-11-ZZ");

		var carro = new Veiculo("",  TipoVeiculo.Mota, 0, 0, "");
	}
	public void GaragemDoMeuNegocio()
	{
		var carros= new Garagem();
		carros.criarCarro(TipoVeiculo.Pesado, "32-12-QQ");
		
		var carro = new Veiculo("",  TipoVeiculo.Mota, 0, 0, "");
	}
}
