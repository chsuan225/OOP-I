public class Snow extends Human{
    String iceSkill;
    Snow(String name, double height, double weight, double speed, String gender, String iceskill) {
        super(name, height, weight, speed, gender);
        this.iceSkill=iceskill;
    }

    @Override
    void show() {
        super.show();
        System.out.println("技能：" + this.iceSkill);
    }

    @Override
    double distance(double x) {
        return x * this.speed*2;
    }
    double distance(double x, double y) {
        return x * y * this.speed*2;
    }
}