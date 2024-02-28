package question1;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		//Scanner class object to read input from user
		Scanner input = new Scanner (System.in);
		System.out.println("enter the numbers to be printed");
		//read number from user
		int number=input.nextInt();
		//to print number from 10 to 50
	for(int i=10;i<=50;i++) {
		System.out.print(i+"  ");
	}
	
	}

}
