import java.io.*;
import java.nio.charset.StandardCharsets;

public class test_task_2 {
    public static void main(String[] args) {
        var tests = new test_task_2();
        tests.example1();
        tests.example2();
        tests.example3();
        tests.example4();
        System.out.println("Все 4 теста пройдены");
    }

    private static void assertEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Ожидалось: <" + expected + ">, получено: <" + actual + ">");
        }
    }

    void example1() {
        var input = new ByteArrayInputStream("5\n2 4 1 3 5".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("3", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example2() {
        var input = new ByteArrayInputStream("0".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("0", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example3() {
        var input = new ByteArrayInputStream("3\n2 2 2".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("0", output.toString(StandardCharsets.UTF_8).trim());
    }

    void example4() {
        var input = new ByteArrayInputStream("4\n4 3 2 1".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_2.solve(input, output);
        assertEquals("6", output.toString(StandardCharsets.UTF_8).trim());
    }

}
