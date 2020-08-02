package br.com.serratec.teste;

import java.awt.GridLayout;
import java.util.*;
import javax.swing.*;
import br.com.serratec.classes.Ipva;

public class TestandoVeiculoSwing {
	protected static List<Ipva> listaCadastros = new ArrayList<Ipva>();

	public static void main(String[] args) {
		Ipva veiculo1 = new Ipva("Sandero", "lvc-5430", "Gás", 55000.0, 125.0);
		Ipva veiculo2 = new Ipva("Fiesta", "mvc-1212", "Flex", 40000.0, 140.0);
		listaCadastros.add(veiculo1);
		listaCadastros.add(veiculo2);

		Menus.main(null);
	}
}

class Menus extends TestandoVeiculoSwing{
	
	public static void main(String[] args) {
		String[] options = {"Fazer novo cadastro", "Verificar cadastros"};
        int x = JOptionPane.showOptionDialog(
        									null, 
        									"Selecione uma opção:",
        									"Opções",
        									JOptionPane.DEFAULT_OPTION, 
        									JOptionPane.QUESTION_MESSAGE, 
        									null, 
        									options, options[0]);
        if (x == 0)
        	inserirCadastro();
        if (x == 1)
        	exibirCadastros();
	}
	
	private static void inserirCadastro() {
        
        JPanel cadastro = new JPanel();
        cadastro.setLayout(new GridLayout(0, 2));
		
		JTextField modelo 		= new JTextField(10);
        JTextField placa 	   	= new JTextField(10);
        JTextField combustivel 	= new JTextField(10);
        JTextField valor 		= new JTextField(10);
        JTextField taxa 		= new JTextField(10);
        
        cadastro.add(new JLabel("Modelo:"));
        cadastro.add(modelo);
        
        cadastro.add(new JLabel("Placa:"));
        cadastro.add(placa);
        
        cadastro.add(new JLabel("Combustivel:"));
        cadastro.add(combustivel);
        
        cadastro.add(new JLabel("Valor:"));
        cadastro.add(valor);
        
        cadastro.add(new JLabel("Taxa:"));
        cadastro.add(taxa);
        
        int x = JOptionPane.showConfirmDialog(null, cadastro, "Cadastro", JOptionPane.OK_CANCEL_OPTION);
        if (x == 0) {
        	listaCadastros.add(new Ipva( modelo.getText(), 
										 placa.getText(), 
										 combustivel.getText(), 
										 Double.parseDouble(valor.getText()), 
										 Double.parseDouble(taxa.getText())
										 ));
        }
    	Menus.main(null);
	}
	
	private static void exibirCadastros() {
		//Longe do ideal para exibir diveros items, mas funciona bem no contexto proposto
		StringBuilder items = new StringBuilder();
		
		for (Ipva i : listaCadastros) {
			items.append(i + "\nIPVA: " + i.getValorIpva());
		}
		
		JOptionPane.showMessageDialog(null, items.toString());
	}
}

