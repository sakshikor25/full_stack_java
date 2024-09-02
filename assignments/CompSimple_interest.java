package assignments;
import java.util.Scanner;
public class CompSimple_interest
{
    int p,r,n;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal=");
		int p=sc.nextInt();
		System.out.println("enter the rate=");
		int r=sc.nextInt();
		System.out.println("enter the no of time=");
		int n=sc.nextInt();
		float SI=p*r*n/100;
		System.out.println("simple interest is:"+SI);
		float CI=p*(1+(r/n))*r*n;
		System.out.println("compound interest is:"+CI);
		
	}

}
