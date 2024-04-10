import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int org=n;
		int rev=0,num;
		while (n!=0){
		num=n%10;
		rev=rev*10+num;
		n=n/10;}
		if(rev==org){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
} 