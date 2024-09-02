package assignments;
import java.util.Scanner;
public class ascii_value 
{
    char ch;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
		int ch=sc.next().charAt(0);
		int as_value=ch;
		System.out.println("ascii value of"+ch+" is: "+as_value);
		

	}

}
