package medium;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
// 示例 1：
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
//
//
// 示例 2：
//
// 输入: "cbbd"
//输出: "bb"
//
// Related Topics 字符串 动态规划
//中心扩展

public class N0005最长回文子串 {

    public static String lengthOfLastWord(String s) {
        String ret = "";
        for (int i = 0; i < s.length(); i++) {
            String temp = isPalindrome(i, s);
            if (temp.length() > ret.length()) {
                ret = temp;
            }
        }
        return ret;
    }

    public static String isPalindrome(int i, String s) {

        int d = 0;
        for (d = 0; (i - d) >= 0 && (i + d) < s.length(); d++) {
            if (s.charAt(i - d) != s.charAt(i + d)) {
                break;
            }
        }
        String stra = s.substring(i - d+1, i + d);

        for (d = 0; i - d >= 0 && (i + d + 1) < s.length(); d++) {
            if (s.charAt(i - d) != s.charAt(i + d + 1)) {
                break;
            }
        }
        String strb = s.substring(i - d+1, i + d+1);
        if (stra.length() > strb.length()) {
            return stra;
        }
        return strb;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hollo"));
    }
}
