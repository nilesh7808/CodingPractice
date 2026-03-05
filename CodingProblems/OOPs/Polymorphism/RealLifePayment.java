package CodingProblems.OOPs.Polymorphism;

interface Payment{
    void pay(double amount);
}

class UpiPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid via UPI of amount " + amount);
    }
}

class CardPayment implements Payment{
    public void pay(double amount){
        System.out.println("Paid via Card of amount " + amount);
    }
}

class NetBanking implements Payment{
    public void pay(double amount){
        System.out.println("Paid via Net Banking of amount " + amount);
    }
}

public class RealLifePayment {
    public static void main(String[] args) {
//        Payment payment = new CardPayment();  // polymorphism
//        Payment payment = new UpiPayment();  // Polymorphism
        Payment payment = new NetBanking();   // Polymorphism
        payment.pay(12233);
    }
}
