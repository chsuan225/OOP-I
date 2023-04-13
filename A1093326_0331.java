import java.util.*;

public class A1093326_0331 {
    public static void main(String[] args) {
        int x;
        double y;
        Animal[] animal = new Animal[2];
        Human[] human = new Human[3];
        Snow[] snow = new Snow[1];

        animal[0] = new Animal("雪寶", 1.1, 52, 100);
        animal[1] = new Animal("驢子", 1.5, 99, 200);
        human[0] = new Human("阿克", 1.9, 80, 150, "Male");
        human[1] = new Human("漢斯", 1.8, 78, 130, "Male");
        human[2] = new Human("安那", 1.7, 48, 120, "Female");
        snow[0] = new Snow("愛莎", 1.7, 50, 120, "Female", "Yes");
        for (Animal animals : animal) {
            animals.show();
            System.out.println();
        }
        for(Human humen : human){
            humen.show();
            System.out.println();
        }
        for(Snow snowy : snow){
            snowy.show();
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

        for (int i = 0; i < human.length; i++) {
            System.out.println("請輸入" + human[i].name + "的時間跟加速度:");
            System.out.print("時間：");
            x = input.nextInt();
            System.out.print("加速度：");
            y = input.nextDouble();
            double distance;
            if (y != 0.0) {
                distance = human[i].distance(x, y);
            } else {
                distance = human[i].distance(x);
            }
            System.out.println(human[i].name + "跑了 " + distance + "公尺");
            System.out.println();
        }

        for (int i = 0; i < snow.length; i++) {
            System.out.println("請輸入" + snow[i].name + "的時間跟加速度:");
            System.out.print("時間：");
            x = input.nextInt();
            System.out.print("加速度：");
            y = input.nextDouble();
            double distance;
            if (y != 0.0) {
                distance = snow[i].distance(x, y);
            } else {
                distance = snow[i].distance(x);
            }
            System.out.println(snow[i].name + "跑了 " + distance + "公尺");
            System.out.println();
        }
    }
}