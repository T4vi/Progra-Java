package P5;

public class Point {
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
	
	public Point() {
		setX(0);
		setY(0);
	}
	
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Point(Point p) {
		setX(p.getX());
		setY(p.getY());
	}
	
	public double distTo(Point p) {
		return (Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2)));
	}
	
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
