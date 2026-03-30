package corejava.javabasics.foundation;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //========WHILE LOOP========
        System.out.println("Enter the starting number and the ending number. This program will print squares of all the numbers in between: ");
        Scanner input = new Scanner(System.in);
        int first_num = input.nextInt();
        int last_num = input.nextInt();
        if (first_num > last_num) {
            System.out.println("The starting number should always be smaller than the ending number");
        } else {
            while (first_num <= last_num) {
                System.out.println("Square of " + (first_num) + " is " + (first_num * first_num));
                first_num++;

            }
        }

        //========FOR LOOP========
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int ro = 5;
        int col = 1;
        for (int i = ro; i >= col; i--) {
            for (int j = i; j >= col; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
        input.nextLine();

        //========DO WHILE========
        String option = "";
        do {
            System.out.println("Welcome to the game. What would you like to do?");
            System.out.println(
                    "Start \n" +
                            "Menu \n" +
                            "Character \n" +
                            "Exit \n");
            option = input.next();

            if (option.equalsIgnoreCase("Start")) {
                System.out.println("Starts Playing Game");
            } else if (option.equalsIgnoreCase("menu")) {
                System.out.println("Records \n" +
                        "Game Graphics \n" +
                        "Audio Settings \n");


            } else if (option.equalsIgnoreCase("character")) {
                System.out.println("Update character design");

            } else if (option.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the game");

            } else {
                System.out.println("Enter the valid input");
            }
        } while (!option.equalsIgnoreCase("exit"));


        //========FOR EACH LOOP========
        //Implementation 1
        int sum = 0;
        String[] names = {"OM", "Ritika", "jay", "Vijay", "Nishtha", "ovi", "Ishita"};
        for (String name : names) {
            sum += name.length();
        }
        System.out.println("Total number of letters in array :) " + sum);
        //Implementation 2
        int[] allAges = {23, 54, 67, 87, 20, 54, 89, 66, 4, 78, 98, 20, 40, 64,};
        int evenCount = 0;
        for (int check : allAges) {
            if (check % 2 == 0) {
                evenCount++;
            }
        }
        input.nextLine();
        System.out.println("Out of " + (allAges.length) + " ages, " + (evenCount) + " are even ages...... and  " + (allAges.length - evenCount) + " are odd ages......");
        //Implementation 3
        String[] fruits = {"Apple", "Banana", "Mango", "Pineapple", "Custard apple", "Peach"};
        System.out.print("The the name of fruit you want to eat: ");
        String choice = input.nextLine();
        int present = 0;
        for (String fruit : fruits) {
            if (choice.equalsIgnoreCase(fruit)) {
                System.out.printf("%s is available you can eat %s %n", fruit, fruit);
                present++;
            }
        }
        if(present == 0){
            System.out.println("The fruit you wish to eat is not available");
        }
        //Implementation 4
        int[] numList = {34, 56, 43, 67, 89, 23, 90, 100, 2, 5, 8, 20};
        int largest = numList[0];
        for (int num : numList) {
            if (largest < num) {
                largest = num;
            }
        }
        System.out.printf("%d is the largest number in the numbList %n", largest);
        //Implementation 5
        int[] passwords = {234323, 235678, 765438, 7865, 8907643, 123098, 675};
        int correct = 0;
        for (int pass : passwords){
            if(pass >= 100000){
                correct++;
            }
        }
        if (passwords.length != correct){
            System.out.printf("%d passwords in the database are weak, update them %n ", passwords.length - correct);
        }
        else{
            System.out.println("All the passwords are strong");
        }
    }
}
