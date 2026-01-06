public class Boleto implements Pagavel
{
	private String nomeCedente, nomeSacado;
	private char[] linhaDigitavel = new char[47];
	private double valorBoleto;
	
	Boleto(String cedente, String sacado, String linhaDigitavel, double valor)
	{
		setCedente(cedente);
		setSacado(sacado);
		setLinha(linhaDigitavel);
		setPagamento(valor);
	}
	public String getCedente()
	{
		return nomeCedente;
	}
	
	public String getSacado()
	{ 
		return nomeSacado;
	}
	
	public void setLinha(String linha)
	{
		if (linha.length() < linhaDigitavel.length)
			for (int i=0; i < linha.length(); i++) linhaDigitavel[i] = linha.charAt(i);
	}
	
	public void setSacado(String sacado)
	{
		this.nomeSacado = sacado;
	}
	
	public void setCedente(String cedente)
	{
		this.nomeCedente = cedente;
	}

	public void setPagamento(double valor)
	{
		if (valor < 0) this.valorBoleto=0;
		else this.valorBoleto=valor;
	}
	
	public String getLinha()
	{
		String linhas="";
		for(int i=0; i<linhaDigitavel.length; i++) linhas += linhaDigitavel[i];
		return linhas;
	}
	
	public double getPagamento()
	{
		return valorBoleto;
	}
	
	public void exibeDados()
	{
		System.out.printf("Nome do cedente: %s\nNome do sacado: %s\nValor do boleto: %.2f\nLinhas: %s", getCedente(), getSacado(), getPagamento(), getLinha());
	}
}