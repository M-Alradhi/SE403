package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.*;

class LibraryAppTest {

    ByteArrayOutputStream output;

    @BeforeEach
    void setup() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void testExitCommand() {
        String input = "exit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LibraryApp.main(new String[]{});
        String result = output.toString();
        assertTrue(result.contains("Goodbye!"));
    }

    @Test
    void testSearchJavaBook() {
        String input = "Java\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        LibraryApp.main(new String[]{});
        String result = output.toString();
        assertTrue(result.contains("Java Programming"));
    }
}
