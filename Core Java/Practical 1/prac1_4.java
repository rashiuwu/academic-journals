import java.util.*;
class sample
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Time in Hours");
	int t = sc.nextInt();
	double Min=t*60;
	System.out.println("The Time in Minutes:" + Min);
	}
}