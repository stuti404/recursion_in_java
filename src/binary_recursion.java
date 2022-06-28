import java.util.Scanner;

public class binary_recursion {
    public static int calculate_Binary(int n){
        if (n==0){
            return 0;
        }
        if (n<0){
            return -1;
        }
        return n%2 +10 *
                calculate_Binary(n/2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println(calculate_Binary(a ));
    }
}
