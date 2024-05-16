import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter alpha numeric alphabets");
	String s= sc.next();
	String s1=s.toUpperCase();
	String s2=" ";
	char c=s.charAt(0);
	try
	{
		if(c=='A'||c=='E'||c=='I'||c=='o'||c=='U') 
		{
			for(int i=0;i<s1.length();i++)
			{
				int n= s1.charAt(1);
				if(n>=65 && n<=90)
				{
					s2=s2+s1.charAt(i);
				}
			}
			System.out.println(s2);
		}
		else
		{
			System.out.println("it is not preceeded by vowel: ");
		}
	}
	catch(NullPointerException e)
	{
		
	}
	}
}

