public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
       boolean visite[][] = new boolean[rows][cols];
       return count(threshold,rows,cols,0,0,visite);
    }
    private static int count(int threshold,int rows, int cols,int r,int c,boolean[][]visite){
        if(r >= rows || r < 0 || c < 0 || c >= cols || visite[r][c] || sum(r)+sum(c) > threshold){
            return 0;
        }
        visite[r][c] = true;
        return count(threshold,rows,cols,r - 1,c,visite)
                + count(threshold,rows,cols,r,c - 1,visite)
                + count(threshold,rows,cols,r + 1,c,visite)
                + count(threshold,rows,cols,r,c + 1,visite)
                + 1;
    }
    private static int sum(int c){
        int sum = 0;
        while(c !=0){
            sum += c%10;
            c = c/10;
        }
        return sum;
    }
}
