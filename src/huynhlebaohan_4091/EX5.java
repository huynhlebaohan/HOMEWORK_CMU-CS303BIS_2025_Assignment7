package huynhlebaohan_4091;

import java.util.Scanner;

public class EX5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number arrays: ");
        int n = scanner.nextInt(); 
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("element: ");
            a[i] = scanner.nextInt();
        }
        londenbe(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void londenbe(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
    }
}
