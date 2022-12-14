import java.util.Scanner;

public class BT6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
       int n;
       int sum = 0;
       System.out.println("Please input total number:");
       n= kb.nextInt();
       for (int i=0; i<=n;i++) {
    	   sum=sum+i;
       }	
       System.out.println("Total:"+ sum);
	}

}

