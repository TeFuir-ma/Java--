package Method;

import java.util.Scanner;

//数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试
//
//比如:
//
//小数数字 -6.6 的绝对值是 6.6
//
//小数数字 6.6 的绝对值是 6.6
public class project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入该小数：");
        double x= sc.nextDouble();
        double y=Num(x);
        System.out.println("小数数字"+x+ "的绝对值是" +y);

    }
    public static double Num(double x){
        if (x>=0){
            return x;
        }
        else{
            return 0-x;
        }

    }
}
