//package lab3.zad1;
//
//import lab3.zad2.Owner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Owner ownerAdam = new Owner("Adam", "Adamowicz");
//        Owner ownerJan = new Owner("Jan", "Janowicz");
//
////        ownerAdam.showContent();
////        ownerJan.showContent();
//
//        BankAccount bankAccountAdam = new BankAccount(ownerAdam);
//        BankAccount bankAccountJan = new BankAccount(new Owner("Jan", "Janowicz"));
//
//        bankAccountAdam.showBalance();
//        bankAccountAdam.deposit(10);
//        bankAccountAdam.showBalance();
//
//        bankAccountJan.showBalance();
//        bankAccountJan.deposit(1000);
//        bankAccountJan.showBalance();
//
//        bankAccountJan.transferTo(bankAccountAdam, 10);
//        bankAccountJan.showBalance();
//        bankAccountAdam.showBalance();
//
//
//        bankAccountAdam.transferTo(bankAccountJan, 30);
//        bankAccountAdam.showBalance();
//        bankAccountJan.showBalance();
//
//
//
//
//    }
//}
