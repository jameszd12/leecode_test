/***
 * 151. 颠倒字符串中的单词
 */

public class reverseWords {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer sb = new StringBuffer();
        int len = strings.length;
        for (int i = len-1; i >= 0; i--) {
            if (!(strings[i].trim().length() == 0)) {
                if (sb.length() != 0) {
                    sb.append(" ");
                }
                sb.append(strings[i]);
            }
        }
        return sb.toString();
    }
}
