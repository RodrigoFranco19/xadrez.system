package Calculo;

import java.awt.Color;

import Contexto1.Peça;
import Contexto1.Tabuleiro;

public class Xadrez_Peca extends Peça{

	private Color c;
	
	public Xadrez_Peca(Tabuleiro board,Color cor) {
		super(board);
		this.c = cor;
	}

	public Color getC() {
		return c;
	}
}
