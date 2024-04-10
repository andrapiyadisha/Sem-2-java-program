class Odd extends Thread{
 public void run(){
 	for(int i=1;i<=20;i+=2){
 		System.out.println(i);
 	}
 }
}

class Even extends Thread{
 public void run(){
 	for(int i=2;i<=20;i+=2){
 		System.out.println(i);
 	}
 }
}


public class Lab9_2{
	public static void main(String[] args) {
		Odd A1 = new Odd();
		Even A2 = new Even(); 
		A1.start();
		A2.start();
	}
}