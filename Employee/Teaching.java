
import java.util.Scanner;

public class Teaching extends Employee{
String domain;
int publication;
    public void accept(){
        super.accept();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the domain:");
        domain = in.nextLine();
        System.out.println("Enter publication:");
        publication = in.nextInt();
    }
    public void display(){
        super.display();
        System.out.println("Domain:"+domain);
        System.out.println("Publication:"+publication);
    }
}