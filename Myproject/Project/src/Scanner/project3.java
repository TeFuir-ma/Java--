package Scanner;

import java.util.Scanner;

//某外卖商家的菜品单价如下:
//    1.鱼香肉丝每份24元,油炸花生米每份8元,米饭每份3元。
//    2.优惠方式:
//        总金额大于100元,总金额打9折,其它无折扣
//    3.需求:
//        小明购买了3分鱼香肉丝,3份花生米,5份米饭,最终需要付多少钱?
public class project3 {
    public static void main(String[] args) {
        int a=24;
        int b=8;
        int c=3;
        double sum;
        Scanner input=new Scanner(System.in);
        System.out.println("鱼香肉丝的份数：");
        int x= input.nextInt();
        System.out.println("油炸花生米的份数：");
        int m= input.nextInt();
        System.out.println("米饭的份数：");
        int n= input.nextInt();
        sum=a*x+b*m+c*n;
        if (sum>100) {
            sum = sum * 0.9;
        }
        System.out.println("最终需要付"+sum);
    }
}
