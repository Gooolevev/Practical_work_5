package ru.algorithms.tasks;

import java.io.*;
import java.util.Scanner;

import java.util.Arrays;

public class task_3 {
    public static void solve(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = scanner.nextInt();
            ends[i] = scanner.nextInt();
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int i = 0, j = 0, current = 0, maximum = 0;
        while (i < n) {
            // При равенстве сначала учитываем окончание встречи.
            if (starts[i] < ends[j]) {
                current++;
                maximum = Math.max(maximum, current);
                i++;
            } else {
                current--;
                j++;
            }
        }
        PrintWriter writer = new PrintWriter(out);
        writer.println(maximum);
        writer.flush();
    }

    public static void main(String[] args) {
        solve(System.in, System.out);
    }
}
