package xadrez.pecas;

import Calculo.Cor;
import Calculo.Xadrez_Peca;
import Contexto1.Tabuleiro;

public class Bispo extends Xadrez_Peca{
	public Bispo(Tabuleiro board, Cor cor) {
		super(board, cor);
	}

	@Override
	public String toString() {
		return "B";
	}
}
