import java.util.Iterator;
import java.util.Scanner;

public class BT7 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.println("Please input value of multiplication table");
		n = kb.nextInt();
		if (n > 10) {
			System.out.println("Please input value <=10");
		} else {
			for (int i = 1; i <=10; i++) {
				System.out.println(n + "x" + i + "=" + n*i);
			}
		}
		
			
	  }
	
}
