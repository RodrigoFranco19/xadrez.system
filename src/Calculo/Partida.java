package Calculo;

import java.awt.Color;

import Contexto1.Posicao;
import Contexto1.Posicao_Xadrez;
import Contexto1.Tabuleiro;
import xadrez.pecas.Bispo;
import xadrez.pecas.Cavalo;
import xadrez.pecas.Piao;
import xadrez.pecas.Rainha;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class Partida {
private Tabuleiro tab;

public Partida() {
	tab = new Tabuleiro(8,8);
	InicialSetUp();
}

public Xadrez_Peca[][] getPieces(){
	Xadrez_Peca[][] mat = new Xadrez_Peca[tab.getLinha()][tab.getColuna()];
	
	for(int i = 0 ; i < mat.length ; i++) {
		for(int j = 0 ; j < mat.length ; j++) {
			mat[i][j] = (Xadrez_Peca) tab.piece(i, j);
		}
	}
	return mat;
}

private void NovaPeca(char column , int row , Xadrez_Peca p) {
	tab.PlacePiece(p, new Posicao_Xadrez(column,row).toPosition());
}

private void InicialSetUp() {
	
	NovaPeca('a',7,new Piao(tab, Cor.WHITE));
	NovaPeca('a',8,new Torre(tab,Cor.WHITE));
	NovaPeca('g',8,new Cavalo(tab,Cor.WHITE));
	NovaPeca('f',8,new Bispo(tab,Cor.WHITE));
	NovaPeca('e',8,new Rei(tab,Cor.WHITE));
	NovaPeca('d',8,new Rainha(tab,Cor.WHITE));
	
	
	
	
	
	
	
	
}
}