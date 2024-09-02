package assignments;
import java.util.Scanner;
public class swap_no
{
		public static void swap(int n1,int n2)
		{
		n1=n1-n2;
		n2=n1+n2;
		n1=n2-n1;
		System.out.println("after the swaping");
		System.out.println("n1:"+n1);
		System.out.println("n2:"+n2);
		}
	    public static void main(String args[])
	    {   
	    	
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("enter value of n1=");
	    	int n1=sc.nextInt();
	    	System.out.println("enter value of n2=");
	    	int n2=sc.nextInt();
	    	swap_no s=new swap_no();
	    	s.swap(n1,n2);
	    }
	}


