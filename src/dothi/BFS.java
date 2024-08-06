/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dothi;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class BFS {

    static int n;
    static int a[][];
    static int visited[];

    public static void bfs(int u) {
        int queue[] = new int[1000];
        int front = 0, rear = 0;

        //push
        queue[rear++] = u;
        visited[u] = 1;

        while (front < rear) {
            int x = queue[front++];
            System.out.print((x + 1) + "-");

            for (int i = 0; i < n; i++) {
                if (visited[i] == 0 && a[x][i] == 1) {
                    visited[i] = 1;
                    queue[rear++] = i;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            visited = new int[n];
            bfs(i);
            System.out.println("");
        }
    }
}
