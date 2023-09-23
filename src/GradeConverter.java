import java.util.Scanner;
public class GradeConverter {
    public static void main(String[] args){
        System.out.println("Enter the total number of courses taken this semester: ");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); //variable to store total number of courses

        //array to store scores of courses
        double[] numCourses = new double[x];
        String[] courseName = new String[x];

        for(int i = 0; i< numCourses.length; i++) {
            //looping through so user can enter scores and names of courses
            for (int j = 0; j < courseName.length; j++) {
                System.out.println("Enter name of course " + (i + 1) + ":");
                courseName[j] = scanner.next();
            System.out.println("Enter score for " + courseName[j] + ":");
                numCourses[i] = scanner.nextDouble();
            }

        }
    }

}
