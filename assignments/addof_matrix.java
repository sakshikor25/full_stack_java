package assignments;
import java.util.Scanner;
public class addof_matrix
{

	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows");
		int r=sc.nextInt();
		System.out.println("enter the no of cols");
		int c=sc.nextInt();
		int[][] m1=new int[r][c];
		int[][] m2=new int[r][c];
		int[][] sum=new int[r][c];
		System.out.println("enter the no for mat1:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				 m1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("enter the no for mat2:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				 m2[i][j]=sc.nextInt();
				
			}
		}
        System.out.println("sum of the matrix is:");
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		sum[i][j]=m1[i][j]+m2[i][j];
        	}
        }
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		System.out.print(sum[i][j]+"\t");
        	}
        	System.out.println();
        }
	}

}
