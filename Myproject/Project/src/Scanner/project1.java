package Scanner;

import java.util.Scanner;

//**       需求:
//    身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//    儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//    女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
public class project1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入父亲的身高（厘米）：");
        double father=sc.nextDouble();
        System.out.println("请输入父亲的身高（厘米）：");
        double mother=sc.nextDouble();
       double son=(father+mother)*1.08/2;
        double daughter=(father*0.923+mother)/2;
        System.out.println("儿子的身高预测为："+son);
        System.out.println("女儿的身高预测为："+daughter);
    }
}
