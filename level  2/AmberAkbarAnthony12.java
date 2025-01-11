

import java.lang.Math;
import java.util.Scanner;


public class AmberAkbarAnthony12{

 public static void main(String args[]){

        // Create input object for user input;
	Scanner scanner = new Scanner(System.in);	
		

     int[]age=new age[3];
     int height=new  height[3];

        // taking the input of user age 
	 System.out.println("Enter the  age and height of amar, akbar and anthony Respectively");
       for(int i=0;i<3;i++;){
System.out.print("enter age of friend ");
      age[i]=input.nextInt[];
System.out.print("enter height of friend ");
      age[i]=input.nextInt[];

	/* int amarAge = scanner.nextInt();
	 int amarheight = scanner.nextInt();
	 int akbarAge = scanner.nextInt();
	 int akbarheight = scanner.nextInt();
	 int anthonyAge = scanner.nextInt();
	 int anthonyheight = scanner.nextInt(); */
	 
	 int tallest;
	 int oldest;

	 
 age[i]= Math.max(age[0],age[1],age[2]);
	height[i] = Math.max(height[0],height[1],height[2]);
	 
	 System.out.println("Smallest element " + age[i] + "Largest element " + height[i]);
	 
	scanner.close();
 }
}