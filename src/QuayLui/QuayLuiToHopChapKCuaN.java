/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuayLui;

/**
 *
 * @author DuyManh
 */
public class QuayLuiToHopChapKCuaN {

    static int n, k, x[], cnt = 0;

    public static void Try(int i) {
        cnt++;
        for (int j = x[i - 1] + 1; j <= n-k+i; j++) {
            x[i] = j;
            if (i == k) {
                for (int u = 1; u <= i; u++) {
                    System.out.print(x[u]);
                }
                System.out.println("");
            } else {
                Try(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        n = 10;
        k = 5;
        x = new int[k + 1];
        Try(1);
        System.out.println(cnt);
    }

}
