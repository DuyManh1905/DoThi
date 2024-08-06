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
public class DemSoThanhPhanLienThong {

    static int n, cnt;
    static int a[][];
    static int visited[];

    public static void dfs(int u) {
        System.out.print((u ) + "-");
        visited[u] = 1;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0 && a[u][i] == 1) {
                dfs(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n][n];
        visited = new int[n];
        cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i=9;i>=0;i--){
            if(visited[i]==0){
                cnt++;
                dfs(i);
            }
        }
        
        
        System.out.println("cnt="+cnt);
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
