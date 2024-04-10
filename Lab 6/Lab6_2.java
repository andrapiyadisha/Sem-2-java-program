
class Book{
  private String author_name;
    Book(String author_name){
  	     this.author_name = author_name;
    }
 
    void display(){
    System.out.println("Author Name is "+author_name);

   }

}
class Book_publication extends Book{
  private String title;
    Book_publication(String author_name, String title){
    	super(author_name);
    	this.title = title;
    }
    @Override
    void display(){
    	//super.display();
    	System.out.println("Book Title Name : "+title);
    }

}
class Paper_publication extends Book{
  private String title;
     Paper_publication(String author_name, String title){
    	super(author_name);
    	this.title = title;
     }
     @Override
     void display(){
    	//super.display();
    	System.out.println("Paper Tital Name : "+title);
    }
}
public class Lab6_2{
	public static void main(String[] args){
       Book b = new Book (args[0]);
       Book_publication pb = new Book_publication(args[0],args[1]);
       Paper_publication pp = new Paper_publication(args[0],args[2]);
       Book bd = b;
       bd.display();
       bd = pb;
       bd.display();
       bd = pp;
       bd.display();
	}
}