package Circuit;
import java.util.Scanner;
//需求: 从键盘上录入一个大于100的三位数,打印出100到该数字之间满足如下要求的数字,数字的个数,以及数字的和:
//        1.数字的个位数不为7;
//        2.数字的十位数不为5;
//        3.数字的百位数不为3;
public class project4 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来接收用户输入
        Scanner scanner = new Scanner(System.in);
        // 提示用户输入一个大于100的三位数
        System.out.print("请输入一个大于100的三位数：");
        int number = scanner.nextInt();

        // 检查输入是否合法
        if (number <= 100 || number >= 1000) {
            System.out.println("输入的数字不是大于100的三位数。");
            return;
        }
        // 初始化计数器和总和
        int count = 0;
        int sum = 0;

        // 遍历100到输入的数字之间的所有数字
        for (int i = 100; i <= number; i++) {
            // 获取百位、十位和个位上的数字
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int units = i % 10;

            // 检查是否满足条件
            if (hundreds != 3 && tens != 5 && units != 7) {
                // 打印满足条件的数字
                System.out.println(i);
                // 更新计数器和总和
                count++;
                sum += i;
            }
        }
        // 打印满足条件的数字的个数和总和
        System.out.println("满足条件的数字个数为：" + count);
        System.out.println("这些数字的总和为：" + sum);
        // 关闭Scanner
        scanner.close();
    }
}
