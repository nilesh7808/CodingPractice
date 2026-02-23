package CodingProblems.OOPs.Inheritance;


class  Account {
    protected  double balance;
    void deposit(double amount){
        balance = balance + amount;
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
        savingAccount.interestRate = 12;
        savingAccount.addInterest();
    }
}
