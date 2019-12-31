package Calculo;

import Contexto1.Pe�a;
import Contexto1.Tabuleiro;

public class Xadrez_Peca extends Pe�a{

	private Cor c;
	
	public Xadrez_Peca(Tabuleiro board,Cor cor) {
		super(board);
		this.c = cor;
	}

	public Cor getC() {
		return c;
	}
}
