package week3.day2classroomasignment2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.bouncycastle.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args)
	{
		String s1 = "PayPal India";
		
		// convert into char array
		char[] charArray = s1.toCharArray();
		// calculate the length
		int length = s1.length();
		System.out.println("Length of string = "+length);
		//remove duplicate
		int index = 0;
		// traverse the array
		for (int i =0;i<length;i++)
		{
			int j;
			for(j=0;j<i;j++)
			{
				if(charArray[i]==charArray[j])
				{
					break;
					
				}
			}
			if(j == i)
			{
				charArray[index++] = charArray[i];
				
			}
			
		}
		System.out.println(String.valueOf(Arrays.copyOf(charArray, index)));
		
		
		

	}

}
