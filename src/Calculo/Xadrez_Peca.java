package Calculo;

import Contexto1.Pe�a;
import Contexto1.Tabuleiro;

public class Xadrez_Peca extends Pe�a{

	private Cor c;
	
	public Xadrez_Peca(Tabuleiro board,Cor c) {
		super(board);
		this.c = c;
	}

	public Cor getC() {
		return c;
	}
}
