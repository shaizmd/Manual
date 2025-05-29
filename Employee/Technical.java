
import java.util.Scanner;

public class Technical extends Employee{
    String skill;
    public void accept(){
        super.accept();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter skills:");
        skill = in.nextLine();

    }
    public void display(){
        super.display();
        System.out.println("Skills:"+skill);
    }
}