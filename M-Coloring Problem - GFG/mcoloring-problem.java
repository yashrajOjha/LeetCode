// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}
// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean isValid(boolean graph[][],int node, int color, int col[]){
        int n=graph.length;
        for(int i=0;i<n;i++){
            if(!graph[node][i]){
                continue;
            }
            if(color==col[i]) return false;
        }
        return true;
    }
    public boolean solve(boolean graph[][],int node,int m, int n, int col[]){
        if(node == n){
            return true; //base case
        }
        for(int i=1;i<=m;i++){
            if(isValid(graph,node,i,col)){
                col[node]=i;
                if(solve(graph,node+1,m,n,col)) return true;
                col[node]=-1;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int col[] = new int[n];
        Arrays.fill(col,-1);
        return solve(graph,0,m, n, col);
    }
}