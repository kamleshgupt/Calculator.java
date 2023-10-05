import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number");
        int n1 = in.nextInt();
        System.out.println("Enter the Second Number!");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println(sum);
    }
}
