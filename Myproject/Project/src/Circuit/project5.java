package Circuit;
//需求:1.打印所有四位数中 个位 + 千位 == 百位 + 十位 的数字
//    2.最后要打印符合条件的数字的总数量
//    3.打印格式如下:
//        1010
//        1021
//        1032
//        1043
//        ....
//        以上满足条件的四位数总共有 615 个
public class project5 {
    public static void main(String[] args) {
        int count=0;
        for (int num=1000;num<=9999;num++){
            int  g =num%10;
            int  s =(num/10)%10;
            int  b =(num/100)%10;
            int  q =num/1000;
            if (g+q==s+b){
                count=count+1;
                System.out.println(num);
            }
        }
        System.out.println("以上满足条件的四位数总共有"+count+ "个");
    }
}
