package easy;

//报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
//
// 1.     1
//2.     11
//3.     21
//4.     1211
//5.     111221
//
//
// 1 被读作 "one 1" ("一个一") , 即 11。
//11 被读作 "two 1s" ("两个一"）, 即 21。
//21 被读作 "one 2", "one 1" （"一个二" , "一个一") , 即 1211。
//
// 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
//
// 注意：整数顺序将表示为一个字符串。
//
//
//
// 示例 1:
//
// 输入: 1
//输出: "1"
//
//
// 示例 2:
//
// 输入: 4
//输出: "1211"
//
// Related Topics 字符串


public class N0038报数 {

    public static String countAndSay(int n) {
        String s = "1";
        if (n == 1) {
            return "1";
        }
        return countAndSay("1", --n);
    }

    public static String countAndSay(String count, int n) {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < count.length(); i++) {
            int cnum = 1;
            char c = count.charAt(i);
            while ((cnum + i) != count.length()) {
                char temp = count.charAt(i + cnum);
                if (temp != c) {
                    break;
                }
                cnum++;
            }
            i = i+cnum-1;
            s.append(cnum);
            s.append(c);
        }
        if (n == 1) {
            return s.toString();
        } else {
            return countAndSay(s.toString(), --n);
        }
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(10));

    }
}
