package se.JavaLexicon;

public class ArrayNamesWs {

    private static String[] names = new String[4];
    private static int index =0;

    public static void main (String[] args) {
        addName ("Nicklas Soderman");
        addName ("Jeanette Soderman");
        addName ("Josefin Soderman");
        addName ("Carolin Soderman");

    printNames();
    }

    private static void addName (String fullName) {
        if (index >= names.length) {
            System.out.println("The Array is full, can not add more names");
            return;
        }
        names[index] = fullName;
        index++;
    }

    private static void printNames() {
        for (String name : names) {
            if (name != null) {
                System.out.println (name);
            }
        }
    }
}





