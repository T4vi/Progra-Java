package P3;

import java.util.ArrayList;

public class mainclass5_3 {
	public static void main (String[] args)
	{
		ArrayList<People> arr = new ArrayList<>();
		
		// or read stuff from keyboard
		
		arr.add(new Kid(	"Joseph Markinsons Jr", 10));
		arr.add(new Adult(	"Joseph Markinsons", 	35));
		arr.add(new Retired("Joseph Markinsons Sr", 67));
		
		System.out.println(arr);
	}
}
