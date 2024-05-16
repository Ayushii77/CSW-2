import java.util.*;
public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String s1=" ";
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			s1=s1+arr[i].toUpperCase().charAt(0);
		}
		System.out.println(s1);

	}

}
