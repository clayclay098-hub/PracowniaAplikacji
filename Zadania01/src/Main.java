void main() {

    // Zad.1 Wyświetlenie trzech imion w trzech kolejnych liniach
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    // Zad.2

    String imie = "Michał";
    int rok = 2007;
    double liczba = 0.66;


    // Zad.3
    int wiek = 2026 - rok;
    System.out.println("Mam na imię " + imie + ", mam " + wiek + " lat i będę pisać maturę za " + liczba + " roku.");
}


    // Zad.4
public class KonwerterTemperatury {
    public static void main(String[] args) {
        // Tworzymy obiekt Scanner do wczytywania danych z konsoli
        Scanner scanner = new Scanner(System.in);

        // Wypisujemy informację dla użytkownika przed wczytaniem danych
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");

        // Wczytujemy wartość i zapisujemy ją w zmiennej o nazwie stopnie
        double stopnie = scanner.nextDouble();

        // Obliczamy temperaturę w skali Fahrenheita zgodnie ze wzorem
        double fahrenheit = 1.8 * stopnie + 32.0;

        // Wyświetlamy wynik użytkownikowi
        System.out.println(stopnie + " stopni Celsjusza to " + fahrenheit + " stopni Fahrenheita.");

        // Zamykamy scanner
        scanner.close();
    }
}




    // Zad.5
    public class ObwodTrojkata {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj pierwszy bok:");
            double a = scanner.nextDouble();

            System.out.println("Podaj drugi bok:");
            double b = scanner.nextDouble();

            System.out.println("Podaj trzeci bok:");
            double c = scanner.nextDouble();

            double obwod = a + b + c;

            System.out.println("Obwód trójkąta wynosi: " + obwod);

            scanner.close();
        }
    }


