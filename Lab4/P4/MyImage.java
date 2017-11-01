
package P4;

public class MyImage {
	private int n, m;
	private Pixel[][] image; 
	
	private void setN(int n) {
		if (n > 0)
			this.n = n;
		else
			this.n = 0;
	}
	
	private void setM(int m) {
		if (m > 0)
			this.m = m;
		else
			this.m = 0;
	}
	
	public int getN() {
		return n;
	}

	public int getM() {
		return m;
	}

	public MyImage()
	{
		this.setN(0);
		this.setM(0);
		image = new Pixel[n][m];
	}
	
	public MyImage(int n, int m)
	{
		this.setN(n);
		this.setM(m);
		image = new Pixel[n][m];
	}
	
	public void setPixel(int l, int c, Pixel px)
	{
		if (l > n || l < 0 || c > m || c < 0)
			return;
		
		image[l][c] = new Pixel(px);
	}
	
	// sets Pixels with RGB value under specified thresholds to zero. returns 0 if operation succeded, -1 if failed
	public int cancelPixels(int th_r, int th_g, int th_b)
	{
		if ((th_r >= 255 || th_r < 0) || (th_g >= 255 || th_g < 0) || (th_b >= 255 || th_b < 0))
			return -1;
		
		if (n == 0 || m == 0)
			return -1;
		
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) 
				if (image[i][j].getR() < th_r && image[i][j].getB() < th_b && image[i][j].getG() < th_g)
					image[i][j].setZero();
		
		return 0;
	}
	
	/** removes a component (r, g or b) from the entire picture
	 * @params c - 'r', 'g' or 'b'
	 * @return 0 if succeed, -1 if failed
	 * 
	*/
	public int deleteComponent(char c)
	{
		switch (c) {
		case 'r':
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < m; j++) 
					image[i][j].setR(0);
			break;

		case 'g':
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < m; j++) 
					image[i][j].setG(0);
			break;
			
		case 'b':
			for (int i = 0; i < n; i++) 
				for (int j = 0; j < m; j++) 
					image[i][j].setB(0);
			break;
			
		default:
			return -1;
		}
		return 0;
	}
	
	// transforms picture to grayscale using 0.21 * r + 0.71 * b + 0.07 * b
	public void toGrayScale()
	{
		int gray, r,g,b;
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++)
			{
				r = image[i][j].getR();
				g = image[i][j].getG();
				b = image[i][j].getB();
				gray = ((int)(0.21 * r) + (int)(0.71 * g) + (int)(0.07 * b));
				image[i][j] = new Pixel(gray, gray, gray);
			}
	}
}
