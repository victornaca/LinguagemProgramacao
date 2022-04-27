package prova;

public class Sofa {
	private String cor;
	private String lugares;
	private double preco;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getLugares() {
		return lugares;
	}

	public void setLugares(String lugares) {
		this.lugares = lugares;
	}
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
public Sofa() {
	
}

public Sofa (String cor, String lugares, double preco) {
	this.cor = cor;
	this.lugares = lugares;
	this.preco = preco;
	
}

public static void main (String[] args) {
	Sofa sofa1 = new Sofa("chumbo", "4 lugares", 1699);
	sofa1.list(sofa1);
}

public void list (Sofa s) {
	System.out.println("\nCor:"+ cor +"\nLugares:"+lugares+"\nPreço:"+ preco);	
}
}

