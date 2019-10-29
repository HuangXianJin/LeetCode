/**
 * @ClassName SleepSort
 * @Description TODO
 * @Author: huangxj
 * @Create: 2019-10-24 16:16
 * @Version V1.0
 **/
public class SleepSort extends Thread {

    int ms;

    public SleepSort(int ms) {
        this.ms = ms;
    }

    @Override
    public void run() {
        try {
            sleep(ms * 10 + 10);
            System.out.println(ms);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 7, 3, 8, 9, 2, 6, 5};
        for (int item : array) {
            new SleepSort(item).start();
        }
    }
}
