public class Tasks1 {
    public static void main(String[] args) {
        int id = 1 ;
        String name = "Nikhil";
        int age = 23;
        int attendence_percentage = 70;
        int quiz = 25;
        int assignmentScore = 10;
        int exam = 75;
        int total_score = quiz + assignmentScore + exam;
        int avgScore = total_score / 3;
        boolean passed = avgScore > 75 ;
        attendence_percentage +=1;
        boolean awarded = (avgScore >= 90)  &&  (attendence_percentage > 75) ;
        System.out.println(total_score);
        System.out.println(avgScore);
        System.out.println(passed);
        System.out.println(attendence_percentage);
        System.out.println(awarded);

    }
}
