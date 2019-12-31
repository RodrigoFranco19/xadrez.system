package Calculo;

import Contexto1.Peça;
import Contexto1.Tabuleiro;

public class Xadrez_Peca extends Peça{

	private Cor c;
	
	public Xadrez_Peca(Tabuleiro board,Cor cor) {
		super(board);
		this.c = cor;
	}

	public Cor getC() {
		return c;
	}
}
