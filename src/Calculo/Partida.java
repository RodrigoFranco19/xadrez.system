package Calculo;

import Contexto1.Tabuleiro;

public class Partida {
private Tabuleiro tab;

public Partida() {
	tab = new Tabuleiro(8,8);
}

public Xadrez_Peca[][] getPieces(){
	Xadrez_Peca[][] mat = new Xadrez_Peca[tab.getLinha()][tab.getColuna()];
	
	for(int i = 0 ; i < mat.length ; i++) {
		for(int j = 0 ; j < mat.length ; j++) {
			mat[i][j] = (Xadrez_Peca) tab.piece(i, j);
		}}
	
	return mat;
}
}