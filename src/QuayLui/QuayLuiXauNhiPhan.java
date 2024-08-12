/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuayLui;

/**
 *
 * @author DuyManh
 */
public class QuayLuiXauNhiPhan {

    static int n, x[];

    public static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            x[i] = j;
            if (i == n) {
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
        n = 5;
        x = new int[n + 1];
        Try(1);
    }
}
