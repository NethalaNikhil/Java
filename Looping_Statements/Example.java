package Looping_Statements;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //forloop -> forward
        for(int i =1 ; i<=5 ; i++)
        {
            System.out.println(i);
        }

        System.out.println();

        //forloop -> backward
        for(int i = 5  ; i>=1 ; i--)
        {
            System.out.println(i);
        }

        //while loop
        System.out.println();
        int password = 5582;
        Scanner sc = new Scanner(System.in);
        int entered_pass = 0;
        while (password != entered_pass) {
            System.out.println("Enter phone password:");
            entered_pass = sc.nextInt();
        }
        System.out.println("Phone unlocked");

        //do-while
        System.out.println();
        int value = 0;
        do{
            System.out.println(value);
            value++;
        }
        while(value<=5);

        //nestedloop
        System.out.println();
        for(int outer = 1 ; outer<6 ; outer++)
        {
            for(int inner = 1 ; inner<6 ;inner++)
            {
                System.out.println(outer + "x" + inner + "= "+(outer*inner));
            }
         }
         sc.close();
        
    }

    
}
