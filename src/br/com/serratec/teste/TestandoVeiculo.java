package br.com.serratec.teste;

import br.com.serratec.classes.Ipva;

public class TestandoVeiculo {

	public static void main(String[] args) {
		Ipva veiculo1 = new Ipva("Sandero", "lvc-5430", "Gás", 55000.0, 125.0);
		Ipva veiculo2 = new Ipva("Fiesta", "mvc-1212", "Flex", 40000.0, 140.0);
		
		System.out.println(veiculo1 + "\nIPVA: " + veiculo1.getValorIpva());
		System.out.println(veiculo2 + "\nIPVA: " + veiculo2.getValorIpva());

	}

}
