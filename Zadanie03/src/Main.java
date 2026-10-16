// Zad 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i);

            if (i + 2 <= n) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}


// Zad 2