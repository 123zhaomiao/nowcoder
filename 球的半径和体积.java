import java.util.Scanner;
import java.text.DecimalFormat;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();
            int z0 = scanner.nextInt();
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int z1 = scanner.nextInt();
            double r = radius(x0,y0,z0,x1,y1,z1);
            double v = tiji(r);
            DecimalFormat df = new DecimalFormat("#.000");
            System.out.println(df.format(r)+" "+df.format(v));
        }
    }
    private static  double radius(int x0,int y0,int z0,int x1,int y1,int z1){
        double R = Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2) + Math.pow(z0 - z1, 2));
        return R;
    }
    private static  double tiji(double r){
       return 4.0/3*Math.pow(r, 3)*Math.acos(-1);
    }
}
