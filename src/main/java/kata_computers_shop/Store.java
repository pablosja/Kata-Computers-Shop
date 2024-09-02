package kata_computers_shop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Computer> computers;

    public Store(String name, String owner, String taxIdentifier) {

        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(String brand) {
        computers.removeIf(computer -> computer.getBrand().equalsIgnoreCase(brand));
    }

    public Computer findComputer(String brand) {
        for (Computer computer : computers) {
            if (computer.getBrand().equalsIgnoreCase(brand)) {
                return computer;
            }
        }
        return null;
    }

    public void listComputers() {
        if (computers.isEmpty()) {
            System.out.println("No computers in the store.");
            return;
        }
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
