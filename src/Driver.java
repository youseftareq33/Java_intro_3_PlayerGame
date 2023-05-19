import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int student_id; //declaring student id
		int student_num; //declaring student number
		int num_of_class; //declaring number of classes
		double grade; //declaring the grade
		String f_name = null; //declaring student first name
		String l_name; //declaring student last name
		String d_o_b; //declaring student date of birth
		String email; //declaring student email
		
		System.out.println("------------------- Student Info -------------------\n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number of classes: "); //ask user to enter number of classes
		
		num_of_class= scanner.nextInt();
		while(num_of_class < 1){ //make a condition(if the number of classes less than 1 ask the user to re-enter number of classes number = 1 or above 1)
			System.out.println("number of class must be more one and above !!!!!!!!");
			System.out.print("Enter Number of classes: ");
			
			num_of_class= scanner.nextInt();
			

			}
		Student student_arr[][]= new Student[num_of_class][];  
		
		for(int i=0; i< num_of_class; i++) { //make the first loops to enter number of student
			System.out.print("Enter Number of students in class# "+(i+1)+" : ");
			student_num= scanner.nextInt();
			while(student_num < 1 || student_num>100){ //make a condition(if the student number less than 1 or more than 100 ask the user to re-enter number of student between(1-100)
				System.out.println("number of student must bettwen (1 to 100)!!!!");
				System.out.print("Enter Number of students in class# "+(i+1)+" : ");
				student_num= scanner.nextInt();
				

				}
			student_arr[i]= new Student[student_num];
			
			
			for(int k=0; k<student_arr[i].length; k++) { //make the second loops to enter student(name,id,date of birth,grade) 
			System.out.print("Enter Student name: ");
			f_name= scanner.next(); //read student first name
			l_name= scanner.next(); //read student last name
			System.out.print("Enter Student id: ");
			student_id= scanner.nextInt(); //read student id
			System.out.print("Enter student date of birth: ");
			d_o_b= scanner.next(); //read student date of birth
			System.out.print("Enter student grade: ");
			grade=scanner.nextDouble(); //read student grade
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////");
			student_arr[i][k]= new Student(student_id,f_name,l_name,d_o_b,grade);
			
		}
			
	}
		double total=0;
		int total_stud=0;
		for(int i=0;i<student_arr.length;i++) { //make loops to show number of class
			System.out.println("class#"+(i+1)+" ordering");
			total = 0;
			total_stud = 0;
			for(int j=0;j<student_arr[i].length;j++) { //make loops to print student(id,name,date of birth,email,grade) 
				System.out.print("Id: "+student_arr[i][j].getid()+", "+"Name: "+student_arr[i][j].getf_name()+student_arr[i][j].getl_name()+
						", "+"Date of Birth: "+student_arr[i][j].getd_o_b()+
						",  "+"Email:"+student_arr[i][j].getemail()+", "+"Grade: "+student_arr[i][j].getgrade()+"\n");
				total=total+student_arr[i][j].getgrade();
				total_stud++;
			}
			double avg;
			avg=(total /total_stud);
			
				System.out.println("\n"+"Avg of class #"+(i+1)+": "+avg); //print the average of class
			System.out.println("-----------------------------------------------------------------------------------");
		}
		
   }
}