package assignments;
import java.util.Scanner;
public class averageNo_array 
{
	
	public static void main(String[] args)
    {   
		 int sum=0;
		 double average;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of arr:");
		int arr=sc.nextInt();
		int[] num=new int[arr];
		System.out.println("enter the no:");
	        for (int i = 0; i < num.length; i++)
	        {
	        	int no = sc.nextInt();
	            num[i] = no;
	        }
	      
	        for (int i = 0; i <num.length; i++)
	        {
	            sum =sum + num[i];
	        }
	 
	        average = sum / num.length;
	 
	        System.out.println("Average of numbers is : " + average);
	}

}
