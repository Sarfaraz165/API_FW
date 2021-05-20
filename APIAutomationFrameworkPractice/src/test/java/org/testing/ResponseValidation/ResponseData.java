package org.testing.ResponseValidation;

import java.util.HashSet;

public class ResponseData 
{
	public static void Response(HashSet<String> allids, String ExpectedId)
	{
		//Logic1
		
		if(allids.contains(ExpectedId))
			
		{
			System.out.println("Able to find the Expected id");
		}
		
		else
		{
			System.out.println("not Able to find the Expected id");
		}
		
		
		//Logic 2:
		/*int x=0;
		for (String s: allids)
		{
			if (s.equals(ExpectedId))
			{
				System.out.println("Able to find the Expected id");
				x=1;
				break;
			}
			}
		if (x==0)
		{
			{
				System.out.println("not Able to find the Expected id");
			}
		}*/
		
}

}
