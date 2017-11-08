package P2;

class SuperException extends Exception{
	private static final long serialVersionUID = 1L;
	SuperException( ) {
		System.out.println("SuperExc def cnstr");
	}
	SuperException(String msg) {
		super(msg);
		System.out.println("SuperExc");
	}
}

class SmallerException extends SuperException{
	private static final long serialVersionUID = 1L;
	SmallerException(String msg) {
		//super(msg);
		System.out.println("SmallExc");
	}
}

public class mainclass6_2 {
	public static void a() throws SuperException  {
		throw new SuperException("a");
	}
	
	public static void b() throws SmallerException  {
		throw new SmallerException("b");
	}
	
	public static void main(String[] args) {
		try {
			//a();
			b();
		}/* catch(SuperException e) {
			System.out.println("SuperExc catch");
		}*/ catch(SmallerException e) {
			System.out.println("SmallExc catch");
		} catch(SuperException e) {
			System.out.println("SuperExc catch");
		}
	}
}