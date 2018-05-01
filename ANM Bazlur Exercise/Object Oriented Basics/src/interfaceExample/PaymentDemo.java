package interfaceExample;

public class PaymentDemo {

	public static void main(String[] args) {
		PaymentEngine Bank = new PaymentEngine();
		
		BkashPayment bkashPayment = new BkashPayment();
		CashPayment cashPayment = new CashPayment();
		
		Bank.accept(bkashPayment);
		Bank.accept(cashPayment);

	}

}
