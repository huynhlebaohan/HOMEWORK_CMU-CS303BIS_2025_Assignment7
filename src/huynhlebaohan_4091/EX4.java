
package huynhlebaohan_4091;

import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number arrays: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element:");
            a[i] = scanner.nextInt();
        }
    for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a[j] = a[j + 1];
                }
                n--;
            }
        }
    for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
}
}
