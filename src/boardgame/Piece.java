package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	// Posi��o da pe�a sera nulo
	public Piece(Board board) {
		this.board = board;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
}
