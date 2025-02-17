package Week4.Day1;

public class PaymentSystem {
	    public static void main(String[] args) {
	        Amazon amazon = new Amazon();

	        // Testing methods
	        amazon.cashOnDelivery();
	        amazon.upiPayments();
	        amazon.cardPayments();
	        amazon.internetBanking();
	        amazon.recordPaymentDetails();
	    }
	}
