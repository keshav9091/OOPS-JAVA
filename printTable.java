// To print the table of a number input by user

import java.util.*;

public class printTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("The table of " + n + " is: ");
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
