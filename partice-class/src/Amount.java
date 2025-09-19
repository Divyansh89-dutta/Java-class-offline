import java.util.Scanner;

public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int dis;
        if (amount > 0 && amount <= 5000) dis = 0;
        else if (amount > 5000 && amount <= 7000) dis = 5;
        else if (amount > 7000 && amount <= 9000) dis = 10;
        else dis = 20;
        System.out.println(amount - (dis*amount)/100);
    }
}
