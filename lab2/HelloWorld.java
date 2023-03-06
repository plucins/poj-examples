package pl.pjatk.metody;

public class HelloWorld {
    public static void hello(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        hello();
        hello(3);

        przedstawSie("Bartosz");
        przedstawSie("Julia");
    }

    private static void hello(int liczba) {
        for (int i=0; i<liczba;i++){
            System.out.println("Hello WOrld!");
        }
    }

    private static void przedstawSie(String imie) {
        System.out.printf("Cześć, jestem %s\n", imie);
    }
}
