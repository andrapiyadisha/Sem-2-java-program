import java.util.Scanner;
public class PalindromeS{
 public static void main(String[] args){
 	System.out.println("Enter character");
    Scanner sc=new Scanner(System.in);
 	String s=sc.next();
 	int n = s.length();
    boolean pali = true;
 	for(int i=0;i<=n/2;i++){
       if(s.charAt(i)!=s.charAt(n-1-i)){
       	pali=false;
       	break;
       }
 	}
 	if(pali)
 		System.out.println("Palindrome");
 	else
 		System.out.println("Not Palindrome");
 }
}