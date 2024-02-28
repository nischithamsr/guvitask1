package question3;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter num1 num2 num3");
	int num1 =input.nextInt();
	int num2 =input.nextInt();
	int num3 =input.nextInt();
	if(num1<num2 && num1<num3) {
		System.out.println("the smallest number is:" +num1);
	}
	else if(num2<num1 && num2<num3){
		System.out.println("the smallest number is:" +num2);
	}
	else 

	{
		System.out.println("the smallest number is:" +num3);
		
	}
	
	}
}
