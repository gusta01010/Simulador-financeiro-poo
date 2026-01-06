public class FuncionarioAssalariado extends Funcionario{
	double salario;
	
	public FuncionarioAssalariado(int matricula, String nome, String cargo, double salario){
		super(matricula,nome,cargo);
		setSalario(salario);
	}
	
	public void setSalario(double salario){
		if (salario < 0)
			System.out.println("Salario nao pode ser negativo!");
		else
			this.salario = salario;
	}
	
	public double getPagamento(){
		return salario;
	}
	public void exibeFuncionario(){
		super.exibeFuncionario();
		System.out.println(salario);
	}
}