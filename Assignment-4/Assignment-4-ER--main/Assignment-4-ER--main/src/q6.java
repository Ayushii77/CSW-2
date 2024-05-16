import java.util.Scanner;
public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		try
		{
			int n=Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter a valid number");
			System.out.println("Error"+e.getMessage());
			int n=sc.nextInt();
			System.out.println();
			

		}

	}

}
