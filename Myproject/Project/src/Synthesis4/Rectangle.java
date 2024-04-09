package Synthesis4;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void area(){
        System.out.println("该矩形的面积:"+(length*width));
    }
    public void size(){
        System.out.println("该矩形的周长:"+(length+width)*2);
    }
}
