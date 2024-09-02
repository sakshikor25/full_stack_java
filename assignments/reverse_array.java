package assignments;
import java.util.Scanner;
public class reverse_array 
{
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of no:");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("enter the values:");
		for(int i=0;i<num.length;i++)
	    {
        	int value = sc.nextInt();
            num[i] = value;
        }
		System.out.println("reverse of array is:");
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}

}
