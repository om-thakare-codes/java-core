package corejava.javabasics.foundation;

import java.util.Scanner;

public class Arrays {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int[] roll_nb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] name = {"Om", "Ritika", "John", "Snow", "Victor", "Naruto", "Luffy", "Ichigo", "Zoro", "Sanji"};
        int[] marks = {90, 98, 76, 89, 34, 56, 67, 56, 17, 87};
       System.out.println("Select whether you want data of a particular student or entire class......");
        String data_of = input.nextLine();
        if (data_of.equalsIgnoreCase("particular student")){
            System.out.println("Enter the roll number of the student whose marks you wish to check......");
            int roll = input.nextInt();
            System.out.println("Roll number " +(roll)+ ", " +name[roll - 1]+ " scored " +marks[roll - 1]+ " marks");
        }
        else if (data_of.equalsIgnoreCase("entire class")) {

            for (int i = 0; i < roll_nb.length; i++) {
                System.out.println(name[i] + " roll number " + roll_nb[i] + " scored " + marks[i]);
            }
        }
        else{
            System.out.println("Cannot process your request.....");
        }
    }
}
