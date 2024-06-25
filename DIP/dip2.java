// Define the abstraction
interface Payment {
    void processPayment(double amount);
}

// Implement the abstraction for CreditCard
class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

// Implement the abstraction for PayPal
class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}

// High-level module depends on the abstraction
class PaymentProcessor {
    private Payment payment;

    public PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    public void processPayments(double amount) {
        payment.processPayment(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        Payment payPalPayment = new PayPalPayment();

        PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardPayment);
        PaymentProcessor payPalProcessor = new PaymentProcessor(payPalPayment);

        creditCardProcessor.processPayments(100.0);
        payPalProcessor.processPayments(200.0);
    }
}
