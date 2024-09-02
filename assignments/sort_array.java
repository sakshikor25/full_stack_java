package assignments;
import java.util.Scanner;
import java.util.Arrays;
public class sort_array
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of no:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array:");
		for(int i=0;i<arr.length;i++)
		{   
			
			int array=sc.nextInt();
			arr[i]=array;
			
		}
 		System.out.println("sorting no in ascending order:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
