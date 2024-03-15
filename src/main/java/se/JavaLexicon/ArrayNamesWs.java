package se.JavaLexicon;

public class ArrayNamesWs {

    // Creates an array with space for 4 names
    private static final String[] names = new String[4];

    // Index to keep track of the next available spot in the array
    private static int index =0;

    //huvudmetod
    public static void main (String[] args) {
        addName ("Nicklas Soderman");
        addName ("Jeanette Soderman");
        addName ("Josefin Soderman");
        addName ("Carolin Soderman");

    printNames();
    }
    // Method to add a name to the array
    private static void addName (String fullName) {

        // Check if the array is full
        if (index >= names.length) {
            System.out.println("The Array is full, can not add more names");
            return; // Exit the method
        }
        names[index] = fullName; // Add the name to the array at the available spot
        index++;
    }
    // Method to print all names in the array
    private static void printNames() {
        for (String name : names) { // Loop through the array
            if (name != null) { // Check if the name is not null
                System.out.println (name); /// Print the name
            }
        }
    }
}





