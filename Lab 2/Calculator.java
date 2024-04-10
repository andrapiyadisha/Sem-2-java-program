import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a oprator(+,-,*,/)=");
        char opreter=sc.next().charAt(0);
        System.out.println("a");
        int a=sc.nextInt();
        System.out.println("b");
        int b=sc.nextInt();
        switch (opreter){
            case '+':
                System.out.println(+(a+b));
                break;
            case '-':
                System.out.println(+(a-b)); 
                break;
            case '*':
                System.out.println(+(a*b));
                break;
            case '/':
                System.out.println(+(a/b));
                break;        
        default:
                System.out.println("Error");
                break;
        }
    }
}