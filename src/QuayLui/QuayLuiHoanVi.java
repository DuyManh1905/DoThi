/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuayLui;

/**
 *
 * @author DuyManh
 */
public class QuayLuiHoanVi {
    static int n,x[],visit[];
    
    public static void Try(int i){
        for(int j=1;j<=n;j++){
            if(visit[j]==0){
                visit[j] = 1;
                x[i]=j;
                if(i==n){
                    for(int u=1;u<=i;u++){
                        System.out.print(x[u]);
                    }
                    System.out.println("");
                }
                else{
                    Try(i+1);
                }
                visit[j]=0;
            }
        }
    }
    
    public static void main(String[] args) {
        n = 4;
        x = new int[n+1];
        visit = new int[n+1];
        Try(1);
    }
    
}
