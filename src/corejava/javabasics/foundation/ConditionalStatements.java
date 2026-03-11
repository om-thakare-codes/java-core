package corejava.javabasics.foundation;

import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //=========CONDITIONAL STATEMENTS=========

        //=========IF STATEMENT=========
       System.out.println("Enter the population of your area: ");
        int population = input.nextInt();

        if(population >= 5000){
            System.out.println("Your area can be considered as a city based on population ");


        }

        //=========IF ELSE=========
        System.out.println("Enter your first name: ");
        String first_name = input.next();
        if(first_name.length() >= 2){
            System.out.println("Valid first name");
        }
        else {
            System.out.println("Not a valid name");
        }


        //=========ELSE IF=========
        System.out.println("Enter your height in ft: ");
        double height = input.nextDouble();
        if (height >= 6 && height <= 7){
            System.out.println("Excellent !!");
        } else if ( height < 6 && height >= 5.7) {
            System.out.println("Good");
        } else if ( height < 5.7 && height >= 5.4) {
            System.out.println("Not bad IG");
        } else if ( height < 5.4 && height >= 5) {
            System.out.println("Needs an upgrade ASAP");
        } else if ( height < 5 && height >= 4.5) {
            System.out.println("Found the lost kid");
        }
        else {
            System.out.println("You kidding right ?");
        }




        //=========NESTED IF=========
        System.out.println("Enter your department: ");
        input.nextLine();
        String dept = input.nextLine();
        if (dept.equalsIgnoreCase("etc")){
            System.out.println("Enter your section: ");

            String sec = input.next();
            if (sec.equalsIgnoreCase("a")){

                System.out.println("Enter your roll number ");

                int roll_nb = input.nextInt();
                if(roll_nb <= 40 && roll_nb >= 1){
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class " +(first_name));
                }
                else{
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));


                }
            }else if (sec.equalsIgnoreCase("b")) {
                System.out.println("Enter your roll number ");
                int roll_nb_2 = input.nextInt();
                if (roll_nb_2 <= 80 && roll_nb_2 >= 41) {
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class Mr. " + (first_name));
                } else {
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));
                }
            }
            else{
                System.out.println("Invalid section. Choose between section A or B");
            }
        } else if (dept.equalsIgnoreCase("cse")){
            System.out.println("Enter your section: ");

            String sec = input.next();
            if (sec.equalsIgnoreCase("a")){
                System.out.println("Enter your roll number ");
                int roll_nb = input.nextInt();
                if(roll_nb <= 120 && roll_nb >= 81){
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class  " +(first_name));
                }
                else{
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));


                }
            }else if (sec.equalsIgnoreCase("b")) {
                System.out.println("Enter your roll number ");

                int roll_nb_2 = input.nextInt();
                if (roll_nb_2 <= 160 && roll_nb_2 >= 121) {
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class Mr. " + (first_name));
                } else {
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));
                }
            }
            else{
                System.out.println("Invalid section. Choose between section A or B");
            }
        } else if  (dept.equalsIgnoreCase("IT")){
            System.out.println("Enter your section: ");

            String sec = input.next();
            if (sec.equalsIgnoreCase("A")){
                System.out.println("Enter your roll number ");

                int roll_nb = input.nextInt();
                if(roll_nb <= 200 && roll_nb >= 161){
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class " +(first_name));
                }
                else{
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));


                }
            }else if (sec.equalsIgnoreCase("B")) {
                System.out.println("Enter your roll number ");

                int roll_nb_2 = input.nextInt();
                if (roll_nb_2 <= 240 && roll_nb_2 >= 201) {
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class Mr. " + (first_name));
                } else {
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));
                }
            }
            else{
                System.out.println("Invalid section. Choose between section A or B");
            }
        } else if (dept.equalsIgnoreCase("AIDs")){
            System.out.println("Enter your section: ");

            String sec = input.nextLine();
            if (sec.equalsIgnoreCase("a")){
                System.out.println("Enter your roll number ");

                int roll_nb = input.nextInt();
                if(roll_nb <= 280 && roll_nb >= 241){
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class " +(first_name));
                }
                else{
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));

                }
            }else if (sec.equalsIgnoreCase("B")) {
                System.out.println("Enter your roll number ");
                int roll_nb_2 = input.nextInt();
                if (roll_nb_2 <= 320 && roll_nb_2 >= 281) {
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class Mr. " + (first_name));
                } else {
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));
                }
            }
            else{
                System.out.println("Invalid section. Choose between section A or B");
            }
        }else if (dept.equalsIgnoreCase("ME")){
            System.out.println("Enter your section: ");

            String sec = input.nextLine();
            if (sec.equalsIgnoreCase("A")){
                System.out.println("Enter your roll number ");

                int roll_nb = input.nextInt();
                if(roll_nb <= 360 && roll_nb >= 321){
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class " +(first_name));
                }
                else{
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));


                }
            }else if (sec.equalsIgnoreCase("B")) {
                System.out.println("Enter your roll number ");

                int roll_nb_2 = input.nextInt();
                if (roll_nb_2 <= 400 && roll_nb_2 >= 361) {
                    System.out.println("Valid Entry \n");
                    System.out.println("Welcome to class Mr. " + (first_name));
                } else {
                    System.out.println("Roll number does not belong to section " +(sec)+ " or " +(dept));
                }
            }
            else{
                System.out.println("Invalid section. Choose between section A or B");
            }
        } else {
            System.out.println("Department does not exist. Please choose between  ETC, CSE, IT, AIDS, ME");
        }


        //=========SWITCH STATEMENT=========
        System.out.println("Enter initial of the city you want to search: ");
        String city = input.next();
        switch(city){
            case "A":
                System.out.println("Amravati , Akola, Akkalkot, Achalpur");
                break;

            case "B":
                System.out.println("Bhiwandi, Beed, Baramati, Bhandara");
                break;

            case "C":
                System.out.println("Chandrapur, Chiplun, Chalisgaon, Chopda");
                break;

            default:
                System.out.println("Data for this initial is not available.");
            }

        }



    }

