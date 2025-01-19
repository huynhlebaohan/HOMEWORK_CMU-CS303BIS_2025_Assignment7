package huynhlebaohan_4091;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number arrays: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element:");
            a[i] = scanner.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max: " + max);
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("min: " + min);
    }
}
