import java.util.Scanner;

public class ptb2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float a,b,c,denta,x1,x2;
		System.out.println("Please input value of A variable ");
		a  = kb.nextFloat();
		System.out.println("Please input value of B variable ");
		b  = kb.nextFloat();
		System.out.println("Please input value of C variable ");
		c  = kb.nextFloat();
		denta = b*b - 4*a*c;
		if (a==0){
			if (b==0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else {
				System.out.println("Day la phuong trinh bac nhat voi gia tri: x = " + (-c/b));
			}
		}
		else {
		
			if (denta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			 else if(denta == 0) {
				System.out.println("Phuong trinh co nghiem kep:x1 = x2 =" + (-b/2*a));
			}
			 else 
			 {
				System.out.println("Phuong trinh co 2 nghiem phan biet x1 =" + (-b+Math.sqrt(denta))/(2*a)+" va x2 =" + (-b - Math.sqrt(denta))/(2*a));
	
			 }
		}
	}

}
