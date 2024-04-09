package Synthesis3;

import java.util.Scanner;

public class Movietest2 {
    public static void main(String[] args) {
        Movie[] movies=new Movie[4];
        Movie m1=new Movie(1 ,"水门桥" ,38.9 ,9.8, "徐克" ,"吴京" ,"12万人观看");
        Movie m2=new Movie(2 ,"西游记" ,66.9 ,9.9, "孙悟空" ,"唐三藏" ,"19万人观看");
        Movie m3=new Movie(3 ,"水浒传" ,32.9 ,8.8, "鲁智深" ,"林冲" ,"23万人观看");
        Movie m4=new Movie(4 ,"红楼梦" ,39.9 ,7.8, "刘姥姥" ,"林黛玉" ,"9万人观看");
        movies[0]=m1;
        movies[1]=m2;
        movies[2]=m3;
        movies[3]=m4;
        MovieOperater operater=new MovieOperater(movies);
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("电影信息系统==");
            System.out.println("1.查询全部电影信息");
            System.out.println("2.根据id查询某个电影全部信息展示：");
            System.out.println("请输入操作命令：");
            int command= sc.nextInt();
            switch (command){
                case 1:
                    operater.printAllMovies();
                    break;
                case 2:
                    System.out.println("请您输入查询的电影id：");
                    int id= sc.nextInt();
                    operater.searchMovieById(id);
                    break;
                default:
                    System.out.println("您的命令有问题--");
            }
        }
    }
}
