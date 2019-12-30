package Contexto1;

public class Peça {
protected Posicao pos;
private Tabuleiro board;

public Peça(Tabuleiro board) {
	this.board = board;
}

protected Tabuleiro getBoard() {
	return board;
}
}