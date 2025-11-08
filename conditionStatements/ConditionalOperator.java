package conditionStatements;

public class ConditionalOperator {
    public static void main (String args[])
    {
        int number = 10;
        int number1 = 20;
        if(number>0)
        {
            System.out.println("positive number");
        }
        else
        {
             System.out.println("negative number");
        }

        int max = (number>number1) ? number:number1;
        System.out.println(max);

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter valid number");
                break;
        }
    }
}
