package Pattern;

import java.util.Scanner;

public class TrianglePattern10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	for(int i=n;i>=1;i--) {
		for(int j=i;j<=n;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
