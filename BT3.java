import java.util.Scanner;

public class BT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  kb = new Scanner(System.in) ;
		float a,b,c;
	   System.out.println("Please input length of side A of triangle");
	   a = kb.nextFloat();
	   System.out.println("Please input length of side B of triangle");
	   b = kb.nextFloat();
	   System.out.println("Please input length of side C of triangle");
	   c = kb.nextFloat();
	   if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
		System.out.println("This is 3 side of triangle");
	}
	   else {
		System.out.println("This is NOT 3 side of triangle");
	}
	}

}
