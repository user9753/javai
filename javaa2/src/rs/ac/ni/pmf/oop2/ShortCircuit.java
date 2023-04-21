package rs.ac.ni.pmf.oop2;

public class ShortCircuit
{
	static boolean test1(int value)
	{
		System.out.println("test1(" + value + ")");
		System.out.println("result: " + (value < 1));
		return value < 1;
	}

	static boolean test2(int value)
	{
		System.out.println("test2(" + value + ")");
		System.out.println("result: " + (value < 2));
		return value < 2;
	}

	static boolean test3(int value)
	{
		System.out.println("test3(" + value + ")");
		System.out.println("result: " + (value < 3));
		return value < 3;
	}

	public static void main(String[] args)
	{
		boolean b = test1(0) && test2(2) && test3(2);
		System.out.println("expression is " + b);
	}
}
