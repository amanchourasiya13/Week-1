import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

            System.out.print("Enter the natural number:" );
           int  number = input.nextInt();

  // Create arrays for odd and even numbers (size = number / 2 + 1)
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];

        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;


for(int i=1;i<=number;i++){
        // Check if the age is positive or negative 
                 if (number>0) {

            // Check if the number is even or odd
                if (i % 2 == 0) {
                    evenNumbers[evenIndex]=i;
                     evenIndex++;
               System.out.println(oddNumbers[i]+" is even");
                } else {
                  oddNumbers[oddIndex]=i;
                  oddIndex++;
                    System.out.println(evenNumbers[i] + " is odd.");
                }
     }
                }



        // Close the input object
           input.close();
    }
}
