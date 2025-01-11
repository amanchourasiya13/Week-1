import java.util.Scanner;

public class MarksGradeCalculator1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades for each student
        double[] physicsMarks = new double[numberOfStudents];
        double[] chemistryMarks = new double[numberOfStudents];
        double[] mathsMarks = new double[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        String[] remarks = new String[numberOfStudents];

        // Take input for marks and calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            // Input marks for Physics
            do {
                System.out.print("Enter marks for Physics (0-100): ");
                physicsMarks[i] = input.nextDouble();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (physicsMarks[i] < 0 || physicsMarks[i] > 100);

            // Input marks for Chemistry
            do {
                System.out.print("Enter marks for Chemistry (0-100): ");
                chemistryMarks[i] = input.nextDouble();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100);

            // Input marks for Maths
            do {
                System.out.print("Enter marks for Maths (0-100): ");
                mathsMarks[i] = input.nextDouble();
                if (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (mathsMarks[i] < 0 || mathsMarks[i] > 100);

            // Calculate total and percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade and remarks based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4: Above agency-normalized standard";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3: At agency-normalized standard";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2: Below but appropriate agency-normalized standard";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1: Well below agency-normalized standard";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1: Too below agency-normalized standard";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standard";
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + physicsMarks[i]);
            System.out.println("Chemistry Marks: " + chemistryMarks[i]);
            System.out.println("Maths Marks: " + mathsMarks[i]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }

        // Close the input
        input.close();
    }
}
