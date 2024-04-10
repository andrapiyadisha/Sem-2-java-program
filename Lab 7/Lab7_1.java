abstract class Vegetable{
	String name;
	String color;

	Vegetable(String name, String color){
		this.name = name;
		this.color = color;
	}
	abstract public String toString();
}

class Potato extends Vegetable{
     Potato(){
     	super("Potato","Cream");
     }
     public String toString(){
     	return("Name :" +" "+ name +" "+ "Color :"+" "+ color);
     }
}

class Bringal extends Vegetable{
	 Bringal(){
     	super("Bringal","Purpal");
     }
     public String toString(){
     	return("Name :" +" "+ name +" "+ "Color :"+" " + color);
     }
}

class Tomato extends Vegetable{
	 Tomato(){
     	super("Tomato","Red");
     }
     public String toString(){
     	return("Name :" +" "+ name +" "+"Color :" +" " +color);
     }
}

public class Lab7_1{
	public static void main(String[] args){
		Potato p = new Potato();
		Bringal b = new Bringal();
		Tomato t = new Tomato();
		System.out.println(p);
		System.out.println(b);
		System.out.println(t);
		
	}
}