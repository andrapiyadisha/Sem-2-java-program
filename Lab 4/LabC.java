import java.util.Scanner;
public class LabC{
  public static void main(String[] args){
    String s=args[0];
    if((s.charAt(0)>=65) && (s.charAt(0)<92))
      System.out.println("Valid");
    else
      System.out.println("Error");
  }
}