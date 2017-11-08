package P1;

// add characters ?

interface Generator<T> {
	public <T extends Number> Number next(T var);
}

public class Gen<T> implements Generator<T> 
{
	@Override
	public <T extends Number> Number next(T var)
	{
		System.out.println(var.getClass().getName());
		return var.doubleValue() + 1;
	}
	
	
	public static void main(String[] a)
	{
		Gen<String> g = new Gen<>();
		
		System.out.println(g.next(1.2));
	}
}