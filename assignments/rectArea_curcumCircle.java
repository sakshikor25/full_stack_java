package assignments;
import java.util.Scanner;
public class rectArea_curcumCircle
{
    double l,w,r;
    double pi=3.14;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length=");
        float l=sc.nextFloat();
        System.out.println("enter the width=");
        float w=sc.nextFloat();
        float a_rect=l*w;
        System.out.println("area of rectangle is:"+a_rect);
        System.out.println("enter the radius=");
        double r=sc.nextFloat();
        double c_circle=2*3.14*r;
        System.out.println("curcumference of circle is:"+c_circle);
        
        
	}

}
