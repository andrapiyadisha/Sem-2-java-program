import java.util.Scanner;
class MyClass extends Thread{
    int[] currRow;
    int sum;

    MyClass(int[] currRow){
        this.currRow = currRow;
        this.sum = 0;
    }

    public void run(){
        for(int temp : currRow)
            sum += temp;
    }

    public int getSum(){
        return this.sum;
    }
}
public class LAb9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("Enter the element of row "+(i+1)+"and column "+(j+1)+" : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        MyClass[] t = new MyClass[m];

        for(int i=0;i<m;i++){
            t[i] = new MyClass(matrix[i]);
            t[i].start();
        }

        try{
            for(int i=0;i<m;i++){
                t[i].join();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        for(int i=0;i<m;i++){
            System.out.println("Sum of row "+(i+1)+" : "+t[i].getSum());
        }
        sc.close();
    }
}


