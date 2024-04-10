 class Comp{
	double real;
	double imaginary;
    
   public Comp(){
   	double real;
   	double imaginary;
   } 
   public Comp(double real,double imaginary){
		 this.real=real;
		 this.imaginary=imaginary;
   }
   public void addition(Comp n2){
      double realSum=this.real+n2.real;  
      double imagSum=this.imaginary+n2.imaginary;

      if (imaginary >= 0) {
            System.out.println(realSum + " + " + imagSum + "i");
        } else {
            System.out.println(realSum + " - " + (-imagSum) + "i");
        }
      
   }

}
public class ComplexNo{
	public static void main(String[] args){
	    Comp n1 = new Comp(2.0,4.9);
	    Comp n2 = new Comp(4.0,-3.7);
	    System.out.println("Sum of Complex Number:");
       n1.addition(n2);
		}
} 