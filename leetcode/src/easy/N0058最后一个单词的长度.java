package easy;

//给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
//
// 如果不存在最后一个单词，请返回 0 。
//
// 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
//
// 示例:
//
// 输入: "Hello World"
//输出: 5
//
// Related Topics 字符串


public class N0058最后一个单词的长度 {

    public static int lengthOfLastWord(String s) {
        int i = 0;
        for (int j = s.length() - 1; j >= 0; j--) {
            if (s.charAt(j) != ' ') {
                i++;
                continue;
            }
            if (i > 0) return i;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }
}
