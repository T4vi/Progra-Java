package P6;

class PointTooCloseException extends Exception {
	private static final long serialVersionUID = 1L;
	public int index;
	PointTooCloseException(String msg){
		super(msg);
	}
	PointTooCloseException(String msg, int index){
		super(msg);
		this.index = index;
	}
}

public class Position {
	private String name;
	private int X,Y,Z;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int z) {
		Z = z;
	}
	
	public Position()
	{
		setName("");
		setX(0);
		setY(0);
		setZ(0);
	}
	
	public Position(String name, int x, int y, int z)
	{
		setName(name);
		setX(x);
		setY(y);
		setZ(z);
	}
	
	public Position(Position p)
	{
		setName(p.getName());
		setX(p.getX());
		setY(p.getY());
		setZ(p.getZ());
	}
	
	public double distTo(Position p)
	{
		return Math.sqrt(	Math.pow(this.getX() - p.getX(),2) + 
							Math.pow(this.getY() - p.getY(),2) + 
							Math.pow(this.getZ() - p.getZ(),2) );
	}
}