import java.util.Scanner;
public class UpperCase{

public static String convertToUpperCaseUsingCharAt(String str) {
    String result = "";  // Initialize an empty string to store the result
    
    // Loop
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            // Convert to uppercase using ASCII value difference
            ch = (char)(ch-32);
        }
        result += ch;  // Append the character to the result string
    }
    
    return result;
}

public static String convertToUpperCaseUsingBuiltIn(String str) {
    // Use the built-in toUpperCase() method to convert the string to uppercase
    return str.toUpperCase();
}
public static void main(String[]args){

Scanner input=new Scanner(System.in);
String str=input.nextLine();

String upperUser=convertToUpperCaseUsingCharAt(str);
String upperBuilt=convertToUpperCaseUsingBuiltIn(str);

System.out.println(upperUser);
System.out.println(upperBuilt);

 /*boolean areEqual = compareStrings(upperUser, upperBuilt);
public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }

*/

if(upperUser.equals(upperBuilt)){System.out.println("both same"); }
    }
}