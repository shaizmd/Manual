
import java.util.Scanner;

public class Contract extends Employee{
    int period;
    public void accept(){
        super.accept();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter period:");
        period = in.nextInt();
    }
    public void display(){
        super.display();
        System.out.println("Period:"+period);
    }
}