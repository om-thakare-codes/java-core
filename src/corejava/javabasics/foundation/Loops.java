package corejava.javabasics.foundation;

import java.util.Scanner;

public class Loops {
    public static void main(String [] args){
        //========WHILE LOOP========
        System.out.println("Enter the starting number and the ending number. This program will print squares of all the numbers in between: ");
        Scanner input = new Scanner(System.in);
        int first_num = input.nextInt();
        int last_num = input.nextInt();
        if(first_num > last_num) {
            System.out.println("The starting number should always be smaller than the ending number");
        }else {
            while (first_num <= last_num) {
                System.out.println("Square of " + (first_num) + " is " + (first_num * first_num));
                first_num++;

            }
        }

        //========FOR LOOP========
        int row = 5;
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }

        int ro = 5;
        int col = 1;
        for (int i = ro; i >= col; i--){
            for (int j = i; j >= col; j--){
                System.out.print(j+" " );
            }
            System.out.println();
        }

       for (int i = 5; i >= 1; i--){
           for (int j = 1; j <= i; j++){
               System.out.print(j+ " " );
           }
           System.out.println();
       }

       for (int i = 1; i <=5; i++){
           for (int j = 1; j <= i; j++){
               System.out.print(j+ " ");
           }
           System.out.println();
       }
       for (int i = 1; i <= 5; i++){
           for (int j = 5; j >= i; j--){
               System.out.print(j+ " ");
           }
           System.out.println();
       }
       for (int i = 1; i <= 5; i++){
           for (int j = i; j >= 1; j--){
               System.out.print(j+ " ");

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

            if(option.equalsIgnoreCase("Start")){
                System.out.println("Starts Playing Game");
            } else if (option.equalsIgnoreCase("menu")) {
                System.out.println("Records \n" +
                        "Game Graphics \n" +
                        "Audio Settings \n");


            } else if (option.equalsIgnoreCase("character")) {
                System.out.println("Update character design");

            }
            else if (option.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the game");

                }
            else{
                System.out.println("Enter the valid input");
            }
        }while(!option.equalsIgnoreCase("exit"));

    }

}
