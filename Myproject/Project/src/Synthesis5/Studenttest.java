package Synthesis5;

public class Studenttest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("波妞");
        s1.setScore(99);
        System.out.println(s1.getName());
        System.out.println(s1.getScore());
        StudentOperater operater=new StudentOperater(s1);
        operater.printPass();
    }
}

