import java.util.Scanner;

class Shape{
	private String name;

	public Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shape: " + getName() ;
	}




}
class Rectangle extends Shape{

	private double side1;
	private double side2;
	public Rectangle(String name, double side1, double side2) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double area(double side1,double side2) {
		double area= side1*side2;


		return area;


	}
	public double perimeter(double side1,double side2)
	{
		double perimeter=2*(side1+side2);
		return perimeter;
	}

	
}
class Square extends Rectangle {

	public Square(String name, double side1, double side2) {
		super(name, side1,side2);
		//name=name;
		//	side1=side2;
		//side2=side2;
	}

	//@Override
	//public String toString() {
	//	return "Area: "+super.area(getSide1(), getSide2())+"\nPerimeter: "+super.perimeter(getSide1(), getSide2());
	//}
	
}





public class Inheritance {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//System.out.println("enter side");
		double side=in.nextDouble();
		//	System.out.println("enter name");
		//String name=in.next();


		Square C1=new Square("Square",side,side);
System.out.println(C1.toString());
	//	C1.area(side, side);
		//C1.perimeter(side, side);
		System.out.println("Area: "+C1.area(side, side));
		System.out.println("Perimeter: "+C1.perimeter(side, side));
		in.close();
	}

}

