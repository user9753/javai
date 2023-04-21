package rs.ac.ni.pmf.oop2;

public class InitializationSample
{
	private int x;
	private float y;
	private char c;
	private boolean b;

	private Object object;
	private String s;

	public static void main(String[] args)
	{
		final InitializationSample sample = new InitializationSample();

		System.out.println(sample.x);
		System.out.println(sample.y);
		System.out.println(sample.c);
		System.out.println(sample.b);
		System.out.println(sample.object);
		System.out.println(sample.s);
	}
}
