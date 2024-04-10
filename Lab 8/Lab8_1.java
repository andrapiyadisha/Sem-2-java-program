public class Lab8_1{
     public static void main(String[] args) {
     	int ans=1;
      try{
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
     	     for(int i=0;i<=y;i++){
     	     ans = ans*x;
           }
           }	
           catch(Exception e)
           {
            System.out.println(e);
           }
    
    }
}