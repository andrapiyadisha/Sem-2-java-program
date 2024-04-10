public class Lab8_2{
	public static void main(String[] args) {
		try{
			int x = Integer.parseInt(args[0]);
		    try{
		    	if(x>0){
		    	System.out.println("Number is "+x);
		     }
		    }
		    
		    catch(Exception e)
           {
            System.out.println(e);
           }
         }
          catch(Exception e)
           {
            System.out.println(e);
		}
	}
}
