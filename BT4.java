import java.util.Scanner;

public class BT4 {

	public static void main(String[] args) {
		Scanner  kb = new Scanner(System.in) ;
		int a,b,c;
	   System.out.println("Please input length of side A of triangle");
	   a = kb.nextInt();
	   System.out.println("Please input length of side B of triangle");
	   b = kb.nextInt();
	   System.out.println("Please input length of side C of triangle");
	   c = kb.nextInt();
	   if ((a+b<c)||(a+c<b)||(b+c<a)) {
			System.out.println("This is NOT 3 side of triangle");
		}
	   else {
		   if ((a==b)&& (b==c)) 
			   System.out.println("Day la tam giac deu");
			   else if((a==b)||(b==c)||(c==a))  
			   System.out.println("Day la tam giac can");
			   else if((a*a == b*b+c*c)||(b*b == a*a+c*c)||(c*c == b*b+a*a)) {
					 System.out.println("Day la tam giac vuong");	
			   }  
			   else
				   System.out.println("Day la tam giac thuong");
			
}}}