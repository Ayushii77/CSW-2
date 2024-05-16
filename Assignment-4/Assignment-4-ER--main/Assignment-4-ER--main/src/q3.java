import java.util.*;

public class q3{
	public static String NullPointerException()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the msg");
		String s=sc.nextLine();
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("Custom null pointer exception: "+e.getMessage());
			
		}

	}

}