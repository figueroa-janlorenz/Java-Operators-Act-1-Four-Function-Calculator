package four.function.calculator;
import java.util.Scanner;


public class FourFunctionCalculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        
        System.out.println("\nCalculator Results");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));   
        //Division and modulus work a bit differently when negative nnumbers are used
    }
    
}
