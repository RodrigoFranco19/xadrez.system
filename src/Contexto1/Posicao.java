package Contexto1;

public class Posicao {
private int linha,coluna;

public int getLinha() {
	return linha;
}

public void setLinha(int linha) {
	this.linha = linha;
}

public int getColuna() {
	return coluna;
}

public void setColuna(int coluna) {
	this.coluna = coluna;
}

public Posicao(int linha, int coluna) {
	super();
	this.linha = linha;
	this.coluna = coluna;
}

public String toString(){
	return linha + "/" + coluna;
}
}