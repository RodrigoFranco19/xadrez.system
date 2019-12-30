package Main;

import Calculo.Xadrez_Peca;
import Contexto1.Peça;

public class Imprimir {

	public static void printBoard(Xadrez_Peca[][] pieces) {
		for(int i = 0 ; i < pieces.length ; i++) {
			
			System.out.print((8-i) + " ");
			
		for(int j = 0 ; j < pieces.length ; j++) {
			printPiece(pieces[i][j]);
		}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void printPiece(Peça p){
		if(p == null) {
			System.out.print("-");
		}else {
			System.out.print(p);
		}
		System.out.print(" ");
	}
}