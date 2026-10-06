// Zad 1


public class Main {
    public static void main(String[] args) {

        int[] pierwsza = {10, 20, 30, 40, 50, 60};
        String[] druga = {"Ala", "ma", "kota", "i", "psa"};

        System.out.println("Co drugi element pierwszej tablicy:");

        for (int i = 0; i < pierwsza.length; i += 2) {
            System.out.println(pierwsza[i]);
        }

        System.out.println("\nCo drugi element drugiej tablicy:");

        for (int i = 0; i < druga.length; i += 2) {
            System.out.println(druga[i]);
        }
    }
}



// Zad 2


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwsza liczbe: ");
        double a = scanner.nextDouble();

        System.out.print("Podaj druga liczbe: ");
        double b = scanner.nextDouble();

        System.out.print("Podaj trzecia liczbe: ");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Z podanych liczb mozna zbudowac trojkat.");
        } else {
            System.out.println("Z podanych liczb nie mozna zbudowac trojkata.");
        }

        scanner.close();
    }
}




// Zad 3


public class Main {
    public static void main(String[] args) {

        String[] tablica = {"kot", "pies", "samochód", "dom", "komputer"};

        for (String tekst : tablica) {
            System.out.println(tekst.toUpperCase());
        }
    }
}



// Zad 4


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] slowa = new String[5];

        // Wczytanie 5 słów
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj slowo " + (i + 1) + ": ");
            slowa[i] = scanner.nextLine();
        }

        // Wypisanie od ostatniego słowa do pierwszego
        for (int i = 4; i >= 0; i--) {
            String slowo = slowa[i];

            // Odwrócenie słowa
            for (int j = slowo.length() - 1; j >= 0; j--) {
                System.out.print(slowo.charAt(j));
            }

            System.out.println();
        }

        scanner.close();
    }
}



// Zad 5


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = new int[8];

        // Wczytanie 8 liczb
        for (int i = 0; i < 8; i++) {
            System.out.print("Podaj liczbe " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
        }

        // Sortowanie rosnące
        for (int i = 0; i < liczby.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < liczby.length; j++) {
                if (liczby[j] < liczby[minIndex]) {
                    minIndex = j;
                }
            }

            // Zamiana miejscami
            int temp = liczby[i];
            liczby[i] = liczby[minIndex];
            liczby[minIndex] = temp;
        }

        // Wypisanie posortowanej tablicy
        System.out.println("Posortowane liczby:");

        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }

        scanner.close();
    }
}



// Zad 6



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = new int[5];

        // Wczytanie 5 liczb
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj liczbe " + (i + 1) + ": ");
            liczby[i] = scanner.nextInt();
        }

        // Obliczanie silni każdej liczby
        for (int i = 0; i < 5; i++) {
            int silnia = 1;

            for (int j = 1; j <= liczby[i]; j++) {
                silnia = silnia * j;
            }

            System.out.println(liczby[i] + "! = " + silnia);
        }

        scanner.close();
    }
}




