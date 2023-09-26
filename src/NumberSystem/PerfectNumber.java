package NumberSystem;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	boolean b=isPerfect(n);
	if(b==true){
		System.out.println(n+" number is perfect");
	}else {
		System.out.println(n+" number is not a perfect");
	}
}
public static boolean isPerfect(int n) {
	int sum=0; 
	int temp=n;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	
	}return true;
}
}
