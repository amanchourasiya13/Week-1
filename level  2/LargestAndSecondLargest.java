import java.util.Scanner;

public class LargestAndSecondLargest {

    public static void main(String[] args) {
        // Create a input object 
        Scanner input = new Scanner(System.in);

        // Define the max size 
        int maxDigits = 10;

        // Create an array
        int[] digits = new int[maxDigits];

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize index variable
        int index = 0;

        // Loop to extract digits from the number and store them in the array
        while (number != 0 && index < maxDigits) {
            digits[index] = number % 10; 
            number /= 10;                 
            index++;                      
        }

        // Find the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output the largest and second largest
        if (largest == -1) {
            System.out.println("No digits found.");
        } else {
            System.out.println("The largest digit is: " + largest);
            if (secondLargest == -1) {
                System.out.println("There is no second largest digit.");
            } else {
                System.out.println("The second largest digit is: " + secondLargest);
            }
        }

        // Close the input
         input.close();
    }
}
