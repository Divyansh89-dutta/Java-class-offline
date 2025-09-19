import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender M/F : ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter year of Service : ");
        int yos = sc.nextInt();
        System.out.println("Enter qualification P/G : ");
        char qualification = sc.next().charAt(0);
        int salary = 0;
        if (gender == 'M' || gender == 'm') {
            if (yos >= 10) {
                if (qualification == 'P')
                    salary = 15000;
                else
                    salary = 10000;
            } else {
                if (qualification == 'P')
                    salary = 10000;
                else
                    salary = 7000;
            }
        }else{
            if (yos >= 10) {
                if (qualification == 'P')
                    salary = 12000;
                else
                    salary = 9000;
            } else {
                if (qualification == 'P')
                    salary = 10000;
                else
                    salary = 6000;
            }
        }

        System.out.println(salary);
    }
}
