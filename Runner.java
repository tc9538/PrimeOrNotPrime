import java.io.*;
import java.util.*;

public class Runner {

	public static void main(String[] args)
	{
		
		//Get number of inputs and each element
		Scanner sc = new Scanner(System.in);
        int testcaseNum = sc.nextInt();
        
        Solution solution = new Solution(testcaseNum);
        
        //Put each input into the array
        int[] array = new int[testcaseNum];
        for(int i =0; i<testcaseNum; i++)
        {
        	int num = sc.nextInt();
        	array[i] = num;
        	System.out.println(solution.PrimeOrNotPrime(num));  
        }
	}
        
}
