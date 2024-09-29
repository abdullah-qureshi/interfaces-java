public class Person implements Sorter<Person> {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void printFullName() {
        System.out.println("Name: " + name + " " + surname);
    }

    public int compare(Person p1, Person p2) {
        String surname1 = p1.getSurname();
        String surname2 = p2.getSurname();

        // Compare surnames
        int minLength = Math.min(surname1.length(), surname2.length());
        for (int i = 0; i < minLength; i++) {
            char c1 = surname1.charAt(i);
            char c2 = surname2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        // Surnames are equal, compare names
        String name1 = p1.getName();
        String name2 = p2.getName();

        minLength = Math.min(name1.length(), name2.length());
        for (int i = 0; i < minLength; i++) {
            char c1 = name1.charAt(i);
            char c2 = name2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        // If names are also equal compare by length
        return name1.length() - name2.length();
    }
}