import java.util.Scanner;

  public class Vowels5{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     Counter counter = new Counter();
     String s;
    do{
      System.out.println("Enter a sentence:");
      s=sc.nextLine();
      counter.countVowels(s);
    }while(!s.equals("quit"));
    counter.printCounts();
  }
}
class Counter{
  int a;
  int e;
  int i;
  int o;
  int u;

  public void countVowels(String sentence){
    for(char c:sentence.toCharArray()){
      if(c=='a'){
        a++;
      }else if(c=='e'){
        e++;
      }else if(c=='i'){
        i++;
      }else if(c=='o'){
        o++;
      }else if(c=='u'){
        u++;
      }
    }
  }

      public void printCounts(){
      System.out.println("Total count");
      System.out.println("A: " + a);
      System.out.println("E: " + e);
      System.out.println("I: " + i);
      System.out.println("O: " + o);
      System.out.println("U: " + u);
     
    a=0;
    e=0;
    i=0;
    o=0;
    u=0;
     }
  }
