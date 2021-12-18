package javalab2;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ?");
        int num = scan.nextInt();


        for(int i=0;i<=10;i++){
            System.out.println(num +"*"+i+"="+num*i);
        }
    }
}
