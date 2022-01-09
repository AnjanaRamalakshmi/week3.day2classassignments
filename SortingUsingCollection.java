package week3.day2classroomasignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args)
	{
		String[] input = {"HCL","Wipro","Aspire System","CTS"};
		int length = input.length;
		System.out.println("Length ="+length);
		List<String> list =  new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire System");
		list.add("CTS");
				
		Collections.sort(list);
		System.out.println("sorted list= " +list);
		Collections.reverse(list);
		System.out.println("Reversed list =" +list);
		
		
		
	}

}
