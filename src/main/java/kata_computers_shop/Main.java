package kata_computers_shop;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Computers XYZ", "John Doe", "123-456-789");

        Computer comp1 = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        Computer comp2 = new Computer("HP", 8, "Intel i5", "Windows 10", 800.00);

        store.addComputer(comp1);
        store.addComputer(comp2);

        System.out.println("List of computers in the store:");
        store.listComputers();

        System.out.println("\nSearching for computer brand 'HP':");
        Computer found = store.findComputer("HP");
        if (found != null) {
            System.out.println(found);
        } else {
            System.out.println("Computer not found.");
        }

        store.removeComputer("Dell");

        System.out.println("\nList of computers after removal:");
        store.listComputers();
    }
}
