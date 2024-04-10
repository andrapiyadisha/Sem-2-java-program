import java.util.Scanner;
public class Max{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(a>b){
			if(a>c){
				System.out.println(a+" is max");
			}else{
				System.out.println(c+" is max");
			}
		}else
		{
			if(b>c){
				System.out.println(b+" is max");
			}else
			{
				System.out.println(c+" is max");
			}
		}
	}
}