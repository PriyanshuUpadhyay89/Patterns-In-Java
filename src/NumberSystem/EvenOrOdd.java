package NumberSystem;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	boolean b=isEvenOrOdd(n);
	if (b==true) {
		System.out.println(n+" number is even");
	}else {
		System.out.println(n+" number is odd");
	}
	}
public static boolean isEvenOrOdd(int n) {
	for(int i=1;i<=n;i++) {
		if(n%2==0) {
			return true;
		}
	}return false;
}

}
