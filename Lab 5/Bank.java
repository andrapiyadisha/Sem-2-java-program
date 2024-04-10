import java.util.Scanner;
   public class Bank{
   	public static void main(String[] arg){
        Account details= new Account("", "", "", "", 0.0);
       System.out.println("Enter Account Details:");
        details.getAccountDetails();
        System.out.println("\nAccount Details:");
        details.printDetails();
   	}
   }
   class Account{
   	String accountNo;
   	String userName;
   	String email;
   	String accountType;
   	double accountBalance;

   	 public Account(String accountNo, String userName, String email, String accountType, double accountBalance){
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

     public void getAccountDetails() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account No. =");   
        this.accountNo=sc.next();
         System.out.println("Enter User Name =");   
        this.userName=sc.next();
        System.out.println("Enter Email =");   
        this.email=sc.next();
         System.out.println("Enter Account Type =");   
        this.accountType=sc.next();
         System.out.println("Enter Account Balance =");   
        this.accountBalance=sc.nextDouble();
    }

    public void printDetails(){
    	 System.out.println("Account Number: " + this.accountNo);
        System.out.println("User Name: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Balance: " + this.accountBalance);

    }

      
   } 