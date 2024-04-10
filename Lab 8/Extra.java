import java.util.Scanner;
public class Extra{
	public static void main(String[] args) {
		double c = 1;
        try{
        	Scanner sc = new Scanner(System.in);

        	double a = sc.nextInt();
        	double b = sc.nextInt();
        	c=a/b;
        }catch(Exception e)
         {
            System.out.println(e);

         }
        // finally{
                 //System.out.println("C ="+c);
         //}
	}
}