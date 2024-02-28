package question5;

public class Main5 {

	public static void main(String[] args) {
		// to create a pattern of number
		int m=55555, n=1111;
		for(int i=1;i<=5;i++) {
			System.out.println(m);
			//we can change this value to control the pattern size
			m=m-n;
			n=n/10;
		}

	}

}
