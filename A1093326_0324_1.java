import java.util.*;

class Animal {
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
}

public class A1093326_0324_1 {
    public static void main(String[] args) {
        int x;
        double y;
        Animal[] animal = new Animal[4];
        animal[0] = new Animal("雪寶", 1.1, 52, 100);
        animal[1] = new Animal("驢子", 1.5, 99, 200);
        animal[2] = new Animal("安那", 1.7, 48, 120);
        animal[3] = new Animal("愛紗", 1.7, 50, 120);
        for (Animal animals : animal) {
            animals.show();
            System.out.println();
        }

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < animal.length; i++) {
            System.out.println("請輸入" + animal[i].name + "的時間跟加速度:");
            System.out.print("時間：");
            x = input.nextInt();
            System.out.print("加速度：");
            y = input.nextDouble();
            double distance;
            if (y != 0.0) {
                distance = animal[i].distance(x, y);
            } else {
                distance = animal[i].distance(x);
            }
            System.out.println(animal[i].name + "跑了 " + distance + "公尺");
            System.out.println();
        }
    }
}

