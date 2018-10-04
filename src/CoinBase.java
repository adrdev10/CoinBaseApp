import java.util.Scanner;

public class CoinBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Money m = new Money(10, 15);
//		System.out.println(m.toString());
		System.out.println("Welcome To `MONEY COIN APP`");
		System.out.println("To exit the app press 0");
		System.out.println("Amount must be entered in dollar currency format. Example => $3.20");
		System.out.println("Your initial amount is :" + " $" + m.getAmount());
		Scanner sc = new Scanner(System.in);
		String value;
		do {
			System.out.println("Please enter a value to decrement original amount");
			value = sc.nextLine();
			//Decresing value 
			m.decrement(value);
			
		}while(!(value.equalsIgnoreCase("0")));
		
		
	
	}

}
