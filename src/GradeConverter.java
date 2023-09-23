import java.util.Scanner;
public class GradeConverter {
    public static void main(String[] args){
        System.out.println("Enter the total number of courses taken this semester: ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); //variable to store total number of courses

        //array to store scores of courses
        double[] numCourses = new double[x];
        double sum = 0;
        double average = sum / numCourses.length;

        for(int i = 0; i < numCourses.length; i++) {
            //looping through so user can enter scores of courses
            System.out.println("Enter score for course " + (i + 1) + ":");
            numCourses[i] = scanner.nextDouble();
        }



    }

}
