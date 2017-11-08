package P5;

import java.util.Random;

public class mainclass6_5 {
	public static void main(String[] args) 
	{
		Random r = new Random();
		try {
			Triangle t = new Triangle(r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10),r.nextInt(10));
			System.out.println(t);
		} catch (ImpossibleTriangleException e) {
			System.out.println("ImpossibleTriangleException: " + e.getMessage());
			throw new RuntimeException("ImpossibleTriangleException: " + e.getMessage());
		} catch (AcuteTriangleException e) {
			System.out.println("AcuteTriangleException: " + e.getMessage());
		} catch (RightTriangleException e) {
			System.out.println("RightTriangleException: " + e.getMessage());
		} finally {
			;
		}
	}
}
