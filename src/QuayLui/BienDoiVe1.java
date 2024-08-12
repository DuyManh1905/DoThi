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
public class BienDoiVe1 {

    static int n, res;

    public static void Try(int n, int buoc) {
        if (n == 1) {
            res = Math.min(res, buoc);
            return;
        }
        if (n % 3 == 0) {
            Try(n / 3, buoc + 1);
        }
        if (n % 2 == 0) {
            Try(n / 2, buoc + 1);
        }

        Try(n - 1, buoc + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            res = Integer.MAX_VALUE;
            Try(n, 0);
            System.out.println(res);
        }
    }
}
