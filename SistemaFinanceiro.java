import java.util.Scanner;
public class SistemaFinanceiro{
	public static void main (String args[]){
		int qtdItens, matricula;
		double salarioMensal, precoItens;
		String tipo, nome, cargo;
		Pagavel p;
		Scanner sInput = new Scanner(System.in);
		Scanner nInput = new Scanner(System.in);
		System.out.println("Tipo de pagamento? (f - fatura/ s - salario/ b - boleto/ h - horista)");
		tipo = sInput.nextLine();
		if (!tipo.equalsIgnoreCase("f") && !tipo.equalsIgnoreCase("s") && !tipo.equalsIgnoreCase("b") && !tipo.equalsIgnoreCase("h"))
            System.out.println("Tipo de pagamento não identificado!");
		else{
			if (tipo.equalsIgnoreCase("f")){
				System.out.println("Quantidade de itens: ");
				qtdItens = nInput.nextInt();
				System.out.println("Preco por item: ");
				precoItens = nInput.nextDouble();
                p = new Fatura(qtdItens, precoItens);
			}
			else if (tipo.equalsIgnoreCase("b")) {
                String cedente, sacado, linha;
                double valor;
                System.out.println("Cedente: ");
                cedente = sInput.nextLine();
                System.out.println("Sacado: ");
                sacado = sInput.nextLine();
                System.out.println("Linha Digitavel: ");
                linha = sInput.nextLine();
                System.out.println("Valor: ");
                valor = nInput.nextDouble();
                p = new Boleto(cedente, sacado, linha, valor); 
			}
			else if (tipo.equalsIgnoreCase("h")) {
				System.out.println("Matricula: ");
				matricula = nInput.nextInt();
				System.out.println("Nome: ");
				nome = sInput.nextLine();
				System.out.println("Cargo: ");
				cargo = sInput.nextLine();
				System.out.println("Valor Hora: ");
				double vlrHora = nInput.nextDouble();
				System.out.println("Horas Trabalhadas: ");
				int qtdHrs = nInput.nextInt();
				p = new FuncionarioHorista(matricula, nome, cargo, vlrHora, qtdHrs);
			}
			else {
				System.out.println("Matricula: ");
				matricula = nInput.nextInt();
				System.out.println("Nome: ");
				nome = sInput.nextLine();
				System.out.println("Cargo: ");
				cargo = sInput.nextLine();
				System.out.println("Salario: ");
				salarioMensal = nInput.nextDouble();
				p = new FuncionarioAssalariado(matricula, nome, cargo, salarioMensal);				
			}
			System.out.println(p.getPagamento());
		}
	}
}