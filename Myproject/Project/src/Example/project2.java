package Example;

import java.util.Random;
import java.util.Scanner;

//需求：开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母
public class project2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入验证码的位数：");
        int n= sc.nextInt();
        System.out.println(createCode(n));
    }
    public static String createCode(int n){
        Random r=new Random();
        String code="";
        for (int i = 1; i <=n ; i++) {
            int type= r.nextInt(3);
            switch (type){
                case 0:
                    code += r.nextInt(10);
                    break;
                case 1:
                    char ch1=(char)(r.nextInt(26)+65);
                    code +=ch1;
                    break;
                case 2:
                    char ch2=(char)(r.nextInt(26)+97);
                    code +=ch2;
                    break;
            }

        }
        return code;
    }
}
