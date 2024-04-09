package Array;
//现有一个整数数组{100,50,90,60,80,70}。
//	请编写程序，计算去掉最大值和最小值后的平均值（不考虑小数部分）
public class project1 {
    public static void main(String[] args) {
        int[] num = {100, 50, 90, 60, 80};
        int max = num[0];
        int min = num[0];
        int sum = 0;
        int avge = 0;
        // Calculate sum and find max/min values
        for (int i = 0; i < num.length; i++) {
            sum += num[i]; // Accumulate sum
            if (num[i] > max) {
                max = num[i]; // Update max value
            }
            if (num[i] < min) {
                min = num[i]; // Update min value
            }
        }
        // Calculate average after removing max and min
        avge = (sum - max - min) / (num.length - 2); // Subtract max and min from sum
        System.out.println(avge);
    }
}