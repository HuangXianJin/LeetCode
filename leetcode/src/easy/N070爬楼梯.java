package easy;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 *
 * @author huangxj
 * @version 1.0
 * @date 2021/4/12 17:09
 */
public class N070爬楼梯 {

    /**
     * 递归 超时
     *
     * @param n
     * @return
     */
    public static int climbing(int n) {
        if (n < 2) {
            return 1;
        }
        return climbing(n - 1) + climbing(n - 2);
    }


    /**
     * 递归 超时
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if (n < 2) {
            return 1;
        }
        int pre1 = 2, pre2 = 1;

        for (int i = 2; i < n; i++) {
            int cur = pre2 + pre1;
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

    public static void main(String[] args) {
        System.out.println(climbing(30));
        System.out.println(climbStairs(30));
    }

}
