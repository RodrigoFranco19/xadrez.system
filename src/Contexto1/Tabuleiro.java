package Contexto1;

public class Tabuleiro {
	private int linha,coluna;
	private Peça[][] pcs;
	
	public Tabuleiro(int linha, int coluna) {
		if(linha < 1 || linha < 1 ) {
			throw new BoardException("Erro na criacao do tabuleiro necessita-se de 1 linha ou 1 coluna");
		}
		this.linha = linha;
		this.coluna = coluna;
		pcs = new Peça[linha][coluna];
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	public Peça piece(int linha , int coluna) {
		if(!Existir(linha,coluna)) {
			throw new BoardException("Linha ou coluna inexistentes");
		}
		return pcs[linha][coluna];
	}
	
	public Peça pieces(Posicao pos) {
		if(!PosicaoExiste(pos)) {
			throw new BoardException("Linha ou coluna inexistentes");
		}
		return pcs[pos.getLinha()][pos.getColuna()];
	}
	
	public void PlacePiece(Peça p , Posicao pos) {
		if(TemPeca(pos)) {
			throw new BoardException("Invalido");
		}
		pcs[pos.getLinha()][pos.getColuna()] = p;
		p.pos = pos;
	}
	
	private  boolean Existir(int l , int c) {
		return l >= 0 && l < linha  && c >= 0 && c < coluna;
	}
	
	public boolean PosicaoExiste(Posicao p1) {
		return Existir(p1.getLinha(),p1.getColuna());
	}
	
	public boolean TemPeca(Posicao p) {
		if(!PosicaoExiste(p)) {
			throw new BoardException("Linha ou coluna inexistentes");
		}
		return pieces(p) != null;
	}
}