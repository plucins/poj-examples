package pl.pjatk.metody;

public class PSVM {
    public static void main(String[] args) {
        int[] liczby = zamienNaLiczby(args);
        int suma = zsumuj(liczby);
        System.out.println("Suma liczb to "+suma);
    }

    private static int zsumuj(int[] liczby) {
        int suma=0;
        for (int liczba:liczby){
            suma+=liczba;
        }
        return suma;
    }

    private static int[] zamienNaLiczby(String[] args) {
        int[] liczby = new int[args.length];
        for (int i=0; i<args.length; i++){
            liczby[i] = Integer.parseInt(args[i]);
        }
        return liczby;
    }
}
