public class BankAccount {
    long accountNumber;
    int balance;

    public BankAccount(long accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayBalance(){
        System.out.println("Stan konta to: " + balance);
    }

    public void depositFunds(int amount){
        balance += amount;
        System.out.println("Wpłacam na konto " + amount);
    }

    public void withdrawFunds(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Wyplacam z konta " + amount);
        }
        else {
            System.out.println("Sorki już nie ma keszu. Stan konta to " + balance + " a próbujesz wyplacic " + amount);
        }
    }

    public void transferFunds(int amount, Person person){
        balance -= amount;
        person.bankAccount.depositFunds(amount);
    }





}
