package gcdnumbers;

public class Reverse {

	public static void main(String[] args) {
		int n=123;
		int rem=0;
		int rev=0;
		int sum=0;
		System.out.println(" before swapping "+n);  
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			sum+=rem;
			n=n/10;
		}
		System.out.println(" after swapping "+rev);
		System.out.println(" after calculating sum "+sum);
	}
}
