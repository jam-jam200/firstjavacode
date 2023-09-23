import java.util.Scanner;
public class GradeConverter {
    public static void main(String[] args){
        System.out.println("Enter the total number of courses taken this semester: ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); //variable to store total number of courses

        //array to store scores of courses
        double[] numCourses = new double[x];
        String[] courseName = new String[x];
        double sum = 0;

        for(int i = 0; i < courseName.length; i++) {
            //looping through so user can enter scores of courses
            System.out.println("Enter name for course " + (i + 1) + ":");
            courseName[i] = scanner.next();
        }

        for(int i = 0; i < numCourses.length; i++) {
            //looping through so user can enter scores of courses
            System.out.println("Enter score for course " + (i + 1) + ":");
            numCourses[i] = scanner.nextDouble();

            sum = sum + numCourses[i];
        }

        double average = sum / numCourses.length;

        if(average > 80) {
            System.out.println("Your grade is A");
        } else if (average < 80 && average > 60) {
            System.out.println("Your grade is B");
        } else if (average < 60 && average > 45) {
            System.out.println("Your grade is C");
        } else if (average < 45 && average > 40) {
            System.out.println("Your grade is D");
        } else if (average < 40 && average > 35 ) {
            System.out.println("Your grade is E");
        } else {
            System.out.println("Your grade is F");
        }


    }

}
