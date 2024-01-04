package gcdnumbers;

public class GCD {
	public static void main(String[] args) {
		int n1=82, n2=62;
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;++i) {
			if(n1%i==0&&n2%i==0) 
				gcd=i;//gcd calculation n1=82: 2*41
			          // n2=62:2*31
			}
			System.out.println(" gcd of "+ n1 +" and "+ n2 +" is "+ gcd);
		}
	}


