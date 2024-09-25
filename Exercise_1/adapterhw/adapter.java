interface PaymentProcessor {
    public void processPayment(String orderId, double amount);
}

interface ExternalPaymentSystem {
    public void authorizePayment(String transactionId, double amount);

    public void capturePayment(String transactionId, double amount);
}

class ExternalPaymentSystemAdapter implements PaymentProcessor {
    private ExternalPaymentSystem paymentSystem;

    public ExternalPaymentSystemAdapter(ExternalPaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public void processPayment(String orderId, double amount) {
        String transactionId = generateTransactionId(orderId, amount);
        paymentSystem.authorizePayment(transactionId, amount);
        paymentSystem.capturePayment(transactionId, amount);
    }

    private String generateTransactionId(String orderId, double amount) {
        return orderId + "-" + Double.toString(amount);
    }
}

// Example usage of the adapter
class localDominoesOrderingSystem {
    private PaymentProcessor paymentProcessor;

    public localDominoesOrderingSystem(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(String orderId, double amount) {
        paymentProcessor.processPayment(orderId, amount);
    }
}

class ExternalPaymentSystemImpl implements ExternalPaymentSystem {
    public void authorizePayment(String transactionId, double amount) {
        System.out.println("this is authorised payment");
    }

    public void capturePayment(String transactionId, double amount) {
        System.out.println("this payment has been captured of " + amount);
    }
}

public class adapter {
    public static void main(String[] args) {

        ExternalPaymentSystem externalPaymentSystem = new ExternalPaymentSystemImpl();

        PaymentProcessor paymentProcessor = new ExternalPaymentSystemAdapter(externalPaymentSystem);

        localDominoesOrderingSystem orderingSystem = new localDominoesOrderingSystem(paymentProcessor);

        orderingSystem.placeOrder("12345", 19.99);
    }
}
