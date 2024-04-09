package Synthesis1;

public class GirlFriend {
    private String name;
    private double high;
    private double weight;
    public GirlFriend() {
    }
    public GirlFriend(String name, double high, double weight) {
        this.name = name;
        this.high = high;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHigh() {
        return high;
    }
    public void setHigh(double high) {
        this.high = high;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void informatoin(){
        System.out.println("我女朋友叫"+name+",身高"+high+"厘米,体重"+weight+"斤");
    }
    public void wish(){
        System.out.println(name+"帮我洗衣服");
    }
    public void cook(){
        System.out.println(name+"给我做饭");
    }
}
