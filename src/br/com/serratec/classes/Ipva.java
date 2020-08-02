package br.com.serratec.classes;

public class Ipva extends Veiculo{
	private double valorIpva;
	private double taxaLicenciamento;
	
	public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
		super(modelo, placa, combustivel, valorVeiculo);
		this.taxaLicenciamento = taxaLicenciamento;
		this.calcularIpva();
	}
	
	private void calcularIpva() {
		String combustivel = this.combustivel.toUpperCase();
		valorIpva = valorVeiculo;		
			
		if (combustivel.equals("GASOLINA")) {
			valorIpva *= .04;
		} else if (combustivel.equals("FLEX")) { 
			valorIpva *= .03;
		} else { 
			valorIpva *= .01;
		}
		
		valorIpva += taxaLicenciamento;
	}

	public double getValorIpva() {
		return valorIpva;
	}
	
	
}
