public class Veiculo 
{
	public String Matricula="";
	public String Marca="";
	public String Modelo=""; 
	public String Cor="";   
	public TipoVeiculo Tipo; 
	public int Rodas = 0;
	public double PesoMaximo = 0;
	
	public Veiculo(String matricula, TipoVeiculo tipo, double pesoMaximo, int rodas, String cor)
	{
		this.Matricula = matricula;
		this.Tipo = tipo;
		this.Rodas = rodas;
		this.Cor = cor;
		this.PesoMaximo = pesoMaximo;
	}
}