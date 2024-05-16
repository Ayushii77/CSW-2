import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		int n=s.length();
		char c[]=new char[n];
		for(int i=0;i<n;i++)
		{
			c[i]=s.charAt(i);
		}
		System.out.println("Enter a character to search in the string");
		char ch=sc.next().charAt(0);
		for(int i=0;i<n;i++)
		{
			char c1=s.charAt(i);
			if(c1==ch)
			{
				System.out.println("");
				
			}
		}
	}

}
