import java.io.*;
import java.nio.charset.StandardCharsets;

public class test_task_1 {
    public static void main(String[] args) {
        var tests = new test_task_1();
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
        var input = new ByteArrayInputStream("6\n5 1 4 2 8 3".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_1.solve(input, output);
        assertEquals("1 2 3 4 5 8", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example2() {
        var input = new ByteArrayInputStream("0".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_1.solve(input, output);
        assertEquals("", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example3() {
        var input = new ByteArrayInputStream("4\n2 -1 2 0".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_1.solve(input, output);
        assertEquals("-1 0 2 2", output.toString(StandardCharsets.UTF_8).trim());
    }

}
