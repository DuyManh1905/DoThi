/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuayLui;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DayConCoTongBangK {

    static int n, a[], k, visit[], x[], solan;
    static boolean ok;

    public static void Try(int i, int sum, int bd) {
        solan++;
        for (int j = bd; j <= n; j++) {
            x[i] = a[j];
            if (sum + a[j] == k) {
                for (int u = 1; u <= i; u++) {
                    System.out.print(x[u] + " ");
                }
                System.out.println("");
            } else if (sum < k) {
                Try(i + 1, sum + a[j], j + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solan = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        visit = new int[n + 1];
        x = new int[n + 1];
        ok = false;
        Arrays.sort(a);

        System.out.println("");
        Try(1, 0, 1);
        System.out.println(solan);
    }
}

//10
//26
//12 11 9 10 6 8 14 7 5 13

//2011
