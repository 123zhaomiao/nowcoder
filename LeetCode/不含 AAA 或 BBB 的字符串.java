class Solution {
    public String strWithout3a3b(int A, int B) {
        
        StringBuffer str = new StringBuffer();
        
        while(A > 0 || B > 0){
            if(A > B){
                if(A > 1){
                    str.append("aa");
                    A-=2;
                }else{
                    str.append("a");
                    A-=1;
                }
                if(B > 0){
                    str.append("b");
                    B-=1;
                }
                
            }else if (A < B){
                if (B > 1) {
                    str.append("bb");
                    B -= 2;
                } else {
                    str.append("b"); 
                    B--;
                }
                if (A > 0) {
                    str.append("a"); 
                    A--;
                }
            }else{
                str.append("ab");
                A--;
                B--;
            } 
        }
        return str.toString();
    }
}
