//package lab3;
//
//import lab3.Owner;
//
//public class BankAccount {
//    private double saldo;
//    private Owner owner;
//
//    public BankAccount(Owner owner){
//        this.saldo = 0;
//        this.owner = owner;
//    }
//
//    public void showBalance(){
//        System.out.println(this.owner.returnOwnerInfo() + " saldo = " + this.saldo);
//    }
//
//    public void deposit(double amount){
//        this.saldo = this.saldo + amount;
//    }
//
//    public double withdraw(double amount){
//        if (this.saldo >= amount) {
//            this.saldo -= amount;
//            return amount;
//        }
//        else {
//            System.out.println("Brak środków na koncie");
//            return 0;
//        }
//
//    }
//
//    public void transferTo(BankAccount bankAccount, double amount){
//        if(this.withdraw(amount) > 0){
//            bankAccount.saldo = bankAccount.saldo + amount;
//        }
//    }
//
//
//}
