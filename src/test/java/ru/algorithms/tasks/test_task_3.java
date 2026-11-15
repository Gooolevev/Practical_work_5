package ru.algorithms.tasks;

import java.io.*;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class test_task_3 {
    @Test
    void example1() {
        var input = new ByteArrayInputStream("4\n1 5\n3 7\n5 8\n2 4".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_3.solve(input, output);
        assertEquals("3", output.toString(StandardCharsets.UTF_8).trim());
    }

    @Test
    void example2() {
        var input = new ByteArrayInputStream("0".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_3.solve(input, output);
        assertEquals("0", output.toString(StandardCharsets.UTF_8).trim());
    }

    @Test
    void example3() {
        var input = new ByteArrayInputStream("2\n1 2\n2 3".getBytes(StandardCharsets.UTF_8));
        var output = new ByteArrayOutputStream();
        task_3.solve(input, output);
        assertEquals("1", output.toString(StandardCharsets.UTF_8).trim());
    }

}
