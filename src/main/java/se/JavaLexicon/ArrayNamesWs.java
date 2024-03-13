package se.JavaLexicon;

public class ArrayNamesWs {

    private static String[] names = new String[4];
    private static int birthdays = 0;

    public static void main (String[] args) {
        addName ("Nicklas Soderman", "19610911");
        addName ("Jeanette Soderman", "19730507");
        addName ("Josefin Soderman", "20010224");
        addName ("Carolin Soderman", "20060606");

        printNames ();
    }

    private static void addName (String fullName, String birthday) {
        if (birthdays < names.length) {
            names[birthdays] = fullName + " " + birthday;
            birthdays++;
        }
    }

    private static void printNames () {
        for (String name : names) {
            if (name != null) {
                System.out.println (name);
            }
        }
    }
}





