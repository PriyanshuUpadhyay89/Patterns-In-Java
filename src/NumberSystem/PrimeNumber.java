package NumberSystem;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	boolean b=isPrime(n);
	if(b== true) {
		System.out.println(n+" number is prime");
	}else {
		System.out.println(n+" number is not a prime number");
	}
}
 public static boolean isPrime(int n) {
	 for(int i=2;i<=n/2;i++) {
		 if(n%i==0) {
			 return false;
		 }
	 }return true;
 }
}
