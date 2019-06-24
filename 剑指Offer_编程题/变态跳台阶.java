public class Solution {
    public int JumpFloorII(int target) {
        if(target <= 0){return 0;}
        if(target == 1){return 1;}
        
        if(target == 2){return 2;}
        return 2*JumpFloorII(target-1);
    }
}
