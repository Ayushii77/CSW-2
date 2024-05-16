import java.util.*;
public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		String s1=s.toLowerCase();
		int count=0;
		System.out.println(s1);
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
			System.out.println("The number of vowels "+ count);
		}

	}

}
