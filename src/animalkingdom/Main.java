package animalkingdom;

import java.util.ArrayList;

public class Main {
    public static void filterAnimals(ArrayList<Animals> animals, Filter tester) {
        for (Animals a : animals) {
            if (tester.test(a)) {
                System.out.println(a.getName() + " " + a.getYear());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Animals> myList = new ArrayList<>();

        myList.add(new Mammals("Panda", 1869));
        myList.add(new Mammals("Zebra",1778));
        myList.add(new Mammals("Koala",1816));
        myList.add(new Mammals("Sloth",1804));
        myList.add(new Mammals("Armadillo",1758));
        myList.add(new Mammals("Raccoon",1758));
        myList.add(new Mammals("Bigfoot",2021));

        myList.add(new Birds("Pigeon",1837));
        myList.add(new Birds("Peacock",1821));
        myList.add(new Birds("Toucan",1758));
        myList.add(new Birds("Parrot",1824));
        myList.add(new Birds("Swan",1758));

        myList.add(new Fish("Salmon",1758));
        myList.add(new Fish("Catfish",1817));
        myList.add(new Fish("Perch",1758));

        System.out.println();
        System.out.println("\t\t --- The List ---");
        System.out.println(myList.toString());
        System.out.println();

        System.out.println("\t\t --- The List in decending order by year ---");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println();
        myList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println();

        System.out.println("\t\t --- The List sorted alphabetically ---");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println();
        myList.forEach((a) -> System.out.println(a.getName() + " " + a.getYear()));
        System.out.println();

        System.out.println("\t\t --- The List sorted by movement type ---");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        System.out.println();
        myList.forEach((a) -> System.out.println(a.getName() + " " + a.move()));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs---");
        System.out.println();
        filterAnimals(myList, a -> a.breathe().equalsIgnoreCase("lungs"));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs" +
                " and were named in 1758---");
        System.out.println();
        filterAnimals(myList, a -> ((a.breathe().equalsIgnoreCase("lungs"))
                && (a.getYear() == 1758)));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs " +
                "and who lay eggs---");
        System.out.println();
        filterAnimals(myList, a -> ((a.breathe().equalsIgnoreCase("lungs"))
                && (a.reproduce().equalsIgnoreCase("eggs"))));
        System.out.println();

        System.out.println("\t\t --- The List sorted by breathing type lungs " +
                "or who lay eggs---");
        System.out.println();
        filterAnimals(myList, a -> ((a.breathe().equalsIgnoreCase("lungs"))
                || (a.reproduce().equalsIgnoreCase("eggs"))));
        System.out.println();

        System.out.println("\t\t --- The List sorted alphabetically and by animals " +
                "which were named in 1758---");
        System.out.println();
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filterAnimals(myList, a -> (a.getYear() == 1758));
        System.out.println();
    }
}
