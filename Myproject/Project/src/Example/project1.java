package Example;

import java.util.Scanner;

//飞机票：需求
//用户购买机票时，机票原价会按照淡季、旺季，头等舱还是经济舱的情况进行相应的优惠，
// 优惠方案如下:5-10月为旺季，头等舱9折，经济舱8.5折:
// 11月到来年4月为淡季，头等舱7折，经济舱6.5折请开发程序计算出用户当前机票的优惠价。
public class project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double price1= sc.nextDouble();
        System.out.println("请输入月份:");
        int month1= sc.nextInt();
        System.out.println("请输入购买机票类型:");
        String type1 = sc.next();
        if(type1=="经济舱"||type1=="头等舱"){
            double price=calculate(price1,month1,type1);
            System.out.println("优惠价是："+price);
        }
        else{
            System.out.println("信息输入有误！！！");
        }

    }
    public static double calculate(double price,int month,String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    price = price * 0.9;
                    break;
                case "经济舱":
                    price = price * 0.85;
                    break;
            }
        } else {
            switch (type) {
                case "头等舱":
                    price = price * 0.7;
                    break;
                case "经济舱":
                    price = price * 0.65;
                    break;
            }
        }
        return price;
    }
}
