class Solution {
    public static int sum = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0; j < grid[i].length;j++){
                if(grid[i][j] == 1){
                     sum = 0;
                     dfs(grid,grid.length,grid[i].length,i,j);
                     max = max > sum ? max:sum;
                }
            }
        }
       return max > 0 ? max:0;
    }
    private static void dfs(int[][] grid,int row,int col,int x,int y){
        grid[x][y] = 2;
        sum++;
        if(x - 1 >= 0 && grid[x-1][y] == 1)
            dfs(grid,row,col,x-1,y);
        if(x + 1 < row && grid[x+1][y] == 1)
            dfs(grid,row,col,x+1,y);
        if(y + 1 < col && grid[x][y+1] == 1)
            dfs(grid,row,col,x,y+1);
        if(y - 1 >= 0 && grid[x][y-1] == 1)
            dfs(grid,row,col,x,y-1);
    }
}
