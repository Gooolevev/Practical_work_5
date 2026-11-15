import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class test_task_2 {
    @Test
    void example1() {
        var input = new ByteArrayInputStream("5\n2 4 1 3 5".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("3", output.toString(StandardCharsets.UTF_8).trim());
    }

    @Test
    void example2() {
        var input = new ByteArrayInputStream("0".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("0", output.toString(StandardCharsets.UTF_8).trim());
    }

    @Test
    void example3() {
        var input = new ByteArrayInputStream("3\n2 2 2".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("0", output.toString(StandardCharsets.UTF_8).trim());
    }

    @Test
    void example4() {
        var input = new ByteArrayInputStream("4\n4 3 2 1".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("6", output.toString(StandardCharsets.UTF_8).trim());
    }

}
