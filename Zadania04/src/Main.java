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






