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

import java.util.Scanner;

public class NazwaMiesiaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer miesiąca (1-12): ");
        int numer = scanner.nextInt();

        switch (numer) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Nieprawidlowy numer miesiaca");
                break;
        }

        scanner.close();
    }
}

// Zad 6


twoje_imie = "AI"

imie_uzytkownika = input("Podaj swoje imię (bez polskich znaków): ")


if imie_uzytkownika.strip().upper() == twoje_imie.upper():
print("Niesamowite! Masz tak samo na imię jak ja!")
else:
print("Miło mi Cię poznać, {imie_uzytkownika}, ale mamy różne imiona.")




    // Zad 7

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        boolean pelnoletni = (wiek >= 18) ? true : false;

        System.out.println("Czy jesteś pełnoletni? " + pelnoletni);

        scanner.close();
    }
}



// Zad 8


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rok: ");
        int rok = scanner.nextInt();

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Podany rok jest rokiem przestępnym.");
        } else {
            System.out.println("Podany rok nie jest rokiem przestępnym.");
        }

        scanner.close();
    }
}



// Zad 9


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wagę w kg: ");
        double waga = scanner.nextDouble();

        System.out.print("Podaj wzrost w metrach: ");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        } else if (bmi <= 24.9) {
            System.out.println("waga prawidłowa");
        } else {
            System.out.println("nadwaga");
        }

        scanner.close();
    }
}
