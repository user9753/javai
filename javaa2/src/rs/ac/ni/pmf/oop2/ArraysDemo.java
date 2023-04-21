package rs.ac.ni.pmf.oop2;

import rs.ac.ni.pmf.oop2.figures.Circle;

public class ArraysDemo
{
	public static void main(String[] args)
	{
//		int[] a = new int[100];
//		System.out.println(a.length);
//		a[0] = 10;
//
//		int[] b = a;
//		System.out.println(b.length);
//		System.out.println("b[0] = " + b[0]);
//
//		int[] c = { 1, 2, 5, 3, 8, 5, 4, 3, 2 };

		Circle[] circles = { new Circle(0, 0), new Circle(1, 1, 10), new Circle(0, 2, 4) };
		for (Circle circle : circles)
		{
			System.out.println(circle.getRadius());
		}
	}
}
