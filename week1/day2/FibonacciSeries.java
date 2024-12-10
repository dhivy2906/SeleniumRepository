package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, b=1, n=8;
		
		System.out.print(+a+" "+b);
	
		for(int i=3;i<=n;i++)
		{
			int next = a+b;
			System.out.print(" "+ next);
			a=b;
			b=next;
		}
	}

}
