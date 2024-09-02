package assignments;
import java.util.Scanner;
import java.lang.Math;
public class power_ofno
{
    int n1,n2;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no 1=");
		int n1=sc.nextInt();
		System.out.println("enter the no 2=");
		int n2=sc.nextInt();
		System.out.println("power of no "+n1+"^"+n2+" is= "+Math.pow(n1, n2));
	}

}
