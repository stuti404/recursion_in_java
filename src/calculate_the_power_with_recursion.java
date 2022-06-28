import java.util.Scanner;

public class calculate_the_power_with_recursion {
    public static int calculate_power(int base,int power){
        if (power<0){
            return -1;
        }
        if (power==0){
            return 1;
        }
        return  base*calculate_power(base,power-1);
    }

    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int b = sc.nextInt();
        System.out.print("Enter the base power number: ");
        int p = sc.nextInt();
        System.out.println(calculate_power(b,p));
    }
}
