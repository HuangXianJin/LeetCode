package easy;

/**
 * //实现 strStr() 函数。
 * //
 * // 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回 -1。
 * //
 * // 示例 1:
 * //
 * // 输入: haystack = "hello", needle = "ll"
 * //输出: 2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: haystack = "aaaaa", needle = "bba"
 * //输出: -1
 * //
 * //
 * // 说明:
 * //
 * // 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * //
 * // 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 * // Related Topics 双指针 字符串
 */


public class N0028实现strStr {

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int M = needle.length();
        int N = haystack.length();
        for (int i = 0; i < (N-M+1); i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                if ((j+1) == M) return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));

    }
}
