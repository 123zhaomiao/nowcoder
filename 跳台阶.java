public class Solution {
    public int JumpFloor(int target) {
        //递归
        if( target == 0) {return 0;}
        if( target == 1 ){return 1;}
        if( target == 2 ){return 2;}
        return JumpFloor(target-1)+JumpFloor(target-2);
        //非递归
        //当前台阶的跳法总数 = 当前台阶后退一阶的台阶的跳法总数+当前台阶后退二阶的台阶的跳法总数
        //即相当于斐波那契数列
        if(target == 0){return 0;}
        if(target == 1){return 1;}
        if(target == 2){return 2;}
        int one = 1;
        //两个台阶的跳法
        //一个台阶的跳法
        int two =2;
        int result = 0;
        while(target > 2){
            result = one + two;
            one = two;
            two = result;
            target--;
        }
        return result;
    }
}
