package corejava.javabasics.foundation;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String [] args){
        String txt_1 = "Implementing different operations on the string ";
        System.out.println("The index of the word on is " +(txt_1.indexOf("on")));
        System.out.println("The length of the given sting is " +(txt_1.length()));
        System.out.println("Upper case of the string is " +(txt_1.toUpperCase()));
        System.out.println("Lower case of the string is " +(txt_1.toLowerCase()));
        System.out.println("The character at the index position 5 is " +(txt_1.charAt(5)));
        String txt_2 = "Implementing the comparison operation of string ";
        System.out.println("String txt_1 is " +(txt_1)+ " and String txt_2 is " +(txt_2));
        System.out.println("The length of the given sting is " +(txt_2.length()));
        System.out.println("Comparing txt_1 and txt_2 " +(txt_1.equals(txt_2))); // case-sensitive
        System.out.println("implementation of substring() function on txt_2: " +(txt_2.substring(12, 41)));
        String txt_3 = "BOTH ARE SAME";
        String txt_4 = "both are same";
        System.out.println("Comparing " +txt_3+ " and " +txt_4+ " through equalsIgnoreCase() method: " +(txt_3.equalsIgnoreCase(txt_4))); // case-insensitive
        System.out.println("Implementing the contain() method on txt_3: " +(txt_3.toLowerCase().contains("are"))); // contains() is case-sensitive
        String txt_5 = "" ;
        System.out.println( "After the isEmpty() operation on txt_5 the answer is " +(txt_5.isEmpty()));
        System.out.println("after implementing the isEmpty() method the answer is "  +("  ".isEmpty())); //space  is count as a character in isEmpty method
        System.out.println("using the replace() method on txt_3 = " +(txt_3)+ " final result is  " +(txt_3.replace("ARE" , "are" )));
        System.out.println("Implementing the startsWith() method on txt_1, result is: " +(txt_1.startsWith("Implementing")));
        System.out.println("Implementing the endsWith() method on txt_2, result is: " +(txt_2.endsWith(" ")));
        String txt_6 = " ";
        System.out.println("The txt_6 has an empty space...  isBlank() method checks the space too and does not consider it as character  " +(txt_6.isBlank()));
        String data = "Mango, Banana, Apple, Grapes ";
        String[] splitData = data.split(",");
        System.out.println(Arrays.deepToString(splitData));
        System.out.printf("This is the implementation of the trim() method %s %n ", "      HELLO    ".trim());
        System.out.println("The concat() method is use to combine two strings: " +(txt_1.concat(txt_2)));
        System.out.printf("The lastIndexOf() method is use to know when the character is used last: %d %n  ", data.lastIndexOf("a"));

        //Implementation  1
        System.out.println("Enter the email you signed up with: ");
        Scanner input = new Scanner(System.in);
        String email  = input.nextLine();
        email = email.toLowerCase().trim();
        if (email.endsWith(".com")){
            System.out.printf("%s is a valid email %n", email);
        }
        else{
            System.out.println("The email is not valid. Email must be from .com domain");
        }

        //Implementation 2
        System.out.println("Enter the URL of the picture: ");
        String picURL = input.nextLine();
        int lastIndex = picURL.lastIndexOf(".");
        System.out.printf("The picture is in the %s format ", picURL.substring(lastIndex + 1));


        //Implementation 3
        System.out.println("Enter the list of all the tags:");
        String tags = input.nextLine();
        String[] tagArray = tags.split(" ");
        for (int i = 0; i < tagArray.length; i++){
            String cleanTag = tagArray[i].trim();
            if (!tagArray[i].isBlank()){
                System.out.println("The tag is: " +(tagArray[i]));
            }
        }






    }
}
