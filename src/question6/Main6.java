package question6;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("enter the purchase amount");
		int amount=input.nextInt();
		if( amount<500) {
			System.out.println("no discount");
		}
			else if(amount>500 && amount<1000) {
				System.out.println("10% discount");
				int amountfinal=amount-(amount*10/100);
			System.out.println("final amount is:" +amountfinal);
		}
			else if(amount >1000){
				System.out.println("20% discount");
				int amountfinal=amount-(amount*20/100);
				System.out.println("final amount is:" +amountfinal);
			}
	}

}
