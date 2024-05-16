import java.util.*;
public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		double x= sc.nextDouble();
		double b;
		try
		{
			if(x>=30 && x<90)
			{
			  double b1=Math.sin(x)+Math.cos(x)/Math.tan(x);
			  System.out.println("The value is"+x);
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e){
			{
				System.out.println("X should not be a multiple of PI/2");
			}
			
		
		}
		

	}

}
