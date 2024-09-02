package assignments;
import java.util.Scanner;
public class cal_grades
{
    int rno;
    float marks;
    String sname;
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rno of student");
		int rno=sc.nextInt();
		System.out.println("enter the name of student");
		String sname=sc.next();
		System.out.println("enter the marks of student");
		Float marks=sc.nextFloat();
		if(marks>=90)
		{
		   System.out.println("Grade is=A+");
		}
		else if(marks>=80)
		{
			System.out.println("Grade is=A");
		}
		else if(marks>=70)
		{
			System.out.println("Grade is=B");
		}
		else if(marks>=60)
		{
			System.out.println("Grade is=c");
		}
		else if(marks>=50)
		{
			System.out.println("Grade is=D");	
		}
		else if(marks>=40 && marks<=35)
		{
			System.out.println("Grade is=E");	
		}
		else 
		{
			System.out.println("Grade is=Fail");	
		}	
	}

}
