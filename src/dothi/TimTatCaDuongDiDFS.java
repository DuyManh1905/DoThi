package dothi;

import java.util.Scanner;

public class TimTatCaDuongDiDFS {

    static int n;
    static int[][] a;
    static boolean[] visited;
    static int[] path;
    static int pathIndex;

    public static void dfs(int u, int t) {
        visited[u] = true;
        path[pathIndex++] = u;

        if (u == t) {
            // In ra đường đi
            System.out.print("Path: ");
            for (int i = 0; i < pathIndex; i++) {
                System.out.print(path[i] + " ");
            }
            System.out.println();
        } else {
            for (int v = 0; v < n; v++) {
                if (a[u][v] == 1 && !visited[v]) {
                    dfs(v, t);
                }
            }
        }

        // Quay lại trạng thái ban đầu để tìm các đường đi khác
        visited[u] = false;
        pathIndex--;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        visited = new boolean[n];
        path = new int[n];
        pathIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int s = sc.nextInt(); // Đỉnh bắt đầu
        int t = sc.nextInt(); // Đỉnh kết thúc

        System.out.println("Tìm tất cả các đường đi từ " + s + " đến " + t + ":");
        dfs(s, t);
    }
}

//10 
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
//0 
//6