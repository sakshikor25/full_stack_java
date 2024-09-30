package assignments2;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.*;
public class person_age
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your date of birth(yyyy/mm/dd):");
	    String dob=sc.next();
		System.out.println("enter the current date(yyyy/mm/dd):");
		String cd=sc.next();
		LocalDate dateofBirth=LocalDate.parse(dob);
        LocalDate currentDate=LocalDate.now();
        Period age=Period.between(dateofBirth, currentDate);
        System.out.println("YOU ARE\t"+age.getYears()+"YEARS,"+age.getMonths()+"MONTHS,&\t"+age.getDays()+"DAYS OLD!!");
	}

}
