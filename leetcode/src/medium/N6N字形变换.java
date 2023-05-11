package medium;

/**
 * @author huangxj
 * @date 2023/5/10 14:53
 */
public class N6N字形变换 {

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] res = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            res[i] = new StringBuilder();
        }
        int row = 0;
        boolean flag = true;

        for (int i = 0; i <s.length(); i++) {
            res[row].append(s.charAt(i));
            if (row == 0) {
                flag = true;
            }
            if (row == (numRows - 1)) {
                flag = false;
            }
            if (flag) {
                row++;
            } else {
                row--;
            }
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder b : res) {
            ret.append(b);
        }
        return ret.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
