import java.util.ArrayList;

public class Garagem {
	public ArrayList<Veiculo> carros;
	public Garagem()
	{
		carros= new ArrayList<Veiculo>();
	}
	
	public void addCarro(Veiculo carro)
	{
		carros.add(carro);
	}
	
	public Veiculo criarCarro(TipoVeiculo tipoVeiculo, String Matricula)
	{
		var peso=9999;
		var rodas=0;
		var cor = "Branco";
		switch(tipoVeiculo) {
		  case Pesado:
			  peso= 99999;
			  rodas=6;
		    break;
		  case Mota:
			  peso= 3500;
			  rodas=2;
		    break;
		  case Carro:
			  peso= 3500;
			  rodas=4;
		    break;
		  default:
			  peso= 3500;
		}
		
		if(!MatriculaValida(Matricula))
		{
			throw new Exception("");
		}
			
		var carro= new Veiculo(Matricula, tipoVeiculo,peso, rodas, cor);
		carros.add(carro);
		return carro;
	}
	
	public boolean MatriculaValida(String matricula)
	{
		return false;
	}

	
}
