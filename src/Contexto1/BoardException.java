package Contexto1;

public class BoardException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	String msg;

	public BoardException(String msg) {
		super(msg);
	}
	
	public String getMessage() {
		return this.msg;
	}
}