package Assignment_Test;

import java.util.ArrayList;
import java.util.List;

public class Array_Test {
	boolean flag = false;
	
	public void TestArray(int A [], int B[])
	{
		
		 List<Integer> list = new ArrayList<Integer>();
		if(A.length==0)
		{
			System.out.println(list);
			
		}
		else if(B.length == 0)
		{
			
			for(int i = 0; i<A.length; i++)
			{
				list.add(A[i]);
				
			}
			System.out.print(list);
			
		}
		else
		{
			for(int i = 0; i<A.length; i++)
			{
				flag = false;
				for(int j= 0; j<B.length; j++)
				{
					if(A[i]==B[j])
					{
						flag = true;
					}
					
				}
				if(!flag)
				{
					list.add(A[i]);
				}
			}
			System.out.println(list);
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Array_Test ar = new Array_Test();
		
		int array[] = {1,3,5,7};
		int array1[] = {2,3,4,5};
		ar.TestArray(array,array1);
	}

}
