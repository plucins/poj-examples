package pl.pjatk.tablice;

import java.util.Arrays;

public class Liczby {
    public static void main(String[] args) {
        int[] liczby = new int[]{1, 3, 5, 19, 55, 70, 80};
        int[] liczby2 = new int[]{100, 20, 30, 50, 212};

        for (int liczba : liczby) {
            System.out.println(liczba);
        }

        System.out.println(Arrays.toString(liczby));

        System.out.println("Liczby o parzystym indeksie");

        drukujLiczbyOIndeksieParzystym(liczby);

        System.out.println("Liczby parzyste");
        drukujLiczbyParzyste(liczby);
        drukujLiczbyParzyste(liczby2);

    }

    private static void drukujLiczbyOIndeksieParzystym(int[] liczby) {
        for (int i = 2; i < liczby.length; i++) {
            if (i % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
    }

    private static void drukujLiczbyParzyste(int[] liczby) {
        for (int liczba : liczby) {
            if (liczba % 2 == 0) {
                System.out.print(liczba + ",");
            }
        }
        System.out.println();
    }
}
