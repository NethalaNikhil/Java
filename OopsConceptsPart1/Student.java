package OopsConceptsPart1;

import java.util.Scanner;

public class Student {
    int rating;      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StudentId: ");
        int stuId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter StudentName: ");
        String stuName = sc.nextLine();
        System.out.println("Enter StudentAttendance: ");
        int stuAttendance = sc.nextInt();
        System.out.println("Enter Score: ");
        int score = sc.nextInt();
        sc.close();
        int credits = 0;
        if(stuAttendance >=30)
        {
            credits += 5;
        }
        else if(stuAttendance>=20 && stuAttendance <=29)
        {
            credits +=3 ;
        }

        if(score >=85)
        {
            credits += 5;
        }
        else if(score>=60 && stuAttendance <=84)
        {
            credits +=3 ;
        }
        
        System.out.print(stuId +" "+ stuName+ " " + "have");
        if (credits >= 10) {
            System.out.print(" Good");
        }
        else if (credits >=8 && credits<=9) {
            System.out.print(" Better");
        }
        else{
            System.out.print(" Improve");
        }
        System.out.print(" credits");

    }
}
