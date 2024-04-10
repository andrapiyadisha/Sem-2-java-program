public class Rev{
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40, 50 };

        System.out.println("Original array:");
        for(int i=0;i<num.length;i++){
           System.out.print(num[i]+" ");
        }
        System.out.println();
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
    
}
