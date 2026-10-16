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




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dodatnią liczbę całkowitą: ");
        int n = scanner.nextInt();

        int potega = 1;

        while (potega <= n) {
            System.out.println(potega);
            potega *= 2;
        }

        scanner.close();
    }
}




// Zad 3




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba;
        int suma = 0;

        System.out.println("Podawaj liczby (0 kończy wczytywanie):");

        do {
            liczba = scanner.nextInt();

            if (liczba != 0) {
                suma += liczba;
            }

        } while (liczba != 0);

        System.out.println("Suma podanych liczb: " + suma);

        scanner.close();
    }
}



