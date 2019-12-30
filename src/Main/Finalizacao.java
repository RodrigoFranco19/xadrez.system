package Main;

import Calculo.Partida;
import Contexto1.Tabuleiro;

public class Finalizacao {
public static void main(String[]args) {
	
	Tabuleiro t = new Tabuleiro(8,8);
	Partida p = new Partida();
	
	Imprimir.printBoard(p.getPieces());	
}
}
