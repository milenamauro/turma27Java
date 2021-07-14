package Entidades;

import javax.swing.*;

public class contaEstudante extends Conta {
	private double limite = 5000;
	private int qtdMovimentos;

	public contaEstudante(int numero, String nomeCliente) {
		super(numero, nomeCliente);
	}

	public double getLimite() {
		return limite;
	}
	
	public void emprestimo(double emprestimoJa) {
		if (emprestimoJa<=limite) {
			limite = limite - emprestimoJa;
			this.credito(emprestimoJa);
		} else {
			
			JOptionPane.showMessageDialog(null,"Limite indispon�vel.");

		}
		
	}
	
	
	@Override
	public void telas() {
		double saldoDebito;
		double saldoCredito;
		double emprestimoJa;
		int escolha;
		
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Estudantil - N� "+this.getNumero()+" digite:\n1- D�bito\n2- Cr�dito\n3- Emprestimo J�!\n4- para sair\n\nSaldo Atual: R$"+this.saldo+"\nSaldo para emprestimo: R$"+this.limite+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
			switch(opc) {
			case 1:
				saldoDebito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.debito(saldoDebito);
				break;
			case 2:
				saldoCredito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor desejado: "));
				this.credito(saldoCredito);
				break;
			case 3:
				emprestimoJa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empr�stimo: "));
				this.emprestimo(emprestimoJa);								
				break;
			case 4:
				JOptionPane.showMessageDialog(null,"Foi dispon�vel um emprestimo, gostaria de receber?");
				escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n 1. SIM \n 2. N�O"));
				if (escolha == 1) {
					emprestimoJa = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do empr�stimo: "));
					this.emprestimo(emprestimoJa);
				} else if (escolha == 2 ) {
					JOptionPane.showMessageDialog(null,"Obrigado por escolher o FCBM!  At� a pr�xima.");
				}
				break;
			default: 
				JOptionPane.showMessageDialog(null,"Op��o invalida!\nPor favor, tente novamente!");
				break;
			}
		}while(opc!=4);
	}

}