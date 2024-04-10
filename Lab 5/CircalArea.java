    class Box{
	int Radius;

	public Box(int r){
		Radius=r;
	}	
	public void printArea(){
		double Area=3.14*Radius*Radius;
		System.out.println("Area of Circal="+Area);
	}
}
public class CircalArea{
	public static void main(String[] args){
		Box myA1=new Box(2);
		myA1.printArea();

		Box myA2=new Box(4);
		myA2.printArea();

		Box myA3=new Box(1);
		myA3.printArea();
	}
} 