package Scanner;

import java.util.Scanner;

//需求:
//    定义一个int类型的变量,输入数值1234,求这个数的个位,十位,百位,千位分别是多少?
//
//运行效果:
//    1234的个位是4,十位是3,百位是2,千位是1
public class project2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入该数：");
        int num= sc.nextInt();
        int ge= num % 10;
        int bai= (num / 10) % 10;
        int shi= (num / 100) % 10;
        int qian= num / 1000;
        System.out.println(num + "的千位是" + qian + ",百位是" + bai + ",十位是" + shi + ",个位是" + ge);
    }
}
