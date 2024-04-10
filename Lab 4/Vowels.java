import java.util.Scanner;
  public class Vowels{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string ");
    String s=sc.next();
    int n=s.length();
   int vow=0;
    int cons=0;
    for(int i=0;i<s.length();i++){
      if(s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o'|| s.charAt(i)=='u'){
        vow++;
      }
      else{
        cons++;
      }
    }
    System.out.println("Vowels="+vow);
    System.out.println("Consonant="+cons);
  }
}