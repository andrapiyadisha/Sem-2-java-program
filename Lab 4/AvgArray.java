import java.util.Scanner;
  public class AvgArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num={10,20,30,40};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        double average = sum /4;
        System.out.println("Avg="+average);
    }
  }