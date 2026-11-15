import java.io.*;
import java.nio.charset.StandardCharsets;

public class test_task_3 {
    public static void main(String[] args) {
        var tests = new test_task_3();
        tests.example1();
        tests.example2();
        tests.example3();
        System.out.println("Все 3 теста пройдены");
    }

    private static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Ожидалось: <" + expected + ">, получено: <" + actual + ">");
        }
    }

    void example1() {
        var input = new ByteArrayInputStream("4\n1 5\n3 7\n5 8\n2 4".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_3.solve(input, output);
        assertEquals("3", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example2() {
        var input = new ByteArrayInputStream("0".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_3.solve(input, output);
        assertEquals("0", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example3() {
        var input = new ByteArrayInputStream("2\n1 2\n2 3".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_3.solve(input, output);
        assertEquals("1", output.toString(StandardCharsets.UTF_8).trim());
    }

}
