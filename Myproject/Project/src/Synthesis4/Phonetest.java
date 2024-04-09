package Synthesis4;

import java.util.Scanner;

// 定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
//请定义出手机类，类中要有空参、有参构造方法，set/get方法。
//定义测试类，在主方法中使用空参构造创建对象，使用set方法赋值。
//调用对象的两个功能，打印效果如下：
//正在使用价格为3998元黑色的小米手机打电话....
//正在使用价格为3998元黑色的小米手机发短信....
public class Phonetest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Phone p1=new Phone();
        System.out.println("请输入第一部手机的品牌：");
        p1.setBrand(sc.next());
        System.out.println("请输入第一部手机的价格：");
        p1.setPrice(sc.nextDouble());
        System.out.println("请输入第一部手机的颜色：");
        p1.setColor(sc.next());
        Phone p2=new Phone();
        System.out.println("请输入第二部手机的品牌：");
        p2.setBrand(sc.next());
        System.out.println("请输入第二部手机的价格：");
        p2.setPrice(sc.nextDouble());
        System.out.println("请输入第二部手机的颜色：");
        p2.setColor(sc.next());
        p2.call();
        p1.sendMessage();
        p1.call();
        p2.sendMessage();
    }
}
