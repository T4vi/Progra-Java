package P1;

public class Position {
	private int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Position() {
		setX(0);
		setY(0);
	}
	
	public Position(int x, int y) {
		setX(x);
		setY(y);
	}

	public Position(Position p) {
		setX(p.getX());
		setY(p.getY());
	}
	
}
