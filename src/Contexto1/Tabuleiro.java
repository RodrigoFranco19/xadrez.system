package Contexto1;

public class Tabuleiro {
	private int linha,coluna;
	private Peça[][] pcs;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		pcs = new Peça[linha][coluna];
	}

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
	
	public Peça piece(int linha , int coluna) {
		return pcs[linha][coluna];
	}
	
	public Peça pieces(Posicao pos) {
		return pcs[pos.getLinha()][pos.getColuna()];
	}
}