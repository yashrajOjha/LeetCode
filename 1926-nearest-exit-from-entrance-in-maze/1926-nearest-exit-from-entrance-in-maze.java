class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length,cols = maze[0].length, queueSize;
        Queue<int[]> q = new LinkedList<>();
        //using bfs to find shortest path
        boolean [][] visited = new boolean[rows][cols];
        int []curr;
        int [][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
        int x,y,steps = 0;
        q.offer(entrance);
        //marking the place currently at as true
        visited[entrance[0]][entrance[1]] = true;
        while(!q.isEmpty()){
            queueSize = q.size();
            steps++; //number of pops decides steps required to exit the maze
            for(int i=0;i<queueSize;i++){
                curr = q.poll();
                for(int []dir:direction){
                    x=dir[0]+curr[0]; //moving down,left, up, right by adding directional values to the current values
                    y=dir[1]+curr[1];
                    if(x<0 || x>=rows || y<0 || y>=cols) continue; //crossed the boundaries
                    if(visited[x][y] || maze[x][y]=='+') continue; //theres a block then continue to next iteration
                    
                    if(x==0 || x==rows-1 || y==0 || y==cols-1) return steps;
                    //we are on boundary
                    q.offer(new int[]{x,y}); //adding new positions to queue
                    //marking the visited as true
                    visited[x][y] = true;
                    
                }
            }
        }
        return -1;
    }
}