/**
 *
 * @author Purvam Sheth
 */

import java.util.Scanner;
public class AdaKing_1 {
    
    static int ans =0;
    
    static void adaKing(int x, int y, char matr[][], int vis[][]){
        if(matr[x][y] == 'X'){
            vis[x][y] = 1;
          
            return;
        }
        else {
            
           
            ans++;
            vis[x][y]=1;
        }
        if(x!=0 && vis[x-1][y]==0) adaKing(x-1, y, matr,vis);
        if(x!=7 && vis[x+1][y]==0) adaKing(x+1,y,matr,vis);
        if(y!=0 && vis[x][y-1]==0) adaKing(x,y-1,matr,vis);
        if(y!=7 && vis[x][y+1]==0)adaKing(x,y+1,matr,vis);
    }
    public void plus(int ans){
        ans++;
    }
    public static void main(String[] args) {
        int vis[][] = new int [8][8];
        for(int i=0;i<8;i++){
            for(int j = 0;j<8;j++){
                vis[i][j] = 0;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int mat[][] = new int [8][8];
        char matr[][] = new char [8][8];
        int x=0,y=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                matr[i][j] = scanner.next().charAt(0);
                if(matr[i][j] == 'O'){
                    x = i;y = j;
                }
            }
        }
        adaKing(x,y,matr,vis);
        
        
        System.out.println(ans);
    }
}

