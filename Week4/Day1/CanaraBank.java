package Week4.Day1;

//Abstract Class CanaraBank
abstract class CanaraBank implements Payments {
 // Abstract method specific to CanaraBank
 abstract void recordPaymentDetails();

 // Providing default implementation for Payments interface methods
 public void cashOnDelivery() {
     System.out.println("Cash on Delivery payment processed by CanaraBank.");
 }

 public void upiPayments() {
     System.out.println("UPI payment processed by CanaraBank.");
 }

 public void cardPayments() {
     System.out.println("Card payment processed by CanaraBank.");
 }

 public void internetBanking() {
     System.out.println("Internet Banking payment processed by CanaraBank.");
 }
}
