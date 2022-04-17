public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length()<2) {
            return s;
        }
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i; j < s.length(); j++) {
                if (j-i < maxLen) {
                    continue;
                }
                if (isPalindrome(s,i,j)) {
                    if (maxLen < j-i+1) {
                        start = i;
                        maxLen = j-i+1;
                    }
                }

            }
        }
        return s.substring(start,start+maxLen);
    }
    private boolean isPalindrome(String s,int start,int end){
        while (start<end){
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
