package Synthesis5;

public class StudentOperater {
    private Student student;
    public StudentOperater(Student student){
        this.student=student;
    }
    public void printPass(){
        if (student.getScore()>=60){
            System.out.println(student.getName()+"学生成绩及格");
        }
        else{
            System.out.println(student.getName()+"”学生成绩不合格");
        }
    }
}
