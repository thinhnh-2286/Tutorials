package Array;
import java.util.Iterator;
import java.util.Scanner;

public class Array_1 {
	/*Viết chương trình nhập vào một mảng số nguyên có n phần tử và thực hiện các công việc sau:
Xuất giá trị các phần tử của mảng.
	Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
Đếm số phần tử là số chẵn.
Sắp xếp mảng tăng dần. */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
			int n;
		System.out.println("Please input number value of Array");	
		n = kb.nextInt();
		int arrayA[] = new int[n];
		for(int i = 0; i < n ; i++) {
			System.out.println("Please input value:" +i+":");
			arrayA[i] = kb.nextInt();
		}
		
		
		}
			
	}


