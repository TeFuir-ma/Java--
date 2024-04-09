package Example;

import java.util.Scanner;

//需求:在唱歌比赛中，可能有多名评委要给选手打分，分数是[0-100]之间的整数。选手最后得分为:去掉最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分。
public class project3 {
    public static void main(String[] args) {
        Scanner WS=new Scanner(System.in);
        System.out.println("请输入一共有几位评委：");
        int number= WS.nextInt();
        System.out.println("当前选手得分是："+getAverageScore(number));
    }
    public static double getAverageScore(int number){
        int [] scores =new int[number];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的分数：");
            int score=sc.nextInt();
            scores[i]=score;
        }
        int sum =0;
        int max=scores[0];
        int min=scores[0];
        for (int i = 0; i < scores.length; i++) {
            int score=scores[i];
            sum +=score;
            if (score>max){
                max=score;
            }
            if (score<min){
                min=score;
            }
        }
        return 1.0*(sum-max-min)/(number-2);
    }
}
