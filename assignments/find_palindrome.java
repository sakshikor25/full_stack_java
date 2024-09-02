package assignments;
import java.util.Scanner;
public class find_palindrome
{
   
	public static void main(String[] args) 
	{   
		String n,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		 n=sc.next();
		 int n1=n.length();
		 for(int i=n1-1;i>=0;i--)
		 {
			 rev=rev+n.charAt(i);
		 }
		 if(n==rev)
		 {
			System.out.println("number is palindrome");	
		 }
		 else
		 {
			System.out.println("number is not palindrome");
		 }		
	}

}
