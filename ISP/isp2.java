interface PaymentProcessor {
    void processPayment(double amount);
}

interface RefundablePayment {
    void refundPayment(double amount);
}

interface SplittablePayment {
    void splitPayment(double amount);
}

class CreditCardPayment implements PaymentProcessor, RefundablePayment, SplittablePayment {
    public void processPayment(double amount) {
        // process credit card payment
    }

    public void refundPayment(double amount) {
        // refund credit card payment
    }

    public void splitPayment(double amount) {
        // split credit card payment
    }
}

class PayPalPayment implements PaymentProcessor, RefundablePayment {
    public void processPayment(double amount) {
        // process PayPal payment
    }

    public void refundPayment(double amount) {
        // refund PayPal payment
    }
}

class CryptoPayment implements PaymentProcessor {
    public void processPayment(double amount) {
        // process cryptocurrency payment
    }
}
