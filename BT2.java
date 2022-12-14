import java.util.Scanner;

public class BT2 {
	public static void main(String[] args) {
	 Scanner kb = new Scanner(System.in);
	 int day;
	 System.out.println("Please input number from 2 to 8");
	 day = kb.nextInt();
	 switch(day) {
	 	case 2:{
		 System.out.println("Monday");
		 break;
	 	}
		case 3:{
			 System.out.println("Tusday");
			 break;
		 	}
		case 4:{
			 System.out.println("Wesnesday");
			 break;
		}
		case 5:{
			 System.out.println("Thusday");
			 break;
		 	}
		case 6:{
			 System.out.println("Friday");
			 break;
		 	}
		case 7:{
			 System.out.println("Saturday");
			 break;
		 	}
		case 8:{
			 System.out.println("Sunday");
			 break;
		}
	 	default: {
	 		System.out.println("Please input number from 2 to 8");
	 	}
	 }
	}
}
