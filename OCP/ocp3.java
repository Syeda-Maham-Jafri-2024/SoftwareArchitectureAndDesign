public interface IPaymentMethod
{
    void ProcessPayment(decimal amount);
}

public class CreditCardPayment : IPaymentMethod
{
    public void ProcessPayment(decimal amount)
    {
        // Process credit card payment
    }
}

public class PayPalPayment : IPaymentMethod
{
    public void ProcessPayment(decimal amount)
    {
        // Process PayPal payment
    }
}

public class BitcoinPayment : IPaymentMethod
{
    public void ProcessPayment(decimal amount)
    {
        // Process Bitcoin payment
    }
}

public class PaymentProcessor
{
    private readonly IPaymentMethod paymentMethod;
    
    public PaymentProcessor(IPaymentMethod paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }
    
    public void ProcessPayment(decimal amount)
    {
        paymentMethod.ProcessPayment(amount);
    }
}

// Client code
IPaymentMethod paymentMethod = new CreditCardPayment(); // Or new PayPalPayment(), new BitcoinPayment()
PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);
paymentProcessor.ProcessPayment(100.00m);
