package se.JavaLexicon;

    public class NameRepository {
    private static String[] names = new String[0];

    public static int getSize()  {
    return names.length;
    }
    public static void addName(String[] names) {
    NameRepository.names = names;

    }

    public static void clear () {
        String[] names = new String[0];

    }
    public static String[] findAll() {
    return names.clone ();
    }
    }



