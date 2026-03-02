package corejava.javabasics.foundation;

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
        System.out.println("Comparing " +txt_3+ " and " +txt_4+ " through equalsIgnoreCase() method: " +(txt_3.substring(3, 9).equalsIgnoreCase(txt_4))); // case-insensitive
        System.out.println("Implementing the contain() method on txt_3: " +(txt_3.toLowerCase().contains("are"))); // contains() is case-sensitive
        String txt_5 = "" ;
        System.out.println( "After the isEmpty() operation on txt_5 the answer is " +(txt_5.isEmpty()));
        System.out.println("after implementing the isEmpty() method the answer is "  +("  ".isEmpty()));
        System.out.println("using the replace() method on txt_3 = " +(txt_3)+ " final result is  " +(txt_3.replace("ARE" , "are" )));
        System.out.println("Implementing the startsWith() method on txt_1, result is: " +(txt_1.startsWith("Implementing")));
        System.out.println("Implementing the endsWith() method on txt_2, result is: " +(txt_2.endsWith("of")));




    }
}
