package NumberSystem;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	public static int fact(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
		}return sum;
	}

}
