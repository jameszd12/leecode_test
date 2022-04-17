public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 ||strs ==null) {
            return "";
        }
        String prefix=strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = calPrefix(strs[0], strs[i]);
            if (prefix.length() == 0) {
                return prefix;
            }
        }
        return prefix;
    }
    public String calPrefix(String str1, String str2){
        int length = Math.min(str1.length(),str2.length());
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                break;
            }
            index ++;
        }
        return str1.substring(0,index);







    }



}
