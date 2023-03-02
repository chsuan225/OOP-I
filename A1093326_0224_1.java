import java.util.*;

public class A1093326_0224_1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("請輸入一個整數:");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("此數為偶數");
        }else{
            System.out.println("此數為奇數");
        }

    }
}