import java.util.*;
public class Coprime{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			
			float res=n;\\initialize with n
			// Consider all prime factors of n and for every prime 
			// factor i, multiply result with (1 - 1/p) 
			for(int i=2;i*i<=n;i++){
				
				// Check if p is a prime factor.
				if (n%i==0){
					// If yes, then update n and result 
					while (n%i==0)
						n/=i;
					res*=(1.0-(1.0/(float)i));
				}
			}
			// If n has a prime factor greater than sqrt(n) 
			// (There can be at-most one such prime factor) 
			if (n>1)
				res*=(1.0-(1.0/(float)n));
			System.out.println((int)res);
		}
	}
	//Naive Approach
	// public static void main(String[] args){
		// Scanner sc=new Scanner(System.in);
		// int t=sc.nextInt();
		// while(t-->0){
			// int n=sc.nextInt();
			// int cnt=0;
			// for (int i=1 ; i<n; i++){
			//	System.out.println("--"+gcd(i,n));
				// if (gcd(i,n)==1)
					// cnt++;
			// }
			// System.out.println(cnt);
		// }
	// }
	// static int gcd(int a,int b){
		// if (b==0)
			// return a;
		// return gcd(b,a%b);
	// }
}