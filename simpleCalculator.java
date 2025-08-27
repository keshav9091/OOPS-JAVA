// Simple calculator
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1:");
        double num1 = sc.nextDouble();
        
        System.out.println("Enter number 2:");
        double num2 = sc.nextDouble();
        
        System.out.println("The sum is: "+ (num1 + num2));
        System.out.println("The diff is: "+ (num1 - num2));
        System.out.println("The div is: "+ (num1 / num2));
        System.out.println("The product is: "+ (num1 * num2));
    }
}
