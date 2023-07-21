package Day044_Return_Values;

public class TC01_Sum {

	public static void main(String[] args) {
		
		int d=0,e=0;
		
	    d=sum(10,20);
		System.out.println("Sum of two numbers is :"+d);
		
		e=mul(10,20);
		System.out.println("Multiplicaion of two numbers is :"+e);

	}
	
	
	public static int mul(int i, int j) {
		
		int x=i*j;
		
		return x;
	}


	public static int sum(int a, int b)
	{
		int c=a+b;
		
		return c;
	}
	

}
