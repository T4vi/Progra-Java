package P4;

class RGB {
	private int r, g, b;
	
	public RGB(int r, int g, int b) {
		setR(r);
		setG(g);
		setB(b);
	}
	
	public int OverSaturated() {
		setR(getR() - 5);
		setG(getG() - 5);
		setB(getB() - 5);
		return (getR() + getG() + getB()) / 3;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

class WrongColorException extends Exception 
{
	private static final long serialVersionUID = 1L;

	WrongColorException(String msg) {
		super(msg);
	}
}

public class mainclass6_4
{
	public static void main(String[] args)
	{
		
	}
}
