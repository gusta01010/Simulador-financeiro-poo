public abstract class Funcionario implements Pagavel {
	int matricula;
	String nome, cargo;
	
	public Funcionario(int matricula, String nome, String cargo){
		this.matricula = matricula;
		this.nome = nome;
		setCargo(cargo);
	}
	public void setCargo(String nomeCargo){
		this.cargo = cargo;
	}
	public String getCargo(){
		return this.cargo;
	}
	public void exibeFuncionario(){
		System.out.println(nome);
		System.out.println(cargo);
		System.out.println(getPagamento());
	}
	public abstract double getPagamento();
}