interface A{
    int A = 10;

    void methodA();
}
interface A1 extends A{
	int A1 = 20;

	void methodA1();

}
interface A2 extends A{
    int A2 = 30;

	void methodA2();
}

interface A12 extends A1,A2{
    int A12 = 40;

	void methodA12();
}

class B implements A12{
	@Override
	public void methodA(){
	System.out.println("A is "+" "+ A);
    }

    @Override
	public void methodA1(){
	System.out.println("A1 is "+" "+ A1);
    }

    @Override 
	public void methodA2(){
	System.out.println("A2 is "+" "+ A2);
    }

    @Override
	public void methodA12(){
	System.out.println("A12 is "+" "+ A12);
    }
}


public class Lab7_2{
	public static void main(String[] args){
		B meth = new B();
		meth.methodA();
		meth.methodA1();
		meth.methodA2();
		meth.methodA12();
	}
}