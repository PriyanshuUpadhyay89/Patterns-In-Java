package Pattern;

import java.util.Scanner;

public class SquarePattern13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int c = n;
			int temp = i;
			for (int j = 1; j <= n; j++) {
				System.out.print(temp + " ");
				c--;
				temp = temp + c;
			}
			System.out.println();
		}
	}
}