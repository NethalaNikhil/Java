package NestedConditionsAndScanner;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer");
        int number = sc.nextInt();

        System.out.println("Enter next word");
        String word = sc.next();

        

        System.out.println("Enter decimal value");
        Double decimalValue = sc.nextDouble();

        sc.nextLine();

        System.out.println("Enter paragraph");
        String para = sc.nextLine();
    


        System.out.println("integer value ="+number);
        System.out.println("word = "+word);
        System.out.println("paragraph = "+para);
        System.out.println("Decimal value = "+decimalValue);
        sc.close();
    }
    
}
