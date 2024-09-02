package assignments;
import java.util.Scanner;
public class find_factorial 
{
   
	public static void main(String[] args)
	{   
		int no,f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number=");
	    no=sc.nextInt();
	     for(int i=1;i<no;i++)
	     {
	    	 while(i<=no)
	 		{
	 			f=f*i;
	 			i++;
	 		}
	     }
		
	
		System.out.println("factorial of given no is="+f);
		
	}

}
