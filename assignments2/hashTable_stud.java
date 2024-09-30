package assignments2;
import java.util.*;
public class hashTable_stud 
{
   
    String dob,name,course;
	public hashTable_stud( String dob, String name, String course) {
		
		this.dob = dob;
		this.name = name;
		this.course = course;
	}
    
	

	public void display()
	{
		System.out.println("dob:"+dob+"name:"+name+"course:"+course);
	}



	public static void main(String[] args)
	{
		 String dob,name,course;
		// int rollNo;
		Hashtable<Integer,hashTable_stud> hash=new Hashtable<>();
		hash.put(2,new hashTable_stud("2-5-2005","sak","bca"));
		hash.put(3,new hashTable_stud("12-9-2001","son","bcom"));
		hash.put(1,new hashTable_stud("11-7-2004","hdj","bba"));
		for(Integer rollNo:hash.keySet()) {
		hashTable_stud s=hash.get(rollNo);
		System.out.println("rollno:"+rollNo);
		s.display();
		}

	}

}
