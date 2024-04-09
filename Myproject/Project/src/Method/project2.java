package Method;

import java.util.Scanner;

//定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
public class project2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a= sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b= sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c= sc.nextInt();
        int max=MaxNum(a,b,c);
        System.out.println(max);
    }
    public static int MaxNum(int a,int b,int c ){
        int max=a;
        if (a>=b&&a>=c){
            return a;
        }
        else{
            if (b>c){
                return b;
            }
            else {
                return c;
            }
        }
    }
}
