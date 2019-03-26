
package prolab1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Prolab1 {
    
    public static int[][] matrix = new int[11][14];
    public static int [][]graph = new int[154][154];

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Prolab1 a = new Prolab1();
        mainpage deneme = new mainpage();
        deneme.setVisible(true);
        
        int i=0,j=0;
        
        Scanner reader = new Scanner(new File("harita.txt"));
            while (reader.hasNext()){
            matrix[i][j] = reader.nextInt();
                if(j==13 ){
                    j=-1;
                    i++;
                    
                }
            j++;       
            }
           
        
        int komsuindex,nowindex;

        for ( i = 1; i <10 ; i++) {
            for ( j = 1; j < 13 ; j++) {
                if (matrix[i][j]==1){
                    if (matrix[i-1][j]==1){
                        komsuindex=(i-1)*14+j;
                        nowindex=i*14+j;
                        graph[nowindex][komsuindex]=1;
                    }if(matrix[i+1][j]==1){
                        komsuindex=(i+1)*14+j;
                        nowindex=i*14+j;
                        graph[nowindex][komsuindex]=1;
                    }if(matrix[i][j-1]==1){
                        komsuindex=(i*14)+(j-1);
                        nowindex=i*14+j;
                        graph[nowindex][komsuindex]=1;
                    }if(matrix[i][j+1]==1){
                        komsuindex=(i*14)+j+1;
                        nowindex=i*14+j;
                        graph[nowindex][komsuindex]=1;
                    }
                }
            }
        }
        graph[4][18]=1;graph[18][4]=1;
        graph[12][26]=1;graph[26][12]=1;
        graph[70][0]=1;graph[0][70]=1;
        graph[83][82]=1;graph[82][83]=1;
        graph[144][130]=1;graph[130][140]=1;
        graph[139][138]=1;graph[138][139]=1;
        
    }
 
}
