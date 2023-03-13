public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(123L,100);
        BankAccount bb = new BankAccount(123L,500);

        ba.displayBalance();
        ba.depositFunds(100);
        ba.displayBalance();
        ba.withdrawFunds(400);

        Person pawel = new Person("Paweł", 1997, ba);
        Person piotr = new Person("Piotr", 1998, new BankAccount(99, 10));

        bb.displayBalance();
        bb.transferFunds(500, pawel);
        System.out.print("Stan konta Pawla - ");
        pawel.bankAccount.displayBalance();
        System.out.println();
        bb.displayBalance();

    }
}