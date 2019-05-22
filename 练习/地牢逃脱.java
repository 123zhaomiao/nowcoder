
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.输入地牢的长和宽
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        //2.定义地牢的地图
        char [][] map = new char[rows][cols];
        //3. 辅助地图---帮助查看如何离开地牢
        int [][] tar = new int[rows][cols];

        //4.输入地图
        for(int i = 0; i< rows ;i++){
            //输入一行字符串
            String str = scanner.next();
            map[i] = str.toCharArray();
        }

        //5.输入起点和终点
        int entryX= scanner.nextInt();
        int entryY= scanner.nextInt();

        //6.输入牛牛合法的步长数
        int k = scanner.nextInt();
        //7.输入每次可选择移动的行和列
        int[] elementX = new int[k];
        int[] elementY = new int[k];

        for(int i = 0; i<k ; i++){
            elementX[i] = scanner.nextInt();
            elementY[i] = scanner.nextInt();
        }

        //8.开始逃脱
        //8.1 设置队列记录牛牛下次到达的坐标
        Queue<Integer> queueX = new LinkedList<>();
        Queue<Integer> queueY = new LinkedList<>();
        //8.2 先将起点加入到队列中
        queueX.add(entryX);
        queueY.add(entryY);
        //8.3 如果遍历了，将tar数组设置为1，代表访问了
        tar[entryX][entryY] = 1;
        while(!queueX.isEmpty() && !queueY.isEmpty()){
            //8.4 已标记，队顶元素移出
            entryX = queueX.remove();
            entryY = queueY.remove();
           for(int  i = 0; i<k ; i++){
               //8.5 判断下一步是否越界
               if(entryX+elementX[i] >= 0 && entryX+elementX[i] <rows
                       &&entryY+elementY[i] >=0  && entryY+elementY[i] <cols){
                   //8.5.1 如果没有越界 判断是否能通过
                   if(map[entryX+elementX[i]][entryY+elementY[i]] == '.'){
                       //8.5.1.1 如果能通过,判断此处是否遍历过
                       if(tar[entryX+elementX[i]][entryY+elementY[i]] == 0){
                           //8.5.1.1.1 如果没有遍历，将此坐标入对列 ，并将此处标记
                           queueX.add(entryX+elementX[i]);
                           queueY.add(entryY+elementY[i]);
                           tar[entryX+elementX[i]][entryY+elementY[i]]=
                                   tar[entryX][entryY]+1;
                       }
                       //8.5.1.1.2 如果遍历过则不管
                   }else{
                       //8.5.2 如果不能通过 标记为-1
                       tar[entryX+elementX[i]][entryY+elementY[i]]=-1;
                   }
               }
           }
        }

        //9. tar数组已经遍历完
        //如果map数组中存在.但是却没有被遍历 则证明如果将此处定义为出口 是没有通路的返回-1
        //如果map数组中是.的地方均被遍历了 则记录离开出口的最大值
        int flag = 1;
        int max = 0;
        for(int i = 0;i < rows ;i++){
            for(int j = 0; j<cols ;j++){
                if(map[i][j]=='.' && tar[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max,tar[i][j]);
            }
        }
        System.out.println(max-1);
    }
}
