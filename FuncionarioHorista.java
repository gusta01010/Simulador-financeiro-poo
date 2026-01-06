public class FuncionarioHorista extends Funcionario
{
	private double vlrHora;
	private int qtdHrsTrabalhadas;
	
	FuncionarioHorista(int matricula, String nome, String cargo, double vlrHora, int qtdHrsTrabalhadas)
	{
		super(matricula,nome,cargo);
		setHorasTrabalhadas(qtdHrsTrabalhadas);
		setVlrHora(vlrHora);
	}
	
	public void setVlrHora(double vlr)
	{
		if (vlr<0) this.vlrHora = 0;
		else this.vlrHora = vlr;
	}
	
	public void setHorasTrabalhadas(int hrs)
	{
		if (hrs<0) this.qtdHrsTrabalhadas = 0;
		else this.qtdHrsTrabalhadas = hrs;
	}
	
	public double getPagamento()
	{
		return qtdHrsTrabalhadas*vlrHora;
	}
	
	public void exibeFuncionario()
	{
		super.exibeFuncionario();
		System.out.printf("\nValor por hora: %.2f\nHoras trabalhadas: %d\n", this.vlrHora, this.qtdHrsTrabalhadas);
	}
	
}