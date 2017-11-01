package P4;

public class Pixel {
	private int R,G,B;

	public int getR() {
		return R;
	}

	public void setR(int r) {
		if (r > 255 || r < 0)
			R = 0;
		R = r;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		if (g > 255 || g < 0)
			G = 0;
		G = g;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		if (b > 255 || b < 0)
			B = 0;
		B = b;
	}
	
	public void setZero()
	{
		this.R = 0;
		this.G = 0;
		this.B = 0;
	}
	
	public Pixel()
	{
		this.R = 0;
		this.G = 0;
		this.B = 0;	
	}
	
	public Pixel(int r, int g, int b)
	{
		this.setR(r);
		this.setG(g);
		this.setB(b);
	}
	
	public Pixel(Pixel p)
	{
		this.setR(p.getR());
		this.setG(p.getG());
		this.setB(p.getB());
	}
}
