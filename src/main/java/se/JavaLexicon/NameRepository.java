package se.JavaLexicon;
import java.util.Arrays;

public class NameRepository {


    // A private static array to store names
    private static String[] names = new String[0];

    public static String find(final String fullName){
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }
    // Method to get the size of the names array
    public static int getSize() {
        return names.length;
    }
    // Method to replace all names in the array with a new set of names
    public static void setNames(String[] names) {
        NameRepository.names = names;
    }
    // Method to clear the names array
    public static void clear() {
        names = new String[0];
    }
    // Method to get a copy of all names in the array
    public static String[] findAll() {
        return names.clone();
    }
    // Method to add a new name to the array
    // Returns true if the name was added, false if the name already exists
    public static boolean add(final String fullName) {
        String foundFullName = find(fullName);
        if (foundFullName != null) {
            return false;
        }
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[newNames.length - 1] = fullName;
        names = newNames;
        return true;
    }
    // Method to find names by first name
    // Returns an array of names that match the given first name
    public static String[] findByFirstName(final String firstName) {
        String[] matchingNames = new String[names.length];
        int count = 0;
        for (String name : names) {
            String[] parts = name.split(" ");
            if (parts[0].equalsIgnoreCase(firstName)) {
                matchingNames[count++] = name;
            }
        }
        return Arrays.copyOf(matchingNames, count);
    }
    // Method to find names by last name
    // Returns an array of names that match the given last name
    public static String[] findByLastName(final String lastName) {
        String[] matchingNames = new String[names.length];
        int count = 0;
        for (String name : names) {
            String[] parts = name.split(" ");
            if (parts[parts.length - 1].equalsIgnoreCase(lastName)) {
                matchingNames[count++] = name;
            }
        }
        return Arrays.copyOf(matchingNames, count);
    }
    // Method to update a name in the array
    // Returns true if the name was updated, false if the original name was not found
    public static boolean update(final String original, final String updatedName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                names[i] = updatedName;
                return true;
            }
        }
        return false;
    }
    // Method to remove a name from the array
    // Returns true if the name was removed, false if the name was not found
    public static boolean remove(final String fullName) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        String[] newNames = new String[names.length - 1];
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            if (i != index) {
                newNames[j++] = names[i];
            }
        }
        names = newNames;
        return true;
    }
}
