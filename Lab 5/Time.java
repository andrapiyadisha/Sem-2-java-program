 class Second{
	int Hour;
	int Min;

	public Second(int h,int m){
		 Hour=h;
		 Min=m;
   }
   public void addition(Second t2){
      int totalMin=this.Min+t2.Min;  
      int totalHour=this.Hour+t2.Hour;
      if(Min>60){
      	Min=Min%60;
      	Hour++;
      }
      System.out.println(totalHour+"hr"+totalMin+"m");
}
}
public class Time{
	public static void main(String[] args){
	    Second t1=new Second(2,25);
	    Second t2=new Second(4,25);
        t1.addition(t2);
		}
} 