import java.util.Scanner;

public class gcd_recursion {
    // by the Euclidean algorithm

    public static int calculate_GCD(int a,int b){
        if (b==0){
            return a;
        }
        if (a<0||b<0){
            return -1;
        }
        return calculate_GCD(a,a%b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println(calculate_GCD(a,b));
    }
}
