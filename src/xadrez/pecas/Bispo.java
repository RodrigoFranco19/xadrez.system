package xadrez.pecas;

import java.awt.Color;

import Calculo.Cor;
import Calculo.Xadrez_Peca;
import Contexto1.Tabuleiro;

public class Bispo extends Xadrez_Peca{
	public Bispo(Tabuleiro board, Color cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "B";
	}
}
