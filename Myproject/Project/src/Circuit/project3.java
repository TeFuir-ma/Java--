package Circuit;
//需求:打印出1到100之间的既是3的倍数又是5倍数的数字以及这些数字的和
public class project3 {
    public static void main(String[] args) {
        // 初始化总和为0
        int totalSum = 0;
        // 遍历1到100的数字
        for (int num = 1; num <= 100; num++) {
            // 判断是否同时为3的倍数和5的倍数
            if (num % 3 == 0 && num % 5 == 0) {
                // 打印满足条件的数字
                System.out.println(num);
                // 将满足条件的数字加到总和中
                totalSum += num;
            }
        }
        // 打印满足条件的数字的总和
        System.out.println("这些数字的和为: " + totalSum);
    }
}
