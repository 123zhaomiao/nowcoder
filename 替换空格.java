public class Solution {
    public String replaceSpace(StringBuffer str) {
        //方法1 避开String类的replaceall方法
        //1.首先计算空格数
        //2.根据空格数将字符串str扩大
        //3.从后向前挪动元素 这样的话只用挪动一次
        //计算空格数
        int num = 0;
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) == ' '){num++;}
        }
        //根据空格数将字符串str扩大 由于讲空格替换为20% 所以一个空格扩大两个字符
        int newLength = str.length() + num*2;
        //旧索引
        int oldindex = str.length() - 1;
        //新索引
        int newindex = newLength - 1;
        //设置字符串的长度
        str.setLength(newLength);
        for(;oldindex >= 0;oldindex--){
            if(str.charAt(oldindex)!=' '){
                str.setCharAt(newindex--,str.charAt(oldindex));
            }else{
                str.setCharAt(newindex--,'0');
                str.setCharAt(newindex--,'2');
                str.setCharAt(newindex--,'%');
            }
        }
        return str.toString();
    }
}
