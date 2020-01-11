public class Solution {

	int testcaseNum;
	//Constructor
	public Solution(int input)
	{
		testcaseNum = input;
	}
	
	public Solution()
	{
		
	}

	public String PrimeOrNotPrime(int num)
	{
		int count = 0;
		if(num==1 || num==0)
    	{
           return "Not prime";
    	}
    	
		//apply sqrt method to help with optimization
    	else
    	{
    		for(int i = 2; i<=Math.sqrt(num); i++)
            {
                if(num%i==0 )
                {
                    count++;
                }
                     
            }
       	 
           	 if(count > 0)
             {
                  return "Not prime";
             }
             else
             {
                 return "Prime";
             }
    	}
			
		      
     }
}

