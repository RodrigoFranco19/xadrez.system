package Contexto1;

import Calculo.ChessException;

public class Posicao_Xadrez {
private char column;
private int row;

public Posicao_Xadrez(char column, int row) {
if(column < 'a' || column > 'h' || row < 1 || row > 8) {
	throw new ChessException("Coluna ou linha invalida so valores de a - h ou 1 - 8");
}
	this.column = column;
	this.row = row;
}

public char getColumn() {
	return column;
}

public int getRow() {
	return row;
}
	
public Posicao toPosition() {
return new Posicao(8 - row, column - 'a');
}

protected static Posicao_Xadrez fromPosition(Posicao p) {
	return new Posicao_Xadrez((char)('a' - p.getColuna()),8 - p.getLinha());
}

@Override
public String toString() {
	return  "" + column  + row;
}
}