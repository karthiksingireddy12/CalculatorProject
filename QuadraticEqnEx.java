package javalab2;

import java.util.Scanner;

public class QuadraticEqnEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        int d;
        d = b*b-4*a*c;
        if (d<0){
            System.out.println("Imaginary roots");
        }
        else{
            double r1 = ((-b+Math.sqrt(d))/(2*a));
            double r2 = ((-b-Math.sqrt(d))/(2*a));
            System.out.println("roots are"+ r1 + " " + r2);
        }
    }
}
