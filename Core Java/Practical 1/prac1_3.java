import java.util.*;
class prac1_3
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius");
	int r = sc.nextInt();
	double pi = 3.14;
	double area=pi*r*r;
	double perimeter=2*pi*r;
	System.out.println("Enter Area:" + area);
	System.out.println("Enter Perimeter:" + perimeter);
	}
}