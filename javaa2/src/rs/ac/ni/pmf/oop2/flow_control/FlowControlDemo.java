package rs.ac.ni.pmf.oop2.flow_control;

public class FlowControlDemo
{
	private static boolean greater(int a, int b)
	{
		if (a > b)
		{
			System.out.println("First is greater");
			return true;
		}
		System.out.println("Second is greater");
		return false;
	}

	public static void main1(String[] args)
	{
		int a = 5;
		int b = 3;
		if (greater(a, b))
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}

	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5, 6 };

		for (int i = a.length - 1; i >= 0; i--)
		{
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int value : a)
		{
			System.out.print(value + " ");
		}
	}
}
