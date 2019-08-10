class Solution {
    public int numIslands(char[][] grid) {
        int num = 0;
        if(grid == null){
            return 0;
        }
        
        for(int i = 0 ; i < grid.length;i++){
            for(int j = 0 ; j < grid[i].length;j++){
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    
    private static void dfs(char[][] grid,int x,int y){
        int row = grid.length;
        int col = grid[0].length;
        grid[x][y] = '2';
        if(x+1 < row && grid[x+1][y] =='1'){
           dfs(grid,x+1,y);
        }
        if(x-1 >= 0 && grid[x-1][y] =='1'){
           dfs(grid,x-1,y);
        }
        if(y-1 >= 0&& grid[x][y-1] =='1'){
           dfs(grid,x,y-1);
        }
        if(y+1 < col&& grid[x][y+1] =='1'){
           dfs(grid,x,y+1);
        }
    }
    
}
