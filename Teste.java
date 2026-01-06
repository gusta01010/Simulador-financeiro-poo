public class Teste
{
	public static void main (String args[])
	{
		Pagavel p = new Boleto("Joao", "Hulk", "12312112311", 120);
		System.out.printf("Valor do boleto: %.2f", p.getPagamento());
		System.out.println();
		System.out.println();
		//System.out.println(p.getLinha());
		//p.exibeDados();
		
		Pagavel o = new FuncionarioHorista(1, "carlos", "analista", 8, 16);
		System.out.printf("Valor do funcionario(a) horista: %.2f", o.getPagamento());
	}
}