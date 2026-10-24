import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();

        int differ = diff21(n);

        System.out.println(differ);

    }

    public static int diff21(int n){
        int difference =Math.abs(21 -n) ;

        if (n > 21){
            difference = 2 * difference;
        }
        return difference;
    }
}