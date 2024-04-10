import java.util.Scanner;
public class Pri{
	public static void main(String[] args){
		System.out.println("Enter character");
    Scanner sc=new Scanner(System.in);
 	String s=sc.next();
 	int n = s.length();
    boolean pali = true;
    int start=0,end=s.length()-1;
 	while(start<=end){
       if(s.charAt(start)!=s.charAt(end)){
       	pali=false;
       	break;
       }
       start++;
       end--;
 	}
 	if(pali)
 		System.out.println("Palindrome");
 	else
 		System.out.println("Not Palindrome");
		}
	}
