class GoodMorning implements Runnable{
     public void run(){
      try{
      	for(int i=0;i<10;i++){
            System.out.println("++++++++++Good Morning+++++++++");
          Thread.sleep(1000);

      	}
      }catch(Exception e){
      	System.out.println(e);
      }
  }
}


class GoodAfternoon implements Runnable{
      public void run(){
      try{
      	for(int i=0;i<10;i++){
            System.out.println("========= Good Afternoon =======");
            Thread.sleep(3000);


      	}
      }catch(Exception e){
      	System.out.println(e);
      }
  }
}



public class Lab9_1{
	public static void main(String[] args) {
		GoodMorning A1 = new GoodMorning();
		GoodAfternoon A2 = new GoodAfternoon();
		Thread A3 = new Thread(A1);
		Thread A4 = new Thread(A2);
		A3.start();
		A4.start();
	}
}