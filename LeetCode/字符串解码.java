class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> numstack = new Stack<>();
        
        String res = "";
        int curNum = 0;
        for(int i = 0 ; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            //数字
            if(Character.isDigit(c)){

                 while(Character.isDigit(s.charAt(i))){
                     curNum = 10*curNum + (s.charAt(i++)-'0'); 
                 }      
                i--;
                numstack.push(curNum);
                //数字复位
                curNum = 0;
            }else if(c == '['){
                 
                stack.push(res);
                res = "";
                
            }else if(c == ']'){
                //计算
                StringBuilder str = new StringBuilder(stack.pop());
                
                int count = numstack.pop();
                
                while(count != 0){
                    str.append(res);
                    count--;
                }
                
                res = str.toString();
               
            }else{
                res += c;
            }
        }
        return res;
    }
}
