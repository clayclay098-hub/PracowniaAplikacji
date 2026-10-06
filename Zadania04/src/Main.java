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



