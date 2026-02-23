package CodingProblems.OOPs.Inheritance;

import java.util.Scanner;

class  Account {
    protected  double balance;
    void deposit(double amount){
        balance += amount;
    }
}

class SavingAccount extends Account{
    double interestRate;
    void addInterest(){
        balance += balance * interestRate;
        System.out.println("Balance: " + balance);
    }
}

public class SimpleBankingInheritance {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        System.out.print("Please Enter Amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        savingAccount.deposit(amount);
        double interestRateValue = 0.002;
        savingAccount.interestRate = interestRateValue;
        savingAccount.addInterest();
    }
}
