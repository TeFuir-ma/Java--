package Circuit;

import java.util.Scanner;

//让用户依次录入三个整数，求出三个数中的最大值，并打印到控制台。【使用if】
public class project1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1= input.nextInt();
        System.out.println("请输入第二个数字：");
        int number2= input.nextInt();
        System.out.println("请输入第三个数字：");
        int number3= input.nextInt();
        int max=number1;
        if(max<number2){
            max=number2;
        }
        if(max<number3){
            max=number3;
        }
        System.out.println("三个数中的最大数为:"+max);
    }
}
