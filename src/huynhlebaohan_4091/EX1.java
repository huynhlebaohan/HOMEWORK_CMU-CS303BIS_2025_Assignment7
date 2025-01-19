package huynhlebaohan_4091;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number arrays: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
