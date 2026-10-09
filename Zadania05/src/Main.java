// Zad 1




public class Main {

    public static int wiek() {
        return 19;
    }

    public static void main(String[] args) {
        System.out.println(wiek());
    }
}




// Zad 2

public class Main {

    public static String imie() {
        return "Michał";
    }

    public static void main(String[] args) {
        System.out.println(imie());
    }
}


// Zad 3


public class Main {

    public static void obliczenia(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    public static void main(String[] args) {
        obliczenia(34, 67);
    }
}


// Zad 4



public class Main {

    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(czyParzysta(4));
    }
}




// Zad 5


public class Main {
    public static boolean czyPodzielna(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    public static void main(String[] args) {
        System.out.println(czyPodzielna(15)); // true
        System.out.println(czyPodzielna(10)); // false
        System.out.println(czyPodzielna(30)); // true
    }
}






