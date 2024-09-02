package kata_computers_shop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    
    @Test
    void testGetBrand() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        assertEquals("Dell", computer.getBrand(), "The brand should be Dell");
    }

    @Test
    void testGetMemoryAmount() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        assertEquals(16, computer.getMemoryAmount(), "The memory amount should be 16GB");
    }

    @Test
    void testGetOperatingSystem() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        assertEquals("Windows 11", computer.getOperatingSystem(), "The operating system should be Windows 11");
    }

    @Test
    void testGetPrice() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        assertEquals(1200.00, computer.getPrice(), 0.01, "The price should be $1200.00");
    }

    @Test
    void testGetProcessorFeatures() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        assertEquals("Intel i7", computer.getProcessorFeatures(), "The processor features should be Intel i7");
    }

    @Test
    void testSetBrand() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        computer.setBrand("HP");
        assertEquals("HP", computer.getBrand(), "The brand should be updated to HP");
    }

    @Test
    void testSetMemoryAmount() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        computer.setMemoryAmount(32);
        assertEquals(32, computer.getMemoryAmount(), "The memory amount should be updated to 32GB");
    }

    @Test
    void testSetOperatingSystem() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        computer.setOperatingSystem("Windows 10");
        assertEquals("Windows 10", computer.getOperatingSystem(), "The operating system should be updated to Windows 10");
    }

    @Test
    void testSetPrice() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        computer.setPrice(1000.00);
        assertEquals(1000.00, computer.getPrice(), 0.01, "The price should be updated to $1000.00");
    }

    @Test
    void testSetProcessorFeatures() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        computer.setProcessorFeatures("Intel i9");
        assertEquals("Intel i9", computer.getProcessorFeatures(), "The processor features should be updated to Intel i9");
    }

    @Test
    void testToString() {
        Computer computer = new Computer("Dell", 16, "Intel i7", "Windows 11", 1200.00);
        String expectedString = "Brand: Dell, Memory: 16GB, Processor: Intel i7, OS: Windows 11, Price: $1200.00";
        assertEquals(expectedString, computer.toString(), "The toString method should return the expected string");
    }
}
