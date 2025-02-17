package Week4.Day1;

class Amazon extends CanaraBank {
    @Override
    void recordPaymentDetails() {
        System.out.println("Payment details recorded by Amazon.");
    }

    @Override
    public void cashOnDelivery() {
        System.out.println("Cash on Delivery payment handled by Amazon.");
    }

    @Override
    public void upiPayments() {
        System.out.println("UPI payment handled by Amazon.");
    }

    @Override
    public void cardPayments() {
        System.out.println("Card payment handled by Amazon.");
    }

    @Override
    public void internetBanking() {
        System.out.println("Internet Banking payment handled by Amazon.");
    }
}
