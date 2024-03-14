package se.JavaLexicon;

    public class NameRepository {

        // en tom array för att lagra namn
        private static String[] names = new String[0];

        //returnerar hur många namn som finns i arrayen
        public static int getSize () {
            return names.length;
        }
        //ersätter alla namn med de nya
        public static void setNames (String[] names) {
            NameRepository.names = names;

        }
        //rensar arrayen på namn
        public static void clear () {
            String[] names = new String[0];

        }
        //returnerar en kopia på alla namn
        public static String[] findAll () {
            return names.clone ();
        }
        // ska hitta ett namn
        public static String find (final String fullName) {
            return null;

        }
        //ska lägga till ett nytt namn
        public static boolean add(final String fullName) {
            return false;
        }
        // ska hitta ett namn baserat på förnamnet
        public static String[] findByFirstName(final String firstName){
            return null;
        }
        // ska hitta ett namn baserat på efternamnet
        public static String[] findByLastName(final String LastName) {
            return null;
        }
        // ska uppdatera ett namn
        public static boolean update(final String Original, final String updatedName) {
            return false;
        }
        // ska ta bort ett namn
        public static boolean remove(final String fullName) {
            return false;

        }

    }
