public class Fatura implements Pagavel {
	private int qtd;
	private double preco;
	public Fatura(int qtd, double preco){
		if (qtd<0)
			System.out.println("Qtd. de itens deve ser maior que zero");
		else
			this.qtd = qtd;
		if (preco<0)
			System.out.println("O preco dos itens deve ser maior que zero");
		else
			this.preco = preco;
	}
	public int getQuantidade(){
		return qtd;
	}
	public double getPreco(){
		return preco;
	}
	public double getPagamento(){
		return qtd*preco;
	}
}