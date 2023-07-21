package Day044_Return_Values;

import java.util.ArrayList;
import java.util.List;

public class TC02_Sum_Return_SingleValue_ListObject {
	
	
	static int a=10,b=20;
	
	static List<Integer> l1=new ArrayList<Integer>();  //Collection Object

	
	public static void main(String[] args) {
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		
		System.out.println(l1);
		
		int d=sumofListValues(l1);
		
		System.out.println("Sum of l1 object is "+d);
	
	}


	public static int sumofListValues(List<Integer> l2) {
		
		int sum=0;
		
		int count=l2.size();
		
		for(int i=0;i<count;i++)  //0<4,1<4,2<4,3<4,4<4(failed)
		{
			System.out.println("l1 obejct is "+l1.get(i));
			
			sum=sum+l2.get(i);  //sum=100
		}
		
		// TODO Auto-generated method stub
		return sum;
	}
	
	
	
	

}
