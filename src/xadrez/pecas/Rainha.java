package xadrez.pecas;

import java.awt.Color;

import Calculo.Cor;
import Calculo.Xadrez_Peca;
import Contexto1.Tabuleiro;

public class Rainha  extends Xadrez_Peca{

	public Rainha(Tabuleiro board, Color c) {
		super(board, c);
	}

	@Override
	public String toString() {
		return "Q";
	}
}
