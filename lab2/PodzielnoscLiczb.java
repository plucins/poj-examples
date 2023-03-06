package pl.pjatk.metody;

import java.util.Scanner;

public class PodzielnoscLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba,dzielnik;

        do {
            System.out.println("Wprowadź liczbę");
            liczba = scanner.nextInt();
            System.out.println("Wprowadź dzielnik");
            dzielnik = scanner.nextInt();
            System.out.println(czyLiczbaPodzielnaPrzez(liczba,dzielnik));
        }while (liczba!=0);


//        System.out.println(czyLiczbaPodzielnaPrzez3Lub5(liczba));
    }

    private static boolean czyLiczbaPodzielnaPrzez3Lub5(int liczba) {
        if (czyLiczbaPodzielnaPrzez(liczba, 3)){
            return true;
        }
        if (czyLiczbaPodzielnaPrzez(liczba,5 )){
            return true;
        }
        return false;
    }

    private static boolean czyLiczbaPodzielnaPrzez(int liczba, int dzielnik){
        return liczba%dzielnik==0;
    }
}
