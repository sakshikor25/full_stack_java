package assignments;
import java.util.Scanner;
public class find_chracter
{
    char c;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the character");
        char c=sc.next().charAt(0);
        if((c>='a' && c<='z')||(c>='A'&& c<='Z'))
        {
        	System.out.println("given character is alphabet");	
        }
        else if(c>=0 && c<=9)
        {
        	System.out.println("given character is digit");
        }
        else
        {
        	System.out.println("given character is special symbol");
        }
        
	}

}
