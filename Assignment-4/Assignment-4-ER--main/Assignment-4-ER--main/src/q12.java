import java.util.*;
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		Double x= sc.nextDouble();
		double a=Math.sin(x)*Math.cos(x);
		double b=Math.tan(x)+1;
		try
		{
			if(b>0)
			{
				double c=Math.sqrt(Math.abs(a/b));
				System.out.println("The value is "+c);
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("x cannot be "+x);
		}

	}

}
