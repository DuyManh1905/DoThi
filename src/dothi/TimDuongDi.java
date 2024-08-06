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
public class TimDuongDi {

    static int n, s, t;
    static int a[][];
    static int visited[];
    static int parent[];

    public static void dfs(int u) {
        visited[u] = 1;
        for (int i = 0; i < n; i++) {
            if (a[u][i] == 1 && visited[i] == 0) {
                parent[i] = u;
                dfs(i);
            }
        }
    }

    public static void bfs(int u) {
        int[] queue = new int[1000];
        int front = 0, rear = 0;

        queue[rear++] = u;
        visited[u] = 1;

        while (front < rear) {
            int x = queue[front++];
            for (int i = 0; i < n; i++) {
                if (a[x][i] == 1 && visited[i] == 0) {
                    parent[i] = x;
                    visited[i] = 1;
                    queue[rear++] = i;
                }
            }
        }

    }

    public static void Path(int s, int t) {
        
        int S=s,T=t;
        visited = new int[n];
        parent = new int[n];
        dfs(s);
        if (visited[t] == 0) {
            System.out.println("Khong co duong di");
        } else {
            //truy vet
            int path[] = new int[n];
            int cnt = 0;
            while (T != S) {
                path[cnt++] = T;
                T = parent[T];
            }
            path[cnt++] = s;
            System.out.println("Duong di dfs");
            for (int i = cnt - 1; i >= 0; i--) {
                System.out.print(path[i] + "-");
            }
        }

        System.out.println("");
        
        visited = new int[n];
        parent = new int[n];
        bfs(s);
        if (visited[t] == 0) {
            System.out.println("Khong co duong di");
        } else {
            //truy vet
            int path[] = new int[n];
            int cnt = 0;
            while (t != s) {
                path[cnt++] = t;
                t = parent[t];
            }
            path[cnt++] = s;
            System.out.println("Duong di bfs");
            for (int i = cnt - 1; i >= 0; i--) {
                System.out.print(path[i] + "-");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        t = sc.nextInt();
        a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        Path(s, t);
    }
}

//10 0 6
//0 1 0 0 0 0 0 0 0 0
//1 0 1 1 0 0 0 0 0 0
//0 1 0 0 0 1 1 0 0 0
//0 1 0 0 0 0 0 0 0 0
//0 0 0 0 0 0 0 1 0 0
//0 0 1 0 0 0 1 0 0 0
//0 0 1 0 0 1 0 0 0 0
//0 0 0 0 1 0 0 0 1 0
//0 0 0 0 0 0 0 1 0 0
//0 0 0 0 0 0 0 0 0 0
