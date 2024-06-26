package Synthesis3;

public class MovieOperater {
    private Movie[] movies;
    public MovieOperater(Movie[]movies){
        this.movies=movies;
    }
    public void printAllMovies(){
        System.out.println("-----系统全部电影信息如下：-----");
        for (int i = 0; i < movies.length; i++) {
           Movie  m = movies[i];
            System.out.println("编号:"+m.getId());
            System.out.println("名称:"+m.getName());
            System.out.println("价格:"+m.getPrice());
            System.out.println("评分:"+m.getScore());
            System.out.println("导演:"+m.getDirector());
            System.out.println("演员:"+m.getActor());
            System.out.println("------------------------------");
        }
    }
    public void searchMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m=movies[i];
            if(m.getId()==id){
                System.out.println("该电影详情如下：");
                System.out.println("编号:"+m.getId());
                System.out.println("名称:"+m.getName());
                System.out.println("价格:"+m.getPrice());
                System.out.println("评分:"+m.getScore());
                System.out.println("导演:"+m.getDirector());
                System.out.println("演员:"+m.getActor());
                System.out.println("其他信息:"+m.getInfo());
                return;
            }
        }
        System.out.println("没有该电影信息");
    }
}
