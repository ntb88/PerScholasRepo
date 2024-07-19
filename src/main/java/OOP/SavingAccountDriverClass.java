package OOP;

public class SavingAccountDriverClass {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();
        double balance;

        SavingsAccount.setAnnualInterestRate(3);
        saver1.setSavingsBalance(2000);
        //System.out.println(saver1.calculateMonthlyInterest());
        balance = saver1.calculateMonthlyInterest() + saver1.getSavingsBalance();
        System.out.println("saver1 balance is: " + balance);
        saver2.setSavingsBalance(3000);
        //System.out.println(saver2.calculateMonthlyInterest());
        balance = saver2.calculateMonthlyInterest() + saver2.getSavingsBalance();
        System.out.println("saver2 balance is: " + balance);

        //update the interest rate
        SavingsAccount.setAnnualInterestRate(4);
        saver1.setSavingsBalance(2000);
        balance = saver1.calculateMonthlyInterest() + saver1.getSavingsBalance();
        System.out.println("saver1 updated balance is: " + balance);
        saver2.setSavingsBalance(3000);
        balance = saver2.calculateMonthlyInterest() + saver2.getSavingsBalance();
        System.out.println("saver2 updated balance is: " + balance);

    }
}
