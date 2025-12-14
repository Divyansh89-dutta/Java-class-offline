import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HappyNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(n != 1 && !list.contains(n)){
            list.add(n);
            int sum = 0;
            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        if (n == 1)
            System.out.println("Happy Number 😂");
         else
            System.out.println("Unhappy Number 😒");
    }
}
