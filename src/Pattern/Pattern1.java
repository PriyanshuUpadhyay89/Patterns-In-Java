package Pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("* ");
		}
		System.out.println("==================2====================");
		for (int i = 1; i <= n; i++) {
			System.out.print("* ");

		}
		System.out.println("==================3===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=================4=================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("==================5================");
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("=================6================");
		int a = 0;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= a; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			a++;
		}
		System.out.println("=================7===============");
		int b = n - 1;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= b; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			b--;
		}
		System.out.println("================8===============");
		int c = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
			c++;
		}
		System.out.println("================9================");
		int d = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= d; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
			d--;
		}
		System.out.println("================10================");

		int e = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= e; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i <= n / 2) {
				e--;
			} else {
				e++;
			}
		}
		System.out.println("===============11================");
		int f = 1, ff = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= ff; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= f; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= n / 2) {
				ff--;
				f = f + 2;
			} else {
				ff++;
				f = f - 2;
			}
		}
		System.out.println("==================12===============");
		int g = n - 1, gg = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= g; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= gg; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if (i <= n / 2) {
				g--;
				gg++;
			} else {
				g++;
				gg--;
			}
		}
		System.out.println("================13=================");
		int hh = n - 1, h = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= hh; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= h; j++) {
				System.out.print("*");
			}
			System.out.println();
			h = h + 2;
			hh--;
		}
		System.out.println("===============14===================");
		int k = 0, kk = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= kk; j++) {
				System.out.print("*");
			}
			System.out.println();
			k++;
			kk = kk - 2;
		}
		System.out.println("===============15===================");
		int l = 0, ll = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= l; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ll; j++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= n / 2) {
				l++;
				ll--;
			} else {
				l--;
				ll++;
			}
		}
		System.out.println("===============16===================");
		int m = 0, mm = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= mm; j++) {
				System.out.print("*");
			}
			System.out.println();
			m++;
		}
		System.out.println("===============17===================");
		int o = n - 1, oo = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= o; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= oo; j++) {
				System.out.print("*");
			}
			System.out.println();
			o--;
		}
		System.out.println("===============18===================");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}System.out.println("==============19===================");
		int p=n-1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=p;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+"");
				if(j<i) {
					System.out.print("*");
				}
			}System.out.println();
			p--;
		}System.out.println("============20================");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if (i==n||i==1||j==1||j==n||i==j||i+j==n+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}System.out.println("==============21===============");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j||i==n||j==1) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}System.out.println();
		}System.out.println("==============22===============");
		int q=1; int qq=n-1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= qq; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= q; j++) {
				System.out.print((char)(64+j)+"");
			}
			System.out.println();
			q = q + 2;
			qq--;
	}System.out.println("=================23================");
	int r=1;
	int rr=n-1;
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= qq; j++) {
			System.out.print(" ");
		}
		for (int j = 1; j <= r; j++) {
			System.out.print((char)(64+j)+"");
			if(i<j) {
				r++;
			}else {
				r--;
			}
		}
		System.out.println();
		r = r + 2;
	
}}}