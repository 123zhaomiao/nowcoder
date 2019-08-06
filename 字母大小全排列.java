class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<String>();
        dg(S.toCharArray(),0,list);
        return list;
    }
    public void dg(char[] s,int i,List<String> list){
        if(i==s.length){
            list.add(String.valueOf(s));
            return;
        }
        dg(s,i+1,list);
        if((s[i]>='a'&& s[i]<='z')||
           (s[i]>='A'&& s[i]<='Z')){
            s[i]^=(1<<5);
            dg(s,i+1,list);
        }
        
    }
}
