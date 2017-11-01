package P4;

import java.util.Random;

public class mainclass 
{
	public static void main(String a[])
	{
		Random rand = new Random();
		long startTime, endTime;
		final int n = 5, m = 5;
		
		MyImage img = new MyImage(n,m);
		
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) 
				img.setPixel(i, j, new Pixel(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
		
		startTime = System.nanoTime();
		
		img.cancelPixels(200, 200, 200);
		
		endTime = System.nanoTime();
		System.out.println("It took: " + (endTime - startTime) / 1000000 + "ms");
		
		startTime = System.nanoTime();
		
		img.deleteComponent('r');
		
		endTime = System.nanoTime();
		System.out.println("It took: " + (endTime - startTime) / 1000000 + "ms");
		
		startTime = System.nanoTime();
		
		img.toGrayScale();
		
		endTime = System.nanoTime();
		System.out.println("It took: " + (endTime - startTime) / 1000000 + "ms");
		
		
		
	}
}
