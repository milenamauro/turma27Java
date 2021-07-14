package Entidades;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta{
	
	
	public ContaCorrente(int numero, String nomeCliente) {
		super(numero, nomeCliente);
		// TODO Auto-generated constructor stub
	}

	private int talaoDeCheque=3;
	private int qtdMovimentos;

	public int getTalaoDeCheque() {
		return talaoDeCheque;
	}

	public void setTalaoDeCheque(int talaoDeCheque) {
		this.talaoDeCheque = talaoDeCheque;
	}
	
	public void talaoPeca(int quantidadeDeTaloens) {
    if (quantidadeDeTaloens<=talaoDeCheque) {
    	
    	talaoDeCheque=talaoDeCheque-quantidadeDeTaloens;
    	this.debito(quantidadeDeTaloens*30);
    	
    }
    else {
    	JOptionPane.showMessageDialog(null,"op��o inv�lida!");
    }
	}
	@Override
	
	public void telas() {
		
		int opc, quantidadeDeTaloens;
		double valor;
		
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Bem vinde "+this.getNomeCliente()+" a sua Conta Corrente - N� "+this.getNumero()+" digite:\n1-Debito\n2- Credito\n3- Pedir tal�o\n4- para sair\n\nSaldo atual: R$"+this.getSaldo()+"restante de taloens de cheque que voc� tem"+"\n\n Quantidade de movimentos restantes: "+(10-this.qtdMovimentos)));
			switch(opc) {
				case 1:
					valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do d�bito:"));
					this.debito(valor);
					break;
				case 2:
					valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do cr�dito:"));
					this.credito(valor);
					break;
				case 3:
					quantidadeDeTaloens=Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de taloens que voc� deseja:"));
					talaoPeca(quantidadeDeTaloens);
					
					break;
				case 4:
					JOptionPane.showMessageDialog(null,"Obrigado por ultilizar nosso banco!");
					break;
				default: 
					JOptionPane.showMessageDialog(null,"Op��o invalida!\nPor favor, tente novamente!");
					break;
			}
		}while(opc!=4 && this.qtdMovimentos<=10);
		if(this.qtdMovimentos>10) {
			
			JOptionPane.showMessageDialog(null,"A quantidade de movimenta�oens excede o limite");
			
		}
	}

}