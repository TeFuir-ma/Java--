package Circuit;
// 1.根据程序员的工龄(整数)给程序员涨工资(整数),程序员的工龄和基本工资通过键盘录入
//    2.涨工资的条件如下：
//        [10-15)     +20000
//        [5-10)      +10000
//        [3~5)       +5000
//        [1~3)       +3000
//     3.运行程序:
//         请输入作为程序员的你的工作的工龄:10
//        请输入作为程序员的你的基本工资为: 60000
//         程序运行后打印格式
//            "您目前工作了10年，基本工资为 60000元, 应涨工资 20000元,涨后工资 80000元"

import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" 请输入作为程序员的你的工作的工龄:");
        int a= input.nextInt();
        System.out.println("请输入作为程序员的你的基本工资为:");
        int b= input.nextInt();
        int sum=0;
        if(a>=10&&a<15){
            sum=b+20000;
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元, 应涨工资 20000元,涨后工资 "+sum+"元");
        }
        if(a>=5&&a<10){
            sum=b+10000;
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元, 应涨工资 10000元,涨后工资 "+sum+"元");
        }if(a>=3&&a<5){
            sum=b+5000;
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元, 应涨工资 5000元,涨后工资 "+sum+"元");
        }if(a>=1&&a<3){
            sum=b+3000;
            System.out.println("您目前工作了"+a+"年，基本工资为"+b+"元, 应涨工资 3000元,涨后工资 "+sum+"元");
        }else{
            System.out.println("输入的内容不符要求！！！");
        }

    }
}
