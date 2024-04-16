package ClassesPractice;

import java.time.LocalDate;

public class Account {
    private int id = 0;
    private double balance= 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = LocalDate.now();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double withdraw){
         balance = balance - withdraw;
         return withdraw;
    }
    public double deposit(double deposit){
        balance = balance + deposit;
        return deposit;
    }

    @Override
    public String toString() {
        return "ClassesPractice.Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public static void main(String[] args){
        Account acc1 = new Account();
        System.out.println(acc1.toString());
        acc1.setBalance(7000);
        acc1.deposit(500);
        acc1.withdraw(250);
        acc1.setDateCreated(LocalDate.now());
        System.out.println(acc1.toString());
    }
}
