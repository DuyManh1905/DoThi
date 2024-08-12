/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuayLui;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class TuDien {

    static int n, a[], x[];

    public static void Try(int i, int bd) {
        for (int j = bd; j <= n; j++) {
            if (a[j] > x[i-1]) {
                x[i] = a[j];
                if (i >= 2) {
                    for (int u = 1; u <= i; u++) {
                        System.out.print(x[u] + " ");
                    }
                    System.out.println("");
                }
                Try(i + 1, j + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = new int[n + 1];
        x = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        x[0] = Integer.MIN_VALUE;
        Try(1, 1);
    }

}
