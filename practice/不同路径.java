class Solution {
    public int uniquePaths(int m, int n) {
        int[][] path = new int[m][n];
        //初始化
        for(int i = 0 ; i < m;i++){
            path[i][0] = 1;
        }
        for(int i = 1 ; i < n;i++){
            path[0][i] = 1;
        }
        //状态转移
        for(int i = 1; i < m;i++){
            for(int j = 1;j < n;j++){
                path[i][j] = path[i][j-1]+path[i-1][j];
            }
        }
        return path[m-1][n-1];
    }
}
