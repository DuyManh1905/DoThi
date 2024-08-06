/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dothi;

import java.util.*;

public class Dijkstra {

    static int n; // Số lượng đỉnh
    static int[][] adjMatrix; // Ma trận kề
    static int[] dist; // Mảng khoảng cách
    static boolean[] visited; // Mảng đánh dấu đỉnh đã thăm

    // Hàm tìm đỉnh có khoảng cách nhỏ nhất chưa được thăm
    private static int getMinDistanceVertex() {
        int minDist = Integer.MAX_VALUE;
        int minVertex = -1;

        for (int i = 0; i < n; i++) {
            if (!visited[i] && dist[i] < minDist) {
                minDist = dist[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    // Hàm thực hiện thuật toán Dijkstra từ đỉnh nguồn
    public static void dijkstra(int source) {
        dist = new int[n];
        visited = new boolean[n];
        
        // Khởi tạo khoảng cách từ đỉnh nguồn đến tất cả các đỉnh khác
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        
        for (int i = 0; i < n - 1; i++) {
            // Lấy đỉnh có khoảng cách nhỏ nhất chưa được thăm
            int u = getMinDistanceVertex();
            visited[u] = true;

            // Cập nhật khoảng cách cho các đỉnh kề của đỉnh u
            for (int v = 0; v < n; v++) {
                if (!visited[v] && adjMatrix[u][v] != 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u] + adjMatrix[u][v] < dist[v]) {
                    dist[v] = dist[u] + adjMatrix[u][v];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // Số lượng đỉnh
        int m = sc.nextInt(); // Số lượng cạnh
        
        adjMatrix = new int[100][100];

        // Đọc đồ thị từ đầu vào
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            u--;
            v--;
            adjMatrix[u][v] = w;
            adjMatrix[v][u] = w; // Nếu đồ thị vô hướng, ngược lại bỏ dòng này
        }

        int source = sc.nextInt(); // Đỉnh nguồn

        // Thực hiện thuật toán Dijkstra từ đỉnh nguồn
        dijkstra(source);

        // In khoảng cách từ đỉnh nguồn đến các đỉnh khác
        System.out.println("Khoảng cách từ đỉnh " + 0 + " đến các đỉnh khác:");
        for (int i = 0; i < n; i++) {
            System.out.println("Đỉnh " + i + ": " + dist[i]);
        }
    }
}

//6
//8
//1 2 7
//1 3 12
//2 3 2
//2 4 9
//3 5 10
//4 6 1
//5 4 4
//5 6 5
//0