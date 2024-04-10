import java.util.Scanner;
class Student{
	int id_no;
	int no_of_subjects_registered;
	int[] subject_code;
	int[] subject_credits;
	String[] grade_obtain;
	double spi;

   Student(){
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Student ID :");
		   id_no = sc.nextInt();
		   System.out.println("Enter no of Subject registerd :");
		   no_of_subjects_registered = sc.nextInt();
		   subject_code = new int[no_of_subjects_registered];
		   subject_credits = new int[no_of_subjects_registered];
		   grade_obtain = new String[no_of_subjects_registered];

		   for(int i=0;i<no_of_subjects_registered;i++){
			   	System.out.println("Enter Subject code :"+(i+1));
			   	subject_code[i] = sc.nextInt();
			   	System.out.println("Enter Subject Credits :");
			   	subject_credits[i] = sc.nextInt();
			   	System.out.println("Enter Subject Grade :");
			   	grade_obtain[i] = sc.next();
		   }

   }
       public void calculate_spi(){
   	      double temp = 0.0;
   	      double totalCredit = 0.0;
   	      for(int i=0;i<no_of_subjects_registered;i++){
   	      	 totalCredit += subject_credits[i];
   	      	 int gradeW = 0;
             if(grade_obtain[i].equals("A")){
                gradeW = 10;
             }else if(grade_obtain[i].equals("B")){
                gradeW = 9;
            }
            temp = temp + (subject_credits[i]*gradeW);
   	      }
         spi = temp/totalCredit;

   }
}
public class StudentData{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(args[0]);
        Student[] s1 = new Student[n];
      for(int i=0;i<n;i++){
    	  s1[i] = new Student();
      }
      for(int i=0;i<n;i++){
      	s1[i].calculate_spi();
      }
      for(int i=0;i<n;i++){
      	System.out.println("SPI of Student Id: "+s1[i].id_no+" and spi is "+s1[i].spi);
      }
	}
}