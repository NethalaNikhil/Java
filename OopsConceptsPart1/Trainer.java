package OopsConceptsPart1;

import java.util.Scanner;

public class Trainer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TrainerID: ");
        int trainerId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter TrainerName: ");
        String trainerName = sc.nextLine();
        System.out.println("Enter Trainer no of sessions: ");
        int noOfSessions = sc.nextInt();
        int sessionPayment = noOfSessions * 1500 ;
        Student stu = new Student ();
        stu.rating = 5 ;
        int rating =  stu.rating;
        if(rating == 5){
            sessionPayment += 5000;
        }
        System.out.println("Trainer id = "+trainerId);
        System.out.println("Trainer Name = "+trainerName);
        System.out.println("Trainer total payment = "+sessionPayment);


    }
}
