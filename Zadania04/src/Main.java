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




// Zad 7

public class Main {
    public static void main(String[] args) {

        String[] tablica1 = {"Ala", "ma", "kota"};
        String[] tablica2 = {"Ala", "ma", "kota"};

        boolean takieSame = true;

        if (tablica1.length != tablica2.length) {
            takieSame = false;
        } else {
            for (int i = 0; i < tablica1.length; i++) {
                if (!tablica1[i].equals(tablica2[i])) {
                    takieSame = false;
                    break;
                }
            }
        }

        if (takieSame) {
            System.out.println("Tablice sa takie same.");
        } else {
            System.out.println("Tablice nie sa takie same.");
        }
    }
}




// Zad 8






import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] liczby = new int[10];

        // Wypełnienie tablicy liczbami od -10 do 10
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(21) - 10;
        }

        // Wypisanie tablicy
        System.out.println("Tablica:");
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }

        // Wyznaczenie najmniejszego i największego elementu
        int min = liczby[0];
        int max = liczby[0];

        for (int liczba : liczby) {
            if (liczba < min) {
                min = liczba;
            }

            if (liczba > max) {
                max = liczba;
            }
        }

        // Obliczenie sumy
        int suma = 0;

        for (int liczba : liczby) {
            suma += liczba;
        }

        // Obliczenie średniej
        double srednia = (double) suma / liczby.length;

        // Liczenie elementów mniejszych i większych od średniej
        int mniejsze = 0;
        int wieksze = 0;

        for (int liczba : liczby) {
            if (liczba < srednia) {
                mniejsze++;
            } else if (liczba > srednia) {
                wieksze++;
            }
        }

        // Wyświetlenie wyników
        System.out.println();
        System.out.println("Najmniejszy element: " + min);
        System.out.println("Najwiekszy element: " + max);
        System.out.println("Srednia arytmetyczna: " + srednia);
        System.out.println("Elementow mniejszych od sredniej: " + mniejsze);
        System.out.println("Elementow wiekszych od sredniej: " + wieksze);

        // Wypisanie tablicy w odwrotnej kolejności
        System.out.println("Tablica w odwrotnej kolejnosci:");
        for (int i = liczby.length - 1; i >= 0; i--) {
            System.out.print(liczby[i] + " ");
        }
    }
}


// Zad 9


import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] liczby = new int[20];
        int[] ile = new int[11];

        // Wypełnienie tablicy liczbami od 1 do 10
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(10) + 1;
        }

        // Wypisanie zawartości tablicy
        System.out.println("Tablica:");

        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }

        System.out.println();
        System.out.println("Liczba wystapien:");

        // Zliczanie wystąpień
        for (int liczba : liczby) {
            ile[liczba]++;
        }

        // Wypisanie wyników
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " - " + ile[i] + " razy");
        }
    }
}






