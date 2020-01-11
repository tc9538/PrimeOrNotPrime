import java.util.*;

public class Solution {

	int testcaseNum;
	int[] inputArray = new int[testcaseNum];
	String[] outputArray = new String[testcaseNum];
	//Constructor
	public Solution(int input)
	{
		testcaseNum = input;
	}
	
	public Solution()
	{
		
	}
	
	public void PrimeOrNotPrime(int[] inputArray)
	{
			String s="";
			
			for(int j = 0; j<inputArray.length; j++)
			{
				int count = 0;
				for(int i = 1; i<=inputArray[j]; i++)
		        {
		             if(inputArray[j]%i==0 && inputArray[j]!=0)
		             {
		                 count++;
		             }
		             
		        }

		        if(inputArray[j]!=0 && inputArray[j]!=1 && (count<=2 || count == 1) )
		        {
		             System.out.println( "Prime");
		        }
		        else
		        {
		        	 System.out.println("Not prime");
		        }
			}
			
		      
     }
}

