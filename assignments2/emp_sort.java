package assignments2;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
class one implements Comparable<one>
{
	int id;
	String name,location;
	double salary;
	public one(int id, String name, String location, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(one o)
	{
		return name.compareTo(o.name);
	}
}
public class emp_sort 
{ 
	
	private static ArrayList<one> emplist=new ArrayList<one>();
	
	 private static Scanner sc=new Scanner(System.in);
   private static void search()
    {   
    	
    	System.out.println("enter the id to search:");
    	int sid=sc.nextInt();
    	for(one emp1:emplist)
    	{
    		if(emp1.id==sid)
    		{
    			System.out.println("employee found"+emp1);
    			return;
    		}
    	}
    }
  
 
	public static void main(String[] args) 
	{   
		
		//emp_sort es=new emp_sort();
		Scanner sc=new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("1.add:");
			System.out.println("2.display emp:");
			System.out.println("3.search id:");
			System.out.println("4.sort employee:");
			System.out.println("5.exit:");
			System.out.println("enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter id:");
		    	int id=sc.nextInt();
		    	System.out.println("enter name:");
		    	String name=sc.next();
		    	System.out.println("enter location:");
		    	String location=sc.next();
		    	System.out.println("enter salary:");
		    	float salary=sc.nextInt();
		    	emplist.add(new one(id,name,location,salary));
				break;
			case 2:
				System.out.println(emplist);
				break;
			case 3:
				search();
				break;
			
			case 4:
				Collections.sort(emplist);
				for(one emp1:emplist)
		    	{
					System.out.println(emp1);
		    	}
			    break;
			case 5:
				System.out.println("existing!!");
				break;
				default:
					System.out.println("invalid choice");	
			}
		}
		while(ch!=4);

	}

}
