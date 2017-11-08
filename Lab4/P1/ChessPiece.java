package P1;

public interface ChessPiece {
	public Position move(Position dest);
	public boolean isValidMove(Position src, Position dest);
}

abstract class ChessPieceClass implements ChessPiece 
{
	protected Position pos;
	
	@Override
	public Position move(Position dest) 
	{
		if (this.isValidMove(this.getPos(), dest)) 
			this.setPos(dest);
		return this.getPos();
	}
	@Override
	public abstract boolean isValidMove(Position src, Position dest);
	
	public Position getPos() {
		return pos;
	}
	private void setPos(Position p) {
		this.setPos(p);
	}
}

class King extends ChessPieceClass
{
	// Only thing that differs for each class
	@Override
	public boolean isValidMove(Position src, Position dest) {
		// TODO
		// not outside board + not on a friendly piece + piece can move that way - same logic for all pieces
		return false;
	}
}

// Same for other piece types, only thing that differs is isValidMove
// Maybe some chess implementation later