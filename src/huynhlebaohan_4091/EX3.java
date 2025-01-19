package huynhlebaohan_4091;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number arrays: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element:");
            a[i] = scanner.nextInt();
        }
        int k = 0;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == a[a.length - 1 - i]) {
                k = 1;
            } else {
                k = 0;
            }
        }
        if (k == 1) {
            System.out.println("True");
        } else if (k == 0) {
            System.out.println("False");
        }
    }
}
