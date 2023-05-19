
public class Student {
	
		private int id; //student id
		private double grade; //student grade
		private String f_name; //student first name
		private String l_name; //student last name
		private String email; //student email
		private String d_o_b; //student date of birth
		

		//main constructor
		public Student(int id, String f_name, String l_name, String d_o_b,double grade) {
			this.id= id;
			this.grade=grade;
			this.f_name = f_name;
			this.l_name = l_name;
			email = Emailconv(f_name,l_name); //email converter
			this.d_o_b= d_o_b;
		}
		
       // getters that the program use them
		public int getid() { //get id
			return id;
		}
		public double getgrade() { //get grade
			return grade;
		}
		public String getf_name() { //get first name
			return f_name;
		}
		
		public String getl_name() {// get last name
			return l_name;
		}
		public String getd_o_b() {// get date of birth
			return d_o_b;
		}
		public String getemail() {// get email
			return email;
		}
		
		private String Emailconv(String f_name, String l_name) {// email converter method
			char a = f_name.charAt(0);
			a = Character.toLowerCase(a);
			l_name = l_name.toLowerCase();
			
			return a + l_name+"@ritaj.birzet.edu";
		}
	}


