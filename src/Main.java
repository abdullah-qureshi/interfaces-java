public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[4];

        persons[0] = new Person("Abdullah", "Qureshi");
        persons[1] = new Person("John", "Wick");
        persons[2] = new Person("Tyler", "Joseph");
        persons[3] = new Person("Josh", "Dun");

        persons[0].sort(persons);

        System.out.println("Sorted Persons:");
        for (Person person : persons) {
            person.printFullName();
        }

        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(5, 10);
        rectangles[1] = new Rectangle(3, 4);
        rectangles[2] = new Rectangle(6, 3);

        rectangles[0].sort(rectangles);

        System.out.println("Sorted Rectangles by Area:");
        for (Rectangle rectangle : rectangles) {
            System.out.println("Rectangle Area: " + rectangle.calculateArea());
        }
    }
}