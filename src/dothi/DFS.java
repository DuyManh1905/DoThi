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
public class DFS {
    
    static int n;
    static int a[][];
    static int visited[];
    
    public static void dfs(int u){
        System.out.print((u+1)+"-");
        visited[u]=1;
        for(int i=0;i<n;i++){
            if(visited[i]==0 && a[u][i]==1){
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        a = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int  j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            visited = new int[n];
            dfs(i);
            System.out.println("");
        }
    }
}

//9
//0 1 1 0 1 0 0 0 0
//1 0 0 1 0 0 0 0 0
//1 0 0 0 0 1 1 0 1
//0 1 0 0 0 0 0 0 0
//1 0 0 0 0 0 0 1 0
//0 0 1 0 0 0 0 0 0
//0 0 1 0 0 0 0 0 0
//0 0 0 0 1 0 0 0 1
//0 0 1 0 0 0 0 1 0