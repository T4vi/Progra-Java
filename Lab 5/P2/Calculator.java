package P2;

// add char/string ? 

public class Calculator<T extends Number> {
	public static <T extends Number> Number add(T a, T b) {
		return (a.doubleValue() + b.doubleValue());
	}
	
	public static <T extends Number> Number sub(T a, T b) {
		return (a.doubleValue() - b.doubleValue());
	}
	
	public static <T extends Number> Number mult(T a, T b) {
		return (a.doubleValue() * b.doubleValue());
	}
	
	public static <T extends Number> Number div(T a, T b) {
		return (a.doubleValue() / b.doubleValue());
	}
}
