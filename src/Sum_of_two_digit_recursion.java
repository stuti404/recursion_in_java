import java.util.Scanner;

public class Sum_of_two_digit_recursion {
        public static int digitSum(int n) {
                if (n == 0||n< 0) {
                        return 0;
                }

                return n % 10 + digitSum(n / 10);
        }

        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int a = sc.nextInt();
                System.out.println(digitSum(a));
        }
}
