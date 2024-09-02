package kata_computers_shop;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @SuppressWarnings("unlikely-arg-type")
    @Test
    void testMain() {
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStreamCaptor));

        Main.main(new String[]{});

        System.setOut(originalOut);

        String actualOutput = outputStreamCaptor.toString();

        String expectedOutput = "Welcome to Tech Haven!\n" +
                                "Available computers:\n" +
                                "Brand: Dell, Memory: 16GB, Processor: Intel i7, OS: Windows 11, Price: $1200.00\n" +
                                "Brand: HP, Memory: 8GB, Processor: Intel i5, OS: Windows 10, Price: $800.00\n";

        equals(expectedOutput);
    }
}