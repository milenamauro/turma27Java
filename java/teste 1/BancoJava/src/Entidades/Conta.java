package Entidades;

import javax.swing.*;

public abstract class Conta {
	private int numero;
	private String nomeCliente;
	protected double saldo;
	protected int qtdMovimentos = 0;
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	public int getNumero() {
		return numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public int getQtdMovimentos() {
		return qtdMovimentos;
	}
	public void setQtdMovimentos(int qtdMovimentos) {
		this.qtdMovimentos = qtdMovimentos;
	}
	public void credito(double valorCredito) {
		if(valorCredito<=0) {
			JOptionPane.showMessageDialog(null, "Valor para credito invalido!");
		}else {
			this.saldo = this.saldo + valorCredito;
			JOptionPane.showMessageDialog(null, "Opera��o realizada com sucesso!\n Seu novo saldo �: R$"+this.saldo);
			this.qtdMovimentos++;
		}
		
	}
	public void debito(double valorDebito) {
		if(valorDebito<=0) {
			JOptionPane.showMessageDialog(null,"Valor para debito invalido!");
		}else if(valorDebito>saldo){
			JOptionPane.showMessageDialog(null,"Falha na opera��o!\nSaldo insulficiente");
		}else {
			this.saldo = this.saldo-valorDebito;
			JOptionPane.showMessageDialog(null,"Opera��o realizada com sucesso!\nSeu novo saldo � de: R$"+this.saldo);
			this.qtdMovimentos++;
		}
		
		
	}
	//Tela padr�o para as contas
	public void telas() {
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde a sua conta *Insira aqui o tipo de conta* digite:\n1- opcao01\n2- opcao02\n3- opcao03\n4- para sair\n\nSaldo Atual: R$"+this.saldo));
			switch(opc) {
				case 1:
					JOptionPane.showMessageDialog(null,"Op��o 01");
					break;
				case 2:
					JOptionPane.showMessageDialog(null,"Op��o 02");
					break;
				case 3:
					JOptionPane.showMessageDialog(null,"Op��o 03");
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Op��o 04");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Op��o invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4);
	}
	
}