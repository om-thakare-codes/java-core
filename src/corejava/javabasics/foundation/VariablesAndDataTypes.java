package corejava.javabasics.foundation;

// Variables are containers for storing data values
// Data type defines what type of value a variable holds

public class VariablesAndDataTypes {
    public static void main(String [] args){
        String name = "Om"; // stores text or words
        int age = 20; //stores the whole numbers (can be a negative, zero or positive)
        char mid_name = 'D'; // stores a single character
        float height = 5.11f; // stores a decimal but has less precision (can be a negative, zero or positive)
        boolean status = true; // only stores true or false
        double weight = 58.4326d; // stores decimal too but with more precision (can be a negative, zero or positive)
        byte sem = 6; // stores very small number, range from -128 to 127
        long id = 583314L; // use to store very large numbers (can be a negative, zero or positive)

        System.out.println("Name of the person is " +name);
        System.out.println("This year his age  is " +age+ " years old ");
        System.out.println("The initial of his father's name is " +mid_name);
        System.out.println("Height of " +name+ " is " +height+ " ft ");
        System.out.println("It is " +status+ " that " +name+ " is a student ");
        System.out.println(name+ " weighs about " +weight+ " kilograms (not relevant i know -_-)");
        System.out.println("The student just started his " +sem+ "th semester ");
        System.out.println(name+ " had " +id+ " as his Roll number for 5th semester");
        System.out.println("This is the basic implementation of variables");



        // same code implemented with var keyword

        var name_1 = "Om"; // stores text or words
        var age_1 = 20; //stores the whole numbers (can be a negative, zero or positive)
        var mid_name_1 = 'D'; // stores a single character
        var height_1 = 5.11f; // stores a decimal but has less precision (can be a negative, zero or positive)
        var status_1 = true; // only stores true or false
        var weight_1 = 58.4326d; // stores decimal too but with more precision (can be a negative, zero or positive)
        var sem_1 = 6; // stores very small number, range from -128 to 127
        var id_1 = 583314L; // use to store very large numbers (can be a negative, zero or positive)

        System.out.println("Name of the person is " +name_1);
        System.out.println("This year his age  is " +age_1+ " years old ");
        System.out.println("The initial of his father's name is " +mid_name_1);
        System.out.println("Height of " +name_1+ " is " +height_1+ " ft ");
        System.out.println("It is " +status_1+ " that " +name_1+ " is a student ");
        System.out.println(name_1+ " weighs about " +weight_1+ " kilograms (not relevant i know -_-)");
        System.out.println("The student just started his " +sem_1+ "th semester ");
        System.out.println(name_1+ " had " +id_1+ " as his Roll number for 5th semester");
        System.out.println("This is the basic implementation of variables");


    }

}
