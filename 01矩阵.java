// class Solution {
//     public int[][] updateMatrix(int[][] matrix) {
//         //第一次深度只和左边和上边比较、因为之前的元素已经比较过了比较有可比性
//         for(int i = 0 ; i < matrix.length;i++){
//             for(int j = 0;j < matrix[i].length;j++){
//                 if(matrix[i][j] == 1){
//                     dfsleft(matrix,matrix.length,matrix[i].length,i,j);

//                 }
//             }
//         }
//         //接着从后向前第二次遍历、这一次和右边和下边进行比较
//         for(int i = matrix.length-1; i >= 0;i--){
//             for(int j = matrix[i].length-1;j >= 0;j--){
//                 if(matrix[i][j] > 1){
//                     dfsright(matrix,matrix.length,matrix[i].length,i,j);
//                 }
//             }
//         }

//         return matrix;
//     }
//     private static void dfsleft(int[][] matrix,int row,int col,int x,int y){
//         //1.首先为了防止边界是1,没有谁与之比较所以将matrixp[x][y] 设置为row+col 而不是MAX_VALUE
//         int min  = row+col;
//         if(x-1 >= 0){
//             min = Math.min(matrix[x-1][y]+1,min);
//         }
//         if(y-1 >= 0){
//             min = Math.min(matrix[x][y-1]+1,min);
//         }
//         matrix[x][y] = min;
//     }
//     private static void dfsright(int[][] matrix,int row,int col,int x,int y){
//         int min = matrix[x][y];
//         if(x+1 < row){
//             min = Math.min(matrix[x+1][y]+1,min);
//         }
//         if(y+1 < col){
//             min = Math.min(matrix[x][y+1]+1,min);
//         }
//         matrix[x][y] = min;
//     }
// }

class Pos{
    public int x;
    public int y;
    public Pos(int x,int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    static int[][] b = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    public int[][] updateMatrix(int[][] matrix) {
       Queue<Pos> queue = new LinkedList<>();
       for(int i = 0 ; i < matrix.length;i++){
           for(int j = 0 ; j < matrix[i].length;j++){
               if(matrix[i][j] == 1){
                   matrix[i][j] = Integer.MAX_VALUE;
               }else{
                   queue.add(new Pos(i,j));
               }
           }
       }
       //此时初始化已经完成、将所有的1设置为待处理的MAX_VALUE,0入对列
       while(!queue.isEmpty()){
           //1.出队列
           Pos p = queue.poll();
           int x = p.x,oldx = p.x;
           int y = p.y,oldy = p.y;
           //2.设置其左右上下的值
           //设置的前提是p位置上的值+1 要比要设置的点小、否则无用
           
           for(int i = 0 ; i < 4;i++){
               x = oldx + b[i][0];
               y = oldy + b[i][1];
               if(x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length
                 && matrix[oldx][oldy] + 1 < matrix[x][y]){
                   matrix[x][y] = matrix[oldx][oldy] + 1;
                   queue.add(new Pos(x,y));
               }   
           }
//            if(x - 1 >= 0 && matrix[x][y] + 1 < matrix[x-1][y]){
//                matrix[x-1][y] = matrix[x][y]+1;
//                queue.add(new Pos(x-1,y));
//            }
           
//            if(x + 1 < matrix.length && matrix[x][y] + 1 < matrix[x+1][y]){
//                matrix[x+1][y] = matrix[x][y]+1;
//                queue.add(new Pos(x+1,y));
//            }
           
//            if(y - 1 >= 0 && matrix[x][y] + 1 < matrix[x][y-1]){
//                matrix[x][y-1] = matrix[x][y]+1;
//                queue.add(new Pos(x,y-1));
//            }
           
//            if(y + 1 < matrix[0].length && matrix[x][y] + 1 < matrix[x][y+1]){
//                matrix[x][y+1] = matrix[x][y]+1;
//                queue.add(new Pos(x,y+1));
//            }
       }
        return matrix;
    }
}
