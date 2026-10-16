// Zad 1



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj dodatnia liczbe calkowita: ");
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

        System.out.print("Podaj pierwszy bok: ");
        int a = scanner.nextInt();

        System.out.print("Podaj drugi bok: ");
        int b = scanner.nextInt();

        System.out.print("Podaj trzeci bok: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Mozna zbudowac trojkat.");
        } else {
            System.out.println("Nie mozna zbudowac trojkata.");
        }

        scanner.close();
    }
}





// Zad 3



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwsza liczbe: ");
        int a = scanner.nextInt();

        System.out.print("Podaj druga liczbe: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Najwieksza liczba to: " + a);
        } else if (b > a) {
            System.out.println("Najwieksza liczba to: " + b);
        } else {
            System.out.println("Obie liczby sa rowne.");
        }

        scanner.close();
    }
}



