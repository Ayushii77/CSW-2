import java.util.*;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String s1=s.toLowerCase();
		String s2="";
		System.out.println(s1);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			s2=c+s2;
		}
		System.out.println(s2);
		if(s1==s2)
		{
			System.out.println("the string is a palindrome");
		}
		else
		{
			System.out.println("The string is not a palindrome");
		}
	}

}
