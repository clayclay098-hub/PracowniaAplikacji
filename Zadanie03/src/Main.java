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


// Zad 4



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int liczba;
        int min = 0;
        int max = 0;
        boolean pierwsza = true;

        System.out.println("Podawaj liczby całkowite (0 kończy):");

        while (true) {
            liczba = scanner.nextInt();

            if (liczba == 0) {
                break;
            }

            if (pierwsza) {
                min = liczba;
                max = liczba;
                pierwsza = false;
            } else {
                if (liczba < min) {
                    min = liczba;
                }

                if (liczba > max) {
                    max = liczba;
                }
            }
        }

        if (pierwsza) {
            System.out.println("Nie podano żadnej liczby.");
        } else {
            int suma = min + max;
            double srednia = suma / 2.0;

            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Największa liczba: " + max);
            System.out.println("Suma: " + suma);
            System.out.println("Średnia arytmetyczna: " + srednia);
        }

        scanner.close();
    }
}



// Zad 5



import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int wylosowana = random.nextInt(100) + 1;
        int liczba;

        System.out.println("Gra: Za dużo, za mało!");
        System.out.println("Odgadnij liczbę od 1 do 100.");

        do {
            System.out.print("Podaj liczbę: ");
            liczba = scanner.nextInt();

            if (liczba > wylosowana) {
                System.out.println("Podałeś za dużą wartość");
            } else if (liczba < wylosowana) {
                System.out.println("Podałeś za małą wartość");
            } else {
                System.out.println("Gratulacje!");
            }

        } while (liczba != wylosowana);

        scanner.close();
    }
}


// Zad 6


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak wypełnienia: ");
        char zn = scanner.next().charAt(0);

        System.out.print("Podaj x: ");
        int x = scanner.nextInt();

        System.out.print("Podaj y: ");
        int y = scanner.nextInt();

        System.out.print("Podaj szerokość a: ");
        int a = scanner.nextInt();

        System.out.print("Podaj wysokość b: ");
        int b = scanner.nextInt();

        for (int i = 1; i < y; i++) {
            System.out.println();
        }

        for (int i = 1; i < x; i++) {
            System.out.print(" ");
        }

        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print(zn);
            }

            System.out.println();

            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}




// Zad 7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wysokość choinki: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}



// Zad 8



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int n = scanner.nextInt();

        long silnia = 1;

        for (int i = 1; i <= n; i++) {
            silnia = silnia * i;
        }

        System.out.println("Silnia liczby " + n + " wynosi: " + silnia);

        scanner.close();
    }
}


