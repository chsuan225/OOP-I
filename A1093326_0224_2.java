import java.util.*;

public class A1093326_0224_2 {
    public static void main(String args[]) {
        System.out.printf("請輸入攝氏溫度： ");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        System.out.println("換算為華氏溫度為：" + (temp * 9 / 5 + 32));
    }

}