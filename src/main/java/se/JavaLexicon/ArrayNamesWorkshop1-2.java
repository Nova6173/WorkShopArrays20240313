package se.JavaLexicon;

public class ArrayNamesWs {

    //skapar en array med plats för 4 namn
    private static final String[] names = new String[4];

   //
    private static int index =0;

    //huvudmetod
    public static void main (String[] args) {
        addName ("Nicklas Soderman");
        addName ("Jeanette Soderman");
        addName ("Josefin Soderman");
        addName ("Carolin Soderman");

    printNames();
    }
    //lägger till ett namn i arrayen
    private static void addName (String fullName) {
        // kollar om array är full
        if (index >= names.length) {
            System.out.println("The Array is full, can not add more names");
            return; // avslutar
        }
        names[index] = fullName; // lägger in namnet i arrayen
        index++;
    }
    // skriver ut alla namn i arrayen
    private static void printNames() {
        for (String name : names) { //loopar igenom arrayen
            if (name != null) { //kollar om namnet inte är null
                System.out.println (name); //skriver ut namnet
            }
        }
    }
}





