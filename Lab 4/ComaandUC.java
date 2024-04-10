import java.util.Scanner;
public class ComaandUC{
  public static void main(String[] args){
    String s=args[0];
    if(s.charAt(0)>65){
      System.out.println("Valid");
    }
    else if(s.charAt(0)<92){
      System.out.println("Error");
    }
  }
}