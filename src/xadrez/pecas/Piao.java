package xadrez.pecas;

import java.awt.Color;

import Calculo.Cor;
import Calculo.Xadrez_Peca;
import Contexto1.Tabuleiro;

public class Piao extends Xadrez_Peca{

	public Piao(Tabuleiro board, Cor c) {
		super(board, c);
	}
	
	@Override
	public String toString() {
		return "P";
	}
}
