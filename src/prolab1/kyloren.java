
package prolab1;
import static prolab1.Prolab1.graph;

/**
 *
 * @author furkn
 */
public class kyloren extends karakter{
    
    public kyloren(String ad, int x, int y) {       
        super(ad, x, y);
        super.setTur("kotu");
        
    }
    
    static final int V = 154;  
    
    public int enkisayol(int a,int target){
        System.out.println("\n kyloren burada= " + (target/14) + "  " + (target%14));
         return dijkstra(graph, a,target);
    }
   
    int minDistance(int dist[], Boolean sptSet[])
    {

        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }
    
   
    
    int dijkstra(int graph[][], int src,int target)
    {
        int dist[] = new int[V];
        int pred[] = new int[V];

        Boolean sptSet[] = new Boolean[V];


        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            pred[i] = src ;
            sptSet[i] = false;
        }


        dist[src] = 0;


        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;


            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                {
                    dist[v] = dist[u] + graph[u][v];
                pred[v]= u ;
                }

             }
              
                int j=target;
                do
                {
                    j=pred[j];
                    System.out.println("<--- " + (j/14) + "  " + (j%14));
                }while(j!=src);
                j=pred[target];
                return pred[j];
    }
}
