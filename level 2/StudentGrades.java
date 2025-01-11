import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        // Create a input  object
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3];  // [][0] = Physics, [][1] = Chemistry, [][2] = Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Input marks for Physics
            int physics;
            do {
                System.out.print("Enter marks for Physics (0 to 100): ");
                physics = input.nextInt();
                if (physics < 0 || physics > 100) {
                    System.out.println("Please enter a valid value between 0 and 100.");
                }
            } while (physics < 0 || physics > 100);

            // Input marks for Chemistry
            int chemistry;
            do {
                System.out.print("Enter marks for Chemistry (0 to 100): ");
                chemistry = input.nextInt();
                if (chemistry < 0 || chemistry > 100) {
                    System.out.println("Please enter a valid value between 0 and 100.");
                }
            } while (chemistry < 0 || chemistry > 100);

            // Input marks for Maths
            int maths;
            do {
                System.out.print("Enter marks for Maths (0 to 100): ");
                maths = input.nextInt();
                if (maths < 0 || maths > 100) {
                    System.out.println("Please enter a valid value between 0 and 100.");
                }
            } while (maths < 0 || maths > 100);

            // Store the marks for the student
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;

            // Calculate the percentage
            double totalMarks = physics + chemistry + maths;
            percentages[i] = (totalMarks / 300) * 100;

            // Determine the grade based on the percentage
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B+";
            } else if (percentages[i] >= 60) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }

        // Display marks, percentages, and grades for each student
        System.out.println("\nStudent Results:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, Percentage = %.2f%%, Grade = %s\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the input
        input.close();
    }
}
