import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        int flag = 0;
        if (n <= 1) {
            System.out.println("Not prime\n");
        } else {
            for (int i = 2; i < n/2 ; i++) {
                if (n % i == 0) {
                    flag = 1;

                }

            }

            if (flag == 1) {
                System.out.println("Not prime\n");
            } else {
                System.out.println(" prime\n");
            }
        }
        s.close();
    }
}
