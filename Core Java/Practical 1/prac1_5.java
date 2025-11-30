import java.util.*;
class prac1_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal invested");
		int P= sc.nextInt();
		double R = 10;
		double T = 3;
		double A = P*(1+(R/100))*T; 
		double SI = (P*R*T)/100;
		double CI = A - P;
		double Diff= CI-SI;	
		System.out.println("The difference between Compound Interest and Simple interest is:" +Diff);
	}
		
}
