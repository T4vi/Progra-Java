package P1;

import java.util.Scanner;

class Meth{
	public void dostuff(int n, Scanner scanner) throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException{

		int val[] = new int[5]; // bad stuff might happen
		int s = 0;
		
		for(int i = 0; i < n; i++) {
			val[i] = scanner.nextInt();
			s += val[i];
		}
		
		s /= (n-1);
		System.out.println("Avg is: " + s);
	}
}


public class mainclass6_1 {
	public static void main(String[] args){
		Meth obj = new Meth();
		Scanner scanner = new Scanner(System.in);
		
		boolean ok = true;

		System.out.println("How many values? ");

		try {
			obj.dostuff(scanner.nextInt(), scanner);
		} 
		catch (NumberFormatException e) {
			System.out.println("NumberFormatException!");
			ok = false;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!");
			ok = false;
		} catch (ArithmeticException e){
			System.out.println("ArithmeticException!");
			ok = false;
		} finally {
			if (ok){
				System.out.println("No Exceptons caught");
			} else {
				System.out.println("Caught exception!");
			}
        }
	}
}
