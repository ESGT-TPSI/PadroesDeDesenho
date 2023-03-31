
public class ExemploUtilizacaoFactory {
	public void MinhaGaragem() throws Exception
	{
		// Forma manual, onde não temos a logica
		// if ( TipoVeiculo.Mota )
		//   pesoMax = 500;
		// var carro = new Veiculo("",  TipoVeiculo.Mota, pesoMax, 2, "");
		
		var carros= new Garagem();
		carros.criarCarro(TipoVeiculo.Carro, "00-00-ZZ");
		}
	
	public void GaragemPaulo()throws Exception
	{
		var carros= new Garagem();
		carros.criarCarro(TipoVeiculo.Carro, "12-12-ZZ");
		carros.criarCarro(TipoVeiculo.Mota,"Qq-11-ZZ");

	}
	public void GaragemDoMeuNegocio()throws Exception
	{
		var carros= new Garagem();
		carros.criarCarro(TipoVeiculo.Pesado, "32-12-QQ");
		
	}
}
