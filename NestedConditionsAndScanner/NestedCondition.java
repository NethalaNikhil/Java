package NestedConditionsAndScanner;
import java.util.Scanner;
public class NestedCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade level upto 12");
        int grade = sc.nextInt();
        int discount = 0;
        System.out.println("Enter base fee for the student");
        int baseFee = sc.nextInt();
        if (grade>8)
        {
            if(grade == 10)
            {
                discount += 3;
            }
            else if (grade == 12) {
                discount += 5;
            }
            System.out.println("Enter acedemic topper or not");
            String acedemic_top = sc.next().toLowerCase();
            boolean check = acedemic_top == "yes";
            System.out.println(check);
            if(acedemic_top.equals( "yes"))
            {
                System.out.println("hi");
                discount += 20;
            }
        }
        else if (grade >=6 && grade<8) {
            discount += 5;
        }

        double discountcal = 1 - ((double)discount / 100 ) ;
        double discountAmount = baseFee * ((double)discount/100);
        double feeToPay = baseFee * discountcal;
        System.out.println("Student grade = "+ grade);
        System.out.println("Student base price = "+baseFee);
        System.out.println("Discount amount = "+ discountAmount );
        System.out.println("Fee to pay = "+feeToPay);
        sc.close();
    }
}
