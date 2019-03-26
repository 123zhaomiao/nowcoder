import java.util.*;
 
public class Substr {
    public boolean cheaksubstr(String substr,String str){
        for(int i=0;i<str.length();i++){
            int sum=0;
            for(int j=0;j<substr.length();j++){
                if( i+j<str.length()&&
                   str.charAt(i+j)==substr.charAt(j))
                    sum++;
                else
                    break;
            }
            if(sum==substr.length())
                return true;
        }
        return false;
    }
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] sum=new boolean[n];
        for(int i=0;i<p.length;i++)
        {
            if(cheaksubstr(p[i],s))
                sum[i]=true;
            else
                sum[i]=false;
        }
        return sum;
    }
}
