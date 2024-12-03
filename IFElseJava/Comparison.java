import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1; 
        int num2;
        System.out.println("Informe o primeiro número: ");
        num1 = input.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = input.nextInt();
        input.close();

        if (num1 == num2) {
            System.out.printf("%d == %d%n", num1, num2);
        } else if (num1 != num2) {
            System.out.printf("%d != %d%n", num1, num2);
        } else if (num1 >= num2) {
            System.out.printf("%d >= %d%n", num1, num2);
        } else if (num1 <= num2) {
            System.out.printf("%d <= %d%n", num1, num2);
        }
    }
}