//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Zad 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3.");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3.");
        }
    }
}



// Zad 2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszy bok: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugi bok: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzeci bok: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Można zbudować trójkąt.");
        } else {
            System.out.println("Nie można zbudować trójkąta.");
        }
    }
}



// Zad 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Największa liczba to: " + a);
        } else {
            System.out.println("Największa liczba to: " + b);
        }
    }
}


// Zad 4

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzecią liczbę: ");
        int c = scanner.nextInt();

        int najwieksza = a;

        if (b > najwieksza) {
            najwieksza = b;
        }

        if (c > najwieksza) {
            najwieksza = c;
        }

        System.out.println("Największa liczba to: " + najwieksza);
    }
}


// Zad 5




