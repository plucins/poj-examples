package lab1;

import java.util.Scanner;

public class Excercise1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String imie;
        String nazwisko;
        int liczbaPkt = 0;

        int najwiekszaLiczbaPkt = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Podaj imie ucznia numer " + i);
            System.out.println(liczbaPkt);
            imie = scanner.nextLine();
            System.out.println("Podaj nazwisko ucznia numer " + i);
            nazwisko = scanner.nextLine();
            System.out.println("Podaj liczbe pkt ucznia numer " + i);
            liczbaPkt = Integer.parseInt(scanner.nextLine());
             if(liczbaPkt >= najwiekszaLiczbaPkt) {
                 najwiekszaLiczbaPkt = liczbaPkt;
             }
        }


        System.out.println(najwiekszaLiczbaPkt);

    }
}