package xadrez.pecas;


import Calculo.Cor;
import Calculo.Xadrez_Peca;
import Contexto1.Tabuleiro;

public class Rei extends Xadrez_Peca {

	public Rei(Tabuleiro board, Cor c) {
		super(board, c);
	}
	
	@Override 
	public String toString() {
		return "R";
	}
}
