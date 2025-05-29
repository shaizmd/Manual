
import java.util.Scanner;

public class Employee{
    String name;
    String ID;
    long phone;
    float salary;
    public void accept(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Staff ID:");
        ID = in.nextLine();
        System.out.println("Enter staff name:");
        name = in.nextLine();
        System.out.println("Enter Phone number");
        phone = in.nextLong();
        System.out.println("Enter salary");
        salary = in.nextFloat();
    }
    public void display(){
        System.out.println("Staff ID:"+ID);
        System.out.println("Name:"+name);
        System.out.println("Phone:"+phone);
        System.out.println("Salary:"+salary);
    }
}