package br.com.senai;

import javax.swing.JOptionPane;

public class Aula1 {
	
	static String msg = "Bem vindo ao GitHub";

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,msg);
		testeMatheusGay

	}
	
	static void trocaMsg(){
		msg = JOptionPane.showInputDialog("Entre com uma nova mensagem ");
	}

}
