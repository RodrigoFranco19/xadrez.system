package Contexto1;

public class Pe�a {
protected Posicao pos;
private Tabuleiro board;

public Pe�a(Tabuleiro board) {
	this.board = board;
}

protected Tabuleiro getBoard() {
	return board;
}
}