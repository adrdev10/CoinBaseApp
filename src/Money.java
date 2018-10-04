
public class Money {
	private int dollars; 
	private int cents;
	
	private final int DOLLARS = 100;
	private final int QUATERS = 25;
	private final int DIMES = 10;
	private final int NICKELS = 5;
	private final int PENNIES = 1;
	
	
	public Money() {
		// TODO Auto-generated constructor stub
		this.dollars = 10;
		this.cents = 0;
	}
	
	public Money(int dollars, int cents) {
		this.dollars = dollars;
		this.cents = cents;
	}
	
	
	
	public int getDollars() {
		return this.dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getCents() {
		return this.cents;
	}

	public void setCents(int cents) {
		this.cents = cents;
	}

	public void increment(String value) {
		double finalAmount = 0;
		if (value.equals("0")) {
			System.out.printf("Your value is still $%d.%.2f", this.dollars, this.cents);
			return;
		}else {
			String[] dollarV = value.split(("\\."));
			int totalValueCents = (Integer.parseInt(dollarV[0])  * DOLLARS) + Integer.parseInt(dollarV[1]);
			int totalCents = (this.dollars * DOLLARS) + this.cents;
			finalAmount = (double)(totalValueCents + totalCents) / 100;
			System.out.printf("final amount is: $%.2f\n", finalAmount);
		}
	}
	
	public void decrement(String value) {
		double finalAmount = 0;
		if (value.equals("0")) {
			System.out.printf("Your value is still $%d.%d", this.dollars, this.cents);
			return;
		}else {
			String[] dollarV = value.split(("\\."));
			int totalValueCents = (Integer.parseInt(dollarV[0].substring(1))  * DOLLARS) + Integer.parseInt(dollarV[1]);
			int totalCents = (this.dollars * DOLLARS) + this.cents;
			if (totalValueCents > totalCents) {
				finalAmount = (double)(totalValueCents - totalCents) / 100;
				System.out.printf("final amount is: $%.2f\n", finalAmount);
			}else {
				finalAmount = (double)(totalCents - totalValueCents) / 100;
				System.out.printf("final amount is: $%.2f\n", finalAmount);
			}
		}
	}
	
	public String getAmount() {
		String totalM = String.join(".", Integer.toString(getDollars()), Integer.toString(getCents()));
		return totalM;
	}
	
	
	@Override
	public String toString() {
		int totalCents = (this.dollars * DOLLARS) + this.cents;
		System.out.println("Your total number of cents is " + totalCents);
		
		int quaters = totalCents / QUATERS;
		System.out.println("Your total number of quaters is " + quaters);
		
		int nickles = totalCents / NICKELS;
		System.out.println("Your total number of nickles is " + nickles);
		
		int dimes = totalCents / DIMES;
		System.out.println("Your total number of dimes is " + dimes + "and left cents is: " + totalCents % DIMES);
		
		return "Your cash is " + this.dollars + "." + this.cents;
	}
}
