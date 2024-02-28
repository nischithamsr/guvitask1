package question2;
import java.util.Scanner;
public class Main2 {
    //to check whether number is positive or negative
	public static void main(String[] args) {
	// to use scanner class to read input from user	
		Scanner input=new Scanner (System.in);
		System.out.println("enter the number");
		//read number from user -keyboard
		int number=input.nextInt();
		if( number<0) {
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("the number is positive");
			
		}
		

	}

}
