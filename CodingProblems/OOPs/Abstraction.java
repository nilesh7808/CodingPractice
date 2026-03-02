package CodingProblems.OOPs;

abstract class PaymentService{
    abstract void pay(double amount);
}

class UpiPayment extends PaymentService {
    @Override
    void pay(double amount) {
        System.out.println("Payment is processing via UPI of Amount " + amount);
    }
}

class CardPayment extends PaymentService{
    @Override
    void pay(double amount) {
        System.out.println("Payment is processing via Card of Amount " + amount);
    }
}

public class Abstraction {

    public static void main(String[] args) {
        System.out.println("Transaction will be display below:");
        PaymentService paymentService = new UpiPayment();
        paymentService.pay(12000);
    }

}
