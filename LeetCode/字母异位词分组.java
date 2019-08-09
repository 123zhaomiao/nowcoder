class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    List<List<String>> ans = new ArrayList<>();
    boolean[] used = new boolean[strs.length];
    for (int i = 0; i < strs.length; i++) {
        List<String> temp = null;
        if (!used[i]) {
            temp = new ArrayList<String>();
            temp.add(strs[i]);
            //两两比较判断字符串是否符合
            for (int j = i + 1; j < strs.length; j++) {
                if (equals(strs[i], strs[j])) {
                    used[j] = true;
                    temp.add(strs[j]);
                }
            }
        }
        if (temp != null) {
            ans.add(temp);
        }
    }
    return ans;
}
private boolean equals(String string1, String string2) {
    Map<Character, Integer> hash = new HashMap<>();
    //记录第一个字符串每个字符出现的次数，进行累加
    for (int i = 0; i < string1.length(); i++) {
        if (hash.containsKey(string1.charAt(i))) {
            hash.put(string1.charAt(i), hash.get(string1.charAt(i)) + 1);
        } else {
            hash.put(string1.charAt(i), 1);
        }
    }
     //记录第一个字符串每个字符出现的次数，将之前的每次减 1
    for (int i = 0; i < string2.length(); i++) {
        if (hash.containsKey(string2.charAt(i))) {
            hash.put(string2.charAt(i), hash.get(string2.charAt(i)) - 1);
        } else {
            return false;
        }
    }
    
    //判断每个字符的次数是不是 0 ，不是的话直接返回 false
    Set<Character> set = hash.keySet();
    for (char c : set) {
        if (hash.get(c) != 0) {
            return false;
        }
    }
    return true;
}
}
