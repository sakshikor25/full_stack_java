package assignments2;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class retirementAge_cal
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your date of birth(yyyy-mm-dd):");
	    String dob=sc.next();
		System.out.println("enter your joining date:");
		String jd=sc.next();
		LocalDate dateofBirth=LocalDate.parse(dob);
		LocalDate dateofjoining=LocalDate.parse(jd);
		  Period time=Period.between(dateofBirth, dateofjoining);
        LocalDate retirementDate=dateofBirth.plusYears(58);
        System.out.println("your retirement date is:"+retirementDate);
	}

}
