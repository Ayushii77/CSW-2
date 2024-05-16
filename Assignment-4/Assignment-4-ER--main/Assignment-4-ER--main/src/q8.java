import java.util.*;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		try
		{
			if(n>0)
			{
			double sqrt=Math.sqrt(n);
			System.out.println("Square root of an integer "+sqrt);
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("The number cannot be less than zero");
			
		}
				

	}

}
