package ch06.exercise.p19;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10_000);
        System.out.println("account.getBalance() = " + account.getBalance()); // 현재 잔고 : 10000

        account.setBalance(-100);
        System.out.println("account.getBalance() = " + account.getBalance()); // 현재 잔고 : 10000

        account.setBalance(2_000_000);
        System.out.println("account.getBalance() = " + account.getBalance()); // 현재 잔고 : 10000

        account.setBalance(300_000);
        System.out.println("account.getBalance() = " + account.getBalance()); // 현재 잔고 : 300000
    }
}
