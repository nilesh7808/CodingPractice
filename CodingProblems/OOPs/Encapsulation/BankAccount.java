package CodingProblems.OOPs.Encapsulation;

import java.util.Scanner;

public class BankAccount {

    private double balance; // hiding state as we are using private access modifiers

    public void deposit(double amount){  // this is behaviour means its behaviour is to add amount on it
        // and it depends on amount so thats why it is binding with the amount
        if(amount > 0){
            balance = balance + amount;
        } else{
            System.out.println("Entered Amount should be greater than 0.");
        }
    }

    public void withdraw(double amount){
        if( amount > 0 && amount <= balance){
            balance = balance - amount;
        } else {
            System.out.println("Withdraw amount should be greater than 0.");
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.print("Enter an amount you want to deposit : ");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextInt();
        if (amount > 0) {
            bankAccount.deposit(amount);
            System.out.println("Now your current balance is " + bankAccount.getBalance());
        } else {
            System.out.println("Deposit not possible because you entered " + amount + " but it should be greater than 0.");
        }
        System.out.print("Enter an amount you want to withdraw : ");
        Scanner sc1 = new Scanner(System.in);
        double withdrawAmount = sc1.nextInt();
        if (withdrawAmount > 0) {
            bankAccount.withdraw(withdrawAmount);
            System.out.println("Now your current balance is " + bankAccount.getBalance());
        } else {
            System.out.println("Withdraw not possible because you entered " + withdrawAmount + " but it should be greater than 0.");
        }
        System.out.println("Thank You for using SBI Banking. Stay Connected !!!");
    }

}
