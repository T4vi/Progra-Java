package P6;

import java.util.Scanner;

public class mainclass6_6
{
	public static void main(String[] args)
	{
		Position[] pos = new Position[3];
		Scanner s = new Scanner(System.in);
		Position origin = new Position("origin", 0, 0, 0);
		
		System.out.println("how many positions?\n");
		int n = s.nextInt();
		
		try {
			for (int i = 0; i < n; i++) {
				pos[i] = new Position("p" + i, s.nextInt(), s.nextInt(), s.nextInt());
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!" + e.getMessage());
		}
		
		
		try {
			for (int i = 0; i < pos.length; i++) {
				if (pos[i].distTo(origin) < 5)
					throw new PointTooCloseException("Point too close to origin!", i);
			}
		}
		catch (PointTooCloseException e) {
			System.out.println(e.getMessage());
			for (int i = 0; i < 10; i++) 
			{
				System.out.println("Re-enter the position's coordinates:  - distance > 5 from " + origin.getName());
				pos[e.index] = new Position("p" + e.index, s.nextInt(), s.nextInt(), s.nextInt());
				if (pos[e.index].distTo(origin) > 5)
					break;
			}
		}
		
		System.out.println("done!");
		
		s.close();
	}
}
