import java.util.Scanner;
public class Mark{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Subject Marks:");
		System.out.println("M1:");
		int M1=sc.nextInt();
		System.out.println("M2:");
		int M2=sc.nextInt();
	    System.out.println("M3:");
		int M3=sc.nextInt();
	    System.out.println("EM4:");
		int M4=sc.nextInt();
	    System.out.println("M5:");
		int M5=sc.nextInt();
		System.out.println("PR="+((M1+M2+M3+M4+M5)/5));
	    int PR=sc.nextInt();

	    if(PR>=60){
	    	System.out.println("First Division");
	    }else if( PR>=50){
	    	System.out.println("Second Division");
	    }else if(PR>=40){
	    	System.out.println("Third Division");
	    }else{
	    	System.out.println("Fail");
	    }
	}
}
