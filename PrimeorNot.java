package javalab2;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = scan.nextInt();

        int x = (int) Math.sqrt(num);
        for (int i = 2;i<=x;i++){
            if(num%i ==0){
                System.out.println("The number is not prime..");
            }
            else{
                System.out.println("number is prime...");
            }
        }


    }
}
