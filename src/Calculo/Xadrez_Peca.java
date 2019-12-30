package Calculo;

import Contexto1.Peça;
import Contexto1.Tabuleiro;

public class Xadrez_Peca extends Peça{

	private Cor c;
	
	public Xadrez_Peca(Tabuleiro board,Cor c) {
		super(board);
		this.c = c;
	}

	public Cor getC() {
		return c;
	}
}
