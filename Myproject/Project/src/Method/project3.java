package Method;
//定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
public class project3 {
    public static void main(String[] args) {
        double min=Num(3.3,2.4);
        System.out.println(min);
    }
    public static double Num(double a,double b){
        if (a>b){
            return b;
        }
        else{
            return  a;
        }
    }
}
