import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
    		Scanner kb = new Scanner(System.in);
    	int a;	
		System.out.println("Please input positive number:");
		a = kb.nextInt();
		if (a > 0)
		{
			System.out.println("This is positive number");
		}
		else
		{
			System.out.println("This is nagitave number");
		}
	}
	
	
}
