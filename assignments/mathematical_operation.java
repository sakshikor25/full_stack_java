package assignments;
import java.util.Scanner;
import java.io.*;
public class mathematical_operation
{
     int choice;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("mathematical operations:");
        System.out.println("1 addition");
        System.out.println("2 substraction");
        System.out.println("3 multiplication");
        System.out.println("4 division");
        System.out.println("5 module");
        System.out.println("enter the choice");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:
        	System.out.println("a=");
        	int a=sc.nextInt();
        	System.out.println("b=");
        	int b=sc.nextInt();
        	int c=a+b;
        	System.out.println("c="+c);
        break;
        case 2:
        	System.out.println("a=");
        	a=sc.nextInt();
        	System.out.println("b=");
        	b=sc.nextInt();
        	c=a-b;
        	System.out.println("c="+c);
        break;
        case 3:
        	System.out.println("a=");
        	a=sc.nextInt();
        	System.out.println("b=");
        	b=sc.nextInt();
        	c=a*b;
        	System.out.println("c="+c);
        break;
        case 4:
        	System.out.println("a=");
        	a=sc.nextInt();
        	System.out.println("b=");
        	b=sc.nextInt();
        	c=a/b;
        	System.out.println("c="+c);
        break;
        case 5:
        	System.out.println("a=");
        	a=sc.nextInt();
        	System.out.println("b=");
        	b=sc.nextInt();
        	c=a%b;
        	System.out.println("c="+c);
        break;
        default:
        }
        
        
	}

}
