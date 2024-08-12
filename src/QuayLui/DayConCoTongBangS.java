/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuayLui;

/**
 *
 * @author DuyManh
 */
public class DayConCoTongBangS {

    static int n, k, s, cnt, x[], visit[], soLan;

    public static void Try(int i, int sum) {
        soLan++;
        for (int j = x[i - 1] + 1; j <= n; j++) {
            x[i] = j;
            if (i == k) {
                if (sum + j == s) {
                    cnt++;
                }
            } else {
                Try(i + 1, sum + j);
            }

        }
    }

    public static void main(String[] args) {
        n = 16;
        k = 8;
        s = 91;
        cnt = 0;
        soLan = 0;
        x = new int[k + 1];
        visit = new int[n + 1];
        Try(1, 0);
        System.out.println(cnt);
        System.out.println(soLan);
    }
}
