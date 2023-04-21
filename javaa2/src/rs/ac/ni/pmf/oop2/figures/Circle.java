package rs.ac.ni.pmf.oop2.figures;

public class Circle
{
	private double radius;

	private double x;
	private double y;

	public Circle(int x, int y)
	{
		this((double)x, (double)y);
		System.out.println("Constructor with int parameters");
	}

	public Circle(double x, double y)
	{
		this(x, y, 1);
		System.out.println("Constructor with double parameters");
	}

	public Circle(double x, double y, double radius)
	{
		//		System.out.println("Some standard initialization");

		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void setRadius(final double radius)
	{
		this.radius = radius;
	}

	public double getRadius()
	{
		return radius;
	}
}
