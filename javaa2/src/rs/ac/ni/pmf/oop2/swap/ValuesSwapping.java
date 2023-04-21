package rs.ac.ni.pmf.oop2.swap;

public class ValuesSwapping
{
	/**
	 * Initial attempt to creat a method that swaps the values of its parameters
	 * @param a First parameter
	 * @param b Second parameter
	 */
	private static void swap(int a, int b)
	{
		int pom = a;
		a = b;
		b = pom;
	}

	private static void swapObjects(Integer a, Integer b)
	{
		int pom = a;
		// Integer pom = a;
		a = b;
		b = pom;
	}

	private static void swapRealObjects(IntegerObject a, IntegerObject b)
	{
		IntegerObject pom = a;
		a = b;
		b = pom;
	}

	private static void reallySwapRealObjects(IntegerObject a, IntegerObject b)
	{
		int pom = a.getValue();
		a.setValue(b.getValue());
		b.setValue(pom);
	}

	public static void main(String[] args)
	{
		int a = 3;
		int b = 5;
		System.out.printf("a = %d, b = %d\n", a, b);
		swap(a, b);
		System.out.printf("a = %d, b = %d\n", a, b);

		swapObjects(a, b);
		System.out.printf("a = %d, b = %d\n", a, b);

		Integer objectA = 3;
		Integer objectB = 5;
		System.out.printf("a = %d, b = %d\n", objectA, objectB);
		swap(objectA, objectB);
		System.out.printf("a = %d, b = %d\n", objectA, objectB);
		swapObjects(objectA, objectB);
		System.out.printf("a = %d, b = %d\n", objectA, objectB);

		Integer realObjectA = new Integer(3);
		Integer realObjectB = new Integer(5);
		swapObjects(realObjectA, realObjectB);
		System.out.printf("a = %d, b = %d\n", realObjectA, realObjectB);

		IntegerObject reallyRealObjectA = new IntegerObject(3);
		IntegerObject reallyRealObjectB = new IntegerObject(5);
		System.out.printf("a = %s, b = %s\n", reallyRealObjectA, reallyRealObjectB);
		swapRealObjects(reallyRealObjectA, reallyRealObjectB);
		System.out.printf("a = %s, b = %s\n", reallyRealObjectA, reallyRealObjectB);

		reallySwapRealObjects(reallyRealObjectA, reallyRealObjectB);
		System.out.printf("a = %s, b = %s\n", reallyRealObjectA, reallyRealObjectB);
	}

	private static class IntegerObject
	{
		private int value;

		public IntegerObject(int value)
		{
			this.value = value;
		}

		public int getValue()
		{
			return value;
		}

		public void setValue(int value)
		{
			this.value = value;
		}

		@Override
		public String toString()
		{
			return String.valueOf(value);
		}
	}
}
