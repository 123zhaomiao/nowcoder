public class Solution {
    public boolean Find(int target, int [][] array) {
        //方法1 暴力解决 时间复杂度为n*m
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j<array[0].length ; j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        
        return false;
        //方法2 因为每一行都是有序递增的数组，所以利用二分查找通过遍历每一行得到答案
        for(int i = 0; i<array.length;i++){
            int begin = 0;
            int end = array[i].length - 1;
            //二分查找
            while(begin <= end){
                int mid = (begin + end)/2;
                if(target > array[i][mid]){
                    begin = mid + 1;
                }else if(target < array[i][mid]){
                    end = mid - 1;
                }else{
                    return true;
                }
            }
        }
        return false;//方法3
        //利用二维数组由上到下递增、由左向右递增的规律 选取右上角元素与target进行对比
        //如果array[row][col] > target 那么target必定在元素array[row][col]的下边 row++
        //如果array[row][col] < target 那么target必定在元素array[row][col]的左边 col--
        int row = 0;
        int col = array[0].length - 1;
        while(row < array.length && col >= 0){
            if(target > array[row][col]){
                row++;
            }else if(target < array[row][col]){
                col--;
            }else{
                return true;
            }
        }
        return false;
    }
}
