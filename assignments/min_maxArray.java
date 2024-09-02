package assignments;
import java.util.Scanner;
public class min_maxArray 
{

	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the values in array");
		for(int i=0;i<size;i++)
		{
			int value=sc.nextInt();
			arr[i]=value;
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
					if(max<arr[i])
					{
					 max=arr[i];
					}
					else if(min>arr[i])
					{
					 min=arr[i];	
					}
		}
		System.out.println("maximum no is:"+max+"\n minimum no is:"+min);
	}

}
