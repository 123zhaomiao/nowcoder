import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> list = new ArrayList<>();
       int left = 0;
       int right = matrix[0].length-1;
       int up = 0;
       int down = matrix.length-1;
       while(left < right && up < down){
           //1.首先打印最上面一行
           for(int i = left; i <= right ;i++){
               list.add(matrix[up][i]);
           }
           //2.其次打印最右边的竖行
           for(int i = left+1; i< down ;i++){
               list.add(matrix[i][right]);
           }
           //3.打印最下边一行
           for(int i = right ; i >= left ;i--){
               list.add(matrix[down][i]);
           }
           //4.打印最左边一行
           for(int i = down-1 ; i > up;i--){
               list.add(matrix[i][left]);
           }
           left++;
           right--;
           up++;
           down--;
       }
        if(left==right && up==down){
            list.add(matrix[left][up]);
        }else if(left==right){
            for(int i = up;i<=down;i++){
                list.add(matrix[i][left]);
            }
        }else if(up == down){
            for(int i = left; i<=right;i++){
                list.add(matrix[up][i]);
            }
        }
        return list;
    }
}
