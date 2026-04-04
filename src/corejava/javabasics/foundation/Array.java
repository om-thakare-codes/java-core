package corejava.javabasics.foundation;

import java.util.Scanner;
import java.util.Arrays;
public class Array {
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

        //Implementation of different array utility class methods
        int[] id = {2321, 4334, 5435, 6433, 7535, 7543, 6785, 7864, 3452, 6754, 8790};
        System.out.printf("All employee ids are: %s%n", Arrays.toString(id) );
        Arrays.sort(id);
        System.out.printf("Sorted array is %s%n ", Arrays.toString(id));
        System.out.println("Enter the name whose index you wish to check ");
        Arrays.sort(name);
        String indexCheck = input.next();
        System.out.printf("the name %s is on index %s %n",indexCheck, Arrays.binarySearch(name, indexCheck) );
        int[] serialNb = {1, 2, 3, 4, 5, 6};
        int[]  rollNb = {1, 2, 3, 4, 5, 6};
        System.out.print("Array serialNb and rollNb are equal: ");
        System.out.printf("%s %n", Arrays.equals(serialNb, rollNb));
        int[] emptyArray = new int[5];
        System.out.println("An empty array is present, enter the number which you want the array filled with.....");
        int fill = input.nextInt();
        Arrays.fill(emptyArray, fill);
        System.out.printf("Your array is %s %n", Arrays.toString(emptyArray));
        int[] newArray  = Arrays.copyOf(serialNb, 10);
        System.out.println("The new array which has zeros in addition to the serialNb array is "+(Arrays.toString(newArray)));


        //========2D Array========
        //Simple example
        char[][] game = {
                {'#', '#', 'X'},
                {'X', 'X', '#'},
                {'X', '#', 'X'},
        };
        for (char[] chars : game) {
            for (char aChar : chars) {
                System.out.print(" " + aChar);
            }
            System.out.println();
        }

        //Implementation 1 - Cinema Booking
        char[][] theater = new char[3][5];
        for (int row = 0; row < theater.length; row++){
            Arrays.fill(theater[row], 'O');

        }
       System.out.println("Enter the row where you want to seat and then the number of seats you want in that row (at-most 5)");
        int row = input.nextInt() - 1;
        int col = input.nextInt();
        for (int i = 0; i < col; i++){
            theater[row][i] = 'X';
        }
        for(char[] row_use : theater){
            for (char col_use : row_use){
                System.out.print(" " +col_use);
            }
            System.out.println();
        }

        //Implementation 2 - Hidden Treasure
        String[][] map = {

                {"Sand", "Sand", "Sand", "Sand"},
                {"Sand", "Sand", "Sand", "Sand"},
                {"Sand", "Sand", "Gold", "Sand"},
                {"Sand", "Sand", "Sand", "Sand"},

        };
        boolean found = false;
        int mapR = 0;
        int mapC = 0;


        for ( int mapRow = 0; mapRow < map.length; mapRow++){
            for ( int mapCol = 0; mapCol < map[mapRow].length; mapCol++){
                System.out.print(" " +map[mapRow][mapCol]);
                if(map[mapRow][mapCol].equalsIgnoreCase("Gold")){
                    mapR = mapRow;
                    mapC = mapCol;
                    found = true;

                }
            }
            System.out.println();
        }
        if(found){
            System.out.printf("Treasure of %s found in the column number %d of row number %d %n", map[mapR][mapC], mapC + 1, mapR + 1);
        }


        //Implementation 3 - Multiplication table
        int[][] table = new int[5][5];
        for (int mul_1 = 0; mul_1 < table.length; mul_1++){
            for (int mul_2 = 0; mul_2 < table[mul_1].length; mul_2++){
                table[mul_1][mul_2] = mul_1 * mul_2;
                System.out.printf("%d ", mul_1 * mul_2);
            }
            System.out.println();
        }







    }
}
