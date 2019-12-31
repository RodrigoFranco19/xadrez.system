package xadrez.pecas;

import Calculo.Cor;
import Calculo.Xadrez_Peca;
import Contexto1.Tabuleiro;

public class Cavalo extends Xadrez_Peca{

	public Cavalo(Tabuleiro board, Cor c) {
		super(board, c);
	}

@Override
public String toString() {
	return "C";
}	
}
