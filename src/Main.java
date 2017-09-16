import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner sc=new Scanner(System.in);
		//int len=sc.nextInt();
		//StudentGroup sg=new StudentGroup(len);
		
	    /*
		
		
		*/
		while(true)
		{
			System.out.println("Main Menu");
			System.out.println("1.create student array");
		    System.out.println("2.get student data");
			System.out.println("3.set student details ");
			System.out.println("4.get student details by index");
			System.out.println("5.get student details by id");
			System.out.println("6.get student details by name");
			System.out.println("7.get student details by dateofbirth");
			System.out.println("8.get student details by avgmark");
			System.out.println("9.addFirst");
			System.out.println("10.addLast");
			System.out.println("11.remove from index");
			System.out.println("12.remove to index");
				System.out.println("enter your option");
			int option=sc.nextInt();
			switch(option)
			{
				case 1: int len=sc.nextInt();
		                StudentGroup sg=new StudentGroup(len);	
                 					
				        break;
				case 2: Student stu[]=new Student[len];
			         	stu=sg.getStudents();
				        for(int i=0;i<len;i++)
						{
							System.out.println(stu[i]);
						}
				        
				        break;
				case 3: sg.setStudents(stu); 
				    	break;
				case 4: int index=sc.nextInt();
						System.out.println(sg.getStudent(index));
				        break;
				case 5: System.out.println(sg.getId());
				        break;
				
				case 6: System.out.println(sg.getFullName());
				        break;
				case 7: System.out.println(sg.getBirthDate());
				        break;
				case 8: System.out.println(sg.getAvgMark());
				        break;
				case 9: 
				        break;
				case 10: System.out.println(sg.addLast(stu));
				        break;
				case 11: int index=sc.nextInt();
				         sg.removeFromIndex(index);
				        break;
				case 12:  int index=sc.nextInt();
				         sg.removeToIndex(index);
				        break;
			}	
		}	
	}

}
