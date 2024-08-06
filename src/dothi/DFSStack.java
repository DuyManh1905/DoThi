package dothi;

import java.util.Scanner;

/**
 *
 * @author DuyManh
 */
public class DFSStack {

    static int n;
    static int a[][];
    static int visited[];

    public static void dfs(int u) {

        int stack[] = new int[1000];
        int top = 0;

        stack[top++] = u;
        visited[u] = 1;

        while (top != 0) {
            int x = stack[--top];
            System.out.print((x + 1) + "-");
            for (int i = n - 1; i >= 0; i--) {
                if (visited[i] == 0 && a[x][i] == 1) {
                    visited[i] = 1;
                    stack[top++] = i;
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
            dfs(i);
            System.out.println("");
        }
    }
}

//1-2-4-3-6-7-9-8-5-
//2-1-3-6-7-9-8-5-4-
//3-1-2-4-5-8-6-7-9-
//4-2-1-3-6-7-9-8-5-
//5-1-2-4-3-6-7-9-8-
//6-3-1-2-4-5-8-7-9-
//7-3-1-2-4-5-8-6-9-
//8-5-1-2-4-3-6-7-9-
//9-3-1-2-4-5-6-7-8-
//1-2-4-3-6-7-9-8-5-
//2-1-3-6-7-9-8-5-4-
//3-1-2-4-5-8-9-6-7-
//4-2-1-3-6-7-9-8-5-
//5-1-2-4-3-6-7-9-8-
//6-3-1-2-4-5-8-9-7-
//7-3-1-2-4-5-8-9-6-
//8-5-1-2-4-3-6-7-9-
//9-3-1-2-4-5-8-6-7-
