package kata_computers_shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StoreTest {

    private Store store;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        store = new Store("Tech Haven", "Jane Doe", "987-654-321");
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testAddComputer() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        store.addComputer(computer);

        Computer found = store.findComputer("Dell");
        assertNotNull(found, "The computer should be added and found in the store");
        assertEquals("Dell", found.getBrand(), "The brand of the found computer should be Dell");
    }

    @Test
    void testFindComputer() {
        Computer computer = new Computer("HP", 8, "Intel i5", "Windows 10", 800.00);
        store.addComputer(computer);

        Computer found = store.findComputer("HP");
        assertNotNull(found, "The computer should be found in the store");
        assertEquals("HP", found.getBrand(), "The brand of the found computer should be HP");

        Computer notFound = store.findComputer("Lenovo");
        assertNull(notFound, "A non-existing computer should not be found in the store");
    }

    @Test
    void testListComputers() {
        store.addComputer(new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00));
        store.addComputer(new Computer("HP", 8, "Intel i5", "Windows 10", 800.00));

        store.listComputers();
        String expectedOutput = "Brand: Dell, Memory: 16GB, Processor: Intel i7, OS: Windows 11, Price: $1200.00\n" +
                                "Brand: HP, Memory: 8GB, Processor: Intel i5, OS: Windows 10, Price: $800.00\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString(), "The list of computers should match the expected output");
    }

    @Test
    void testRemoveComputer() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        store.addComputer(computer);
        store.removeComputer("Dell");

        Computer found = store.findComputer("Dell");
        assertNull(found, "The computer should be removed from the store and not be found");
    }
}
