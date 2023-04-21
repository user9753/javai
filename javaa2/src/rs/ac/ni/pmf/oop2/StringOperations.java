package rs.ac.ni.pmf.oop2;

public class StringOperations
{
	public static void main(String[] args)
	{
		String s = "ABC";
//		System.out.println(s);
//		System.out.println(s + "D");
//		System.out.println(s + 3);
//		System.out.println(3 + s);

//		System.out.println(s + 3);
		System.out.println(1 + 2 + 3 + s);
		System.out.println(s + 1 + 2 + 3);
		System.out.println(s + (1 + 2 + 3));

		s = String.format("%s %d", s, 1 + 2 + 3);
	}
}
