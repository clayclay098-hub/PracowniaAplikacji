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



// Zad 6





public class Main {
    public static int doSzescianu(int liczba) {
        return liczba * liczba * liczba;
    }

    public static void main(String[] args) {
        System.out.println(doSzescianu(3)); // 27
        System.out.println(doSzescianu(2)); // 8
        System.out.println(doSzescianu(5)); // 125
    }
}



// Zad 7



public class Main {
    public static double pierwiastek(int liczba) {
        return Math.sqrt(liczba);
    }

    public static void main(String[] args) {
        System.out.println(pierwiastek(9));  // 3.0
        System.out.println(pierwiastek(16)); // 4.0
        System.out.println(pierwiastek(25)); // 5.0
    }
}




// Zad 8



public class Main {
    public static boolean czyProstokatny(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        double najdluzszy = Math.max(a, Math.max(b, c));

        if (najdluzszy == a) {
            return a * a == b * b + c * c;
        } else if (najdluzszy == b) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }

    public static void main(String[] args) {
        System.out.println(czyProstokatny(3, 4, 5)); // true
        System.out.println(czyProstokatny(5, 12, 13)); // true
        System.out.println(czyProstokatny(2, 3, 4)); // false
    }
}






// Zad 9








