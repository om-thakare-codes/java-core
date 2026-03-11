package corejava.javabasics.foundation;

import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter information are per instructions given: ");
        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your employee ID: ");
        long id = input.nextLong();

        System.out.println("Enter the month of joining: ");
        String joinMonth = input.next();

        //Here we will use an extra nextLine to prevent the New line issue
        input.nextLine(); //This method will consume the new line created by user when they click on ENTER key

        System.out.println("Enter your role in the company: ");
        String role = input.nextLine();

        System.out.println("Enter your current salary: ");
        double salary = input.nextDouble();

        System.out.println("Are you working from home ? (true/flase): ");
        boolean wfh_status = input.nextBoolean();


        System.out.println("Employee's data is as follows: ");
        System.out.println("Name of the employee is " +(full_name));
        System.out.println( (full_name)+" is " +(age)+ " year old ");
        System.out.println("Their gender is " +(gender));
        System.out.println("Their employee ID is " +(id));
        System.out.println("Joined the company in the month of " +(joinMonth));
        System.out.println("Working as " +(role));
        System.out.println("Gets paid Rs. " +(salary));
        System.out.println("It is " +(wfh_status)+ " that " +(full_name)+ " is working from home" );



input.close();


    }
}
