package Day044_Return_Values;

public class Return_Value {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		int c;
		
		Return_Value r1=new Return_Value();
		c=r1.sum(a, b);
		System.out.println("The sum of a and b is"+c);
		
		int d=r1.multiplication(a,b);
	}
    public int sum(int a,int b)
    {
    	int c=a+b;
         
         
         return c;
    }
    
    public int multiplication(int f,int j)
    {
    	int d=f*j;
    	return d;
    }
}
