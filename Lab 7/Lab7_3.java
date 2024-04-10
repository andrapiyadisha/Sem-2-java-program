interface Transport{
	public void deliver();
}

abstract class Animal{
   //public void display();
}
class Tiger extends Animal{
   public void display(){
   	System.out.println("Tiger Class");
   }
}
class Camel extends Animal implements Transport{
  public void display(){
   	System.out.println("Camel Class");
   }
  public void deliver(){
      System.out.println("Camel deliver");
  }
}
class Dear extends Animal{
  public void display(){
   	System.out.println("Dear Class");
   } 
}
class Donkey extends Animal implements Transport{
  public void display(){
   	System.out.println("Donkey Class");
   }
  public void deliver(){
      System.out.println("Donkey deliver");
  } 
} 

public class Lab7_3{
	public static void main(String[] args) {
		 Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Dear();
        animals[3] = new Donkey();

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                Transport transportAnimal = (Transport) animal;
                transportAnimal.deliver();
            }
        }
	}
}