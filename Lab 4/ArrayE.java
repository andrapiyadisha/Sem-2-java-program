import java.util.Scanner;
public class ArrayE{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a Array");
    int[] arr= new int[10];
    for( int i=0;i<arr.length;i++){
    	arr[i]=sc.nextInt();
    	System.out.println("Array ="+arr[i]);
    }
    for( int i=0;i<arr.length;i++){
    	if(i % 2 == 0){
    		System.out.println("Array is ="+arr[i]);
    	}
    }
  	}
  }