package Furniture;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;
    String location;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }
    public void high() {
        this.speed = HIGH;
        System.out.println(this.location + " 선풍기 속도가 " + this.speed + "로 설정되었습니다.");
    }
    public void medium() {
        this.speed = MEDIUM;
        System.out.println(this.location + " 선풍기 속도가 " + this.speed + "로 설정되었습니다.");
    }
    public void low() {
        this.speed = LOW;
        System.out.println(this.location + " 선풍기 속도가 " + this.speed + "로 설정되었습니다.");
    }
    public void on() { System.out.println(this.location + " 선풍기 속도가 " + this.speed + "로 설정되었습니다."); }
    public void off() {
        //this.speed = OFF;
        System.out.println(this.location + " 선풍기가 꺼졌습니다.");
    }

    public int getSpeed() { return this.speed; }
}
