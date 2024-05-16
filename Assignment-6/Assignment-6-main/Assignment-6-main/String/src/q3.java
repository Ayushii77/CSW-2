import java.util.*;
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String s1=" ";
		String arr[]=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			s1=s1+arr[i];
		}
		System.out.println(s1);

	}

}
