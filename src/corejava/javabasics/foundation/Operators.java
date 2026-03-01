package corejava.javabasics.foundation;

//Operators are used to perform operations on variables and values

public class Operators {
    public static void main (String [] args) {
        System.out.println("Arithmetic operator implementation, on two values (num_1, num_2)");
         var num_1 = 50;
         var num_2 = 12.0d;
         System.out.println("Given numbers are " +num_1+ " and " +num_2);
         System.out.println("Addition of the two numbers is " +(num_1 + num_2));
         System.out.println("Subtraction of two numbers is " +(num_1 - num_2));
         System.out.println("Multiplication of two numbers is " +(num_1 * num_2));
         System.out.println("After the division of two numbers the result (quotient) is " +(num_1/num_2));
         System.out.println("The reminder of the division is " +(num_1 % num_2));

        System.out.println("Implementation of the assignment operator and the compound assignment operator");
         var num_3 = 5d;
         var num_4 = 6.0d;
         System.out.println("Initial values of num_3 and num_4 are " +num_3+ " and " +num_4+ " respectively");
         System.out.println("After the += operation, value of num_3 is " +(num_3+=num_4));       // Add and assign
         System.out.println("After the -= operation, value of num_3 is " +(num_3-=num_4));      // Subtract and assign
         System.out.println("After the *= operation, value of num_3 is " +(num_3*=num_4));     // Multiply and assign
         System.out.println("After the /= operation, value of num_3 is " +(num_3/=num_4));    // Divide and assign
         System.out.println("After the %= operation, value of num_3 is " +(num_3 %= num_4)); //Modulus and assign


        System.out.println("Implementation of bitwise operators ");
         int real_1 = 4;
         int real_2 = 6;
         System.out.println("The initial values are " +real_1+ " and " +real_2);
         System.out.println("After performing the bitwise AND of two values, result is  " +(real_1 & real_2));
         System.out.println("After bitwise OR of the two values the result is " +(real_1 | real_2));
         System.out.println("After bitwise XOR of the two values the result is " +(real_1 ^ real_2 ));
         System.out.println("After bitwise complement of two values the results are "+(~real_1 )+ " and " +(~real_2));




        System.out.println("Implementation of the bitwise assignment operator");
         var num_5 = 4;
         var num_6 = 6;
         System.out.println("Initial values of num_5 and num_6 are " +num_5+ " and " +num_6+ " respectively");
         System.out.println("After bitwise AND and assign operation " +(num_5 &= num_6));
         System.out.println("Ater bitwise OR and assign operation " +(num_5 |= num_6));
         System.out.println("After bitwise XOR and assign operation " +(num_5 ^= num_6));
         System.out.println("After left shift and assign operation " +(num_5 <<= num_6));
         System.out.println("After right shift and assign operation " +(num_5 >>= num_6));


        System.out.println("Implementation of shifting operators ");



        System.out.println("Implementation of comparison/relational operators ");
         var big = 5;
         var small = 2;
         System.out.println(+big+ " > " +small+ " : " + (big > small));
         System.out.println(+big+ " < " +small+ " : " + (big < small));
         System.out.println(+big+ " is not equal to " +small+ " : " +(big!=small));
         System.out.println(+big+ " is greater than or equal to " +small+ " : " +(big >= small));
         System.out.println(+small+ " is smaller than or equal to " +big+ " : " +(small <= big));
         System.out.println(+big+ " is equal to " +small+ " : " +(big == small));


       System.out.println("Implementation of Logical Operators ");
        int num1 = 5, num2 = 8;
        var cond = true;
        System.out.println(+num1+ " is lesser than 10 AND " +num2+ " is lesser than 10 too: " +(num1 < 10 && num2 < 10));
        System.out.println(+num1+ " is greater than 6 OR " +num2+ " is greater than 6: " +(num1 > 6 || num2 > 6) );
        System.out.println("All 4 conditions for the above two statements are true: " +(!cond));


       System.out.println("Implementation of unary operators ");
        // Unary operators are used on only one operand(one variable/value)
        int value = 5;
        System.out.println("Initial value is " +value);
        System.out.println("Unary minus (-) changes the sign of the value: " +(-value));
        System.out.println("Increment operator(++) increases the value by 1: " +(++value) );
        System.out.println("Decrement operator decreases the value by 1: " +(--value));

        // Pre-increment and Post-increment
      int val_1 = 6;
      int val_2 = val_1;
      System.out.println("Implementation of Pre-increment and post-increment:- ");

      //post_increment
      System.out.println("Initial value of val_1 is " +(val_1)+ " and val_2 is: " +(val_2));
      val_1++;
      val_2++;
      System.out.println("After post increment the value of val_1 is " +(val_1)+ " and the value of val_2 becomes " +(val_2) );

      //pre-increment
       ++val_1;
       ++val_2;
      System.out.println("After pre-increment in the current value of val_1: " +(val_1)+ " and val_2 :" +(val_2));

      //Post-decrement and Pre decrement
      System.out.println("Current value of val_1 is: " +(val_1)+ " and for val_2, it is: " +(val_2));

      //Post-decrement
        val_1--;
        val_2--;
      System.out.println("After the post decrement operation val_1 becomes: " +(val_1)+ " and val_2 becomes: " +(val_2));

      //Pre-decrement
        --val_1;
        --val_2;
      System.out.println("After the pre decrement operation the value of val_1 becomes: " +(val_1)+ " and val_2 becomes: " +(val_2));

      //Logical NOT
        System.out.println("Implementation of Logical NOT operator: ");
        int age = 18;
        boolean canVote = age >= 18;
        if(canVote){
            System.out.println("Can vote.");
        }

        if(!canVote){
            System.out.println("cannot vote"); // will not execute because the value of canVote becomes FALSE due to Logical NOT operator
        }

      System.out.println("Implementation of shift operators ");
        var org_val = 100;
        System.out.println("Initial value is " +(org_val));
        System.out.println("After right shifting the initial value bitwise by 4, new value is  " +(org_val >> 3));
        System.out.println("After left shifting the initial value bitwise by 2, new value is " +(org_val << 2));
        System.out.println("After the unsigned right shift of the initial value bitwise by 4 the new value is  " +(org_val >>> 4 ));




        System.out.println("Implementation of ternary operator ");
        // ternary operator = (condition) ? if_true : if_false;
         var greater = 54;
         var smaller = 23;
         System.out.println("Between " +greater+ " and " +smaller+ " the smaller value is " +( (greater <= smaller) ? greater : smaller));










    }
}
