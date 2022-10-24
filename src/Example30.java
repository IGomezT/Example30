import java.util.Scanner;

public class Example30 {
    public static void main(String argv[]) {
        Scanner inputValue;
        int n;

        inputValue = new Scanner(System.in);

        System.out.println("Write a number");
        n = inputValue.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println();

            for (int j = 1; j < i; ++j) {

                System.out.print(j);
            }

        }
    }
}