import java.util.*;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int var1=5;
		int var2=0;
		try
		{
			int var3=var1/var2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("it is not possible to divide by zero");
			System.out.println(e.getMessage());
		}

	}

}
