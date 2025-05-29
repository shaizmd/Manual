
import java.util.Scanner;

public class Exceptiondemo {

    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b");
        a = in.nextInt();
        b = in.nextInt();
        try {
            int result = a / b;
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error" + e);
        }
        int arr[] = {1,2,3,4};
       try {
           System.out.println(arr[5]);
       } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("array index out of bounds"+ e);
       }
    }
}
