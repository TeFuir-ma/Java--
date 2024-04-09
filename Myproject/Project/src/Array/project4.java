package Array;
//现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最大值并打印。
public class project4 {
    public static void main(String[] args) {
        int [] a={100,50,90,60,80,70};
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max)
                max = a[i];
        }
        System.out.println("数组中的所有元素的最大值为："+max);
    }
}
