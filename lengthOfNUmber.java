// To print the length of a number input by user

import java.util.*;
public class lengthOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int length = 0;
        while(n != 0){
            n = n / 10;
            length++;
        }
        System.out.println("The length of the number is: " + length);
    }
}
