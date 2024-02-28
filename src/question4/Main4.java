package question4;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
      System.out.println("enter the number");
      int number=input.nextInt();
      //to reverse the numbers
     int  reverse=0;
     while (number!=0) {
    	 int remainder=number%10;
    	 reverse=reverse*10+remainder;
    	 number=number/10;
     }
	System.out.println("the reverse of the numberis:" +reverse);
	
	}
}
