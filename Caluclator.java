import java.util.Scanner;
public class Caluclator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        while (true) {
            System.out.print("Enter first number or type 'stop': ");
            if (sc.hasNext("stop")) break;
            System.out.println("Enter first number");
            int n1 = sc.nextInt();
            System.out.println("Enter operation");
            char op = sc.next().charAt(0);
            System.out.println("Enter second number");
            int n2 = sc.nextInt();
            int  result;
            switch (op) {
                case '+':
                    result = n1 + n2;
                    System.out.println(result);
                    break;
                case '-':
                    result = n1 - n2;
                    System.out.println(result);
                    break;
                case '*':
                    result = n1 * n2;
                    System.out.println(result);
                    break;
                case '/':
                    if (n2 != 0) {
                        result = n1 / n2;
                        System.out.println(result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operation");

            }

        }

    }
}
