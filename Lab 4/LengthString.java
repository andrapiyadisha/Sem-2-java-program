import java.util.Scanner;
public class LengthString{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a string: ");
    String s=sc.next();
    int n=s.length();
    int temp=n/2;
    System.out.println(s.substring(temp));
   }
  }