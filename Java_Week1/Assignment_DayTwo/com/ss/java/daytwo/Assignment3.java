/**
 * 
 */
package com.ss.java.daytwo;

/**
 * @author Charles Alms
 *
 */
interface Assignment3 {
	//the 2 methods required by assignment
	public double calculateArea();
	public void display();
}
class Triangle implements Assignment3
{
	public double l, h;
	@Override
	public double calculateArea()
	{
		double area = (h * l) * .5;
		return area;
	}
	@Override
	public void display()
	{
		System.out.println("Triangle area is "+this.calculateArea());
	}
}

class Rectangle implements Assignment3
{
	public double l, h;
	@Override
	public double calculateArea()
	{
		double area = (h * l);
		return area;
	}
	@Override
	public void display()
	{
		System.out.println("Rectangle area is "+this.calculateArea());
	}
}

class Circle implements Assignment3
{
	public double d;
	@Override
	public double calculateArea()
	{
		double area = ((d/2)*(d/2)*3.1415);
		return area;
	}
	@Override
	public void display()
	{
		System.out.println("Circle area is "+this.calculateArea());
	}
}