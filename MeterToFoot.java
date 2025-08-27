// To convert metre to foot

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the meter value: ");
        double meter = sc.nextDouble();
        double foot = meter/0.305;
        System.out.println("meter in foot is: "+ foot);
    }
}
