package Array;
//现有一个整数数组{100,50,90,60,80,70}。请编写代码，计算数组中的所有元素的最小值并打印
public class project2 {
    public static void main(String[] args) {
        int [] a={100,50,90,60,80,70};
        int min=a[0];
        for (int i=1;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println("所有元素中的最小值为："+min);
    }
}
