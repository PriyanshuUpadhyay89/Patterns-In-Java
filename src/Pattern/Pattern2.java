package Pattern;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enter the number");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 System.out.print(j);
    	 }System.out.println();
     }System.out.println("==========2==========");
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 System.out.print(i);
    	 }System.out.println();
     }System.out.println("==========3==========");
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 System.out.print(j%2);
    	 }System.out.println();
     }System.out.println("==========4==========");
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 System.out.print(i%2);
    	 }System.out.println();
     }System.out.println("==========5==========");
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		 if(i==j||i+j==n+1) {
    			 System.out.print("1");
    		 }else {
    			 System.out.print("0");
    		 }
    	 }System.out.println();
     }System.out.println("=========6===========");
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=n;j++) {
    		if(j==n ||i+j==n+1) {
    			System.out.print("1");
    		}else {
    			System.out.print("0");
    		}
    	 }System.out.println();
     }System.out.println("===========7=========");
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=i;j++) {
    		System.out.print(j);
    	 }System.out.println();
     }System.out.println("===========8=========");
     for(int i=n;i>=1;i--) {
    	 for(int j=n;j>=i;j--) {
    		 System.out.print(j);
    	 }System.out.println();
     }System.out.println("============9========");
     for(int i=1;i<=n;i++) {
    	 for(int j=i;j>=1;j--) {
    		 System.out.print(j);
    	 }System.out.println();
     }System.out.println("============10=======");
     for(int i=n;i>=1;i--) {
    	 for(int j=i;j<=n;j++) {
    		 System.out.print(j);
    	 }System.out.println();
     }System.out.println("===========11========");
     for(int i=1;i<=n;i++) {
    	 for(int j=i;j>=1;j--) {
    		 System.out.print(i);
    	 }System.out.println();
     }
	}
}
