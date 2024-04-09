package Synthesis1;

import java.util.Scanner;

//女朋友的属性包含：姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。另外定义一个用于展示三个属性值的show()方法。
//要求:
//	1.成员变量private修饰,提供get/set方法,空参满参构造
//	2.运行效果通过两种方式实现
//		(1)空参构造创建对象,set方法赋值
//		(2)满参构造直接创建对象
//请在测试类中创建对象并给成员变量赋值，然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
//我女朋友叫XXX,身高165.0厘米,体重130.0斤
//XXX帮我洗衣服
//XXX给我做饭
public class work3Girlfriend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入女朋友的姓名：");
        String name= sc.next();
        System.out.println("请输入女朋友的身高：");
        double high= sc.nextDouble();
        System.out.println("请输入女朋友的体重：");
        double weigh= sc.nextDouble();
        GirlFriend girlfriend= new GirlFriend();
        girlfriend.setName(name);
        girlfriend.setHigh(high);
        girlfriend.setWeight(weigh);
        girlfriend.informatoin();
        girlfriend.wish();
        girlfriend.cook();
    }
}
