package Scanner;

import java.util.Scanner;

//一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm，
//    请开发程序，可以通过键盘输入这三个和尚的身高，并计算出出这三个和尚的最高身高。
public class project5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高（单位：cm）：");
        int P1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高（单位：cm）：");
        int P2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高（单位：cm）：");
        int P3 = sc.nextInt();
        int tallestHeight = P1;
        if (P2 > tallestHeight){
            tallestHeight = P2;
        }
        if (P3 > tallestHeight){
            tallestHeight = P3 ;
        }
        System.out.println("三个和尚中最高的身高是：" + tallestHeight + "cm");
    }
}
