package Scanner;

import java.util.Scanner;

//需求:
//    动物园里有两只老虎，请输入两只老虎的体重例如两只老虎体重分别为180kg、200kg，
//    请用程序实现判断两只老虎的体重是否相同。
public class project4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重:");
        int tiger1= sc.nextInt();
        System.out.println("请输入第二只老虎的体重:");
        int tiger2= sc.nextInt();
        if (tiger1==tiger2){
            System.out.println("两只老虎体重相同");
        }
        else{
            System.out.println("两只老虎体重不相同");
        }
    }
}
