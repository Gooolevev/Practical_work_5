import java.io.*;
import java.util.Scanner;

public class task_1 {
    // Сортируем диапазон [left, right) и считаем инверсии.
    private static long mergeSort(int[] a, int[] temp, int left, int right) {
        if (right - left < 2) return 0;
        int mid = (left + right) / 2;
        long count = mergeSort(a, temp, left, mid)
                + mergeSort(a, temp, mid, right);
        int i = left, j = mid, k = left;
        while (i < mid && j < right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
                count += mid - i;
            }
        }
        while (i < mid) temp[k++] = a[i++];
        while (j < right) temp[k++] = a[j++];
        for (k = left; k < right; k++) a[k] = temp[k];
        return count;
    }

    public static void solve(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        long count = mergeSort(a, new int[n], 0, n);
        PrintWriter writer = new PrintWriter(out);
        for (int i = 0; i < n; i++) {
            if (i > 0) writer.print(" ");
            writer.print(a[i]);
        }
        writer.println();
        writer.flush();
    }

    public static void main(String[] args) {
        solve(System.in, System.out);
    }
}
