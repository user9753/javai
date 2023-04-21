package rs.ac.ni.pmf.oop2;

public class ObjectEquivalence
{
	public static void main(String[] args)
	{
		//		int a = 42;
		//		int b = 42;

		final Integer a = new Integer(42);
		final Integer b = new Integer(42);

		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
