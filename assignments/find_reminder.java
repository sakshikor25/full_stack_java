package assignments;
import java.util.Scanner;
public class find_reminder 
{
      int n1,n2;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no1");
        int n1=sc.nextInt();
        System.out.println("enter the no2");
        int n2=sc.nextInt();
        int rem =n1-(n1/n2)*n2;
        System.out.println("reminder is:"+rem);
	}

}
