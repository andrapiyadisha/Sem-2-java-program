import java.util.Scanner;
public class Celcius{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("F");
        int F=sc.nextInt();
        System.out.println("Celcius"+((F-32)*5/9));
    }
}