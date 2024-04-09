package Array;
//	现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的和并打印。
public class project3 {
    public static void main(String[] args) {
        int [] a={100,50,90,60,80,70};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("数组中的所有元素的和为："+sum);
    }
}
