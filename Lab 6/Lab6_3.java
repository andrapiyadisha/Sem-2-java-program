class Member{
	String name;
	int age;
	String phoneNumber;
    String address;
    double salary;


    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary(){
    	System.out.println("Salary: " + salary);
    }
}

class Employee extends Member{
    String specialization;

       Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
       }
}

class Manager extends Member{
    String department;

      Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

}


public class Lab6_3{
	public static void main(String[] args){
        Employee emp = new Employee("Disha", 19, "123-456-7890", "Goverthan Circal", 50000000, "Software Developer");
        Manager manager = new Manager("Drashti", 10, "987-654-3210", "Aayushman", 8000000, "Web Developer");

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);
	}
}