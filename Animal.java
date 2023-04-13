public class Animal {
    String name;
    double height;
    double weight;
    double speed;

    Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show() {
        System.out.println("姓名：" + this.name);
        System.out.println("身高：" + this.height + "公尺");
        System.out.println("體重：" + this.weight + "公斤");
        System.out.println("速度：" + this.speed + "公尺/分鐘");
    }

    double distance(double x) {
        return x * this.speed;
    }

    double distance(double x, double y) {
        return x * y * this.speed;
    }
    static void showinfo() {
        System.out.println("\n歡迎進入冰雪奇緣系統");
    }
}