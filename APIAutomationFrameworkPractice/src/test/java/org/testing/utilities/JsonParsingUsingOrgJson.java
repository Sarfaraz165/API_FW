package org.testing.utilities;

import java.util.HashSet;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson 
{

	//FirstLogic to extract all the ids
	/*public static void extractJson(String response, String fetchParameter)
	{
		JSONArray jsonArray=new JSONArray(response);
		int L=jsonArray.length();
		for(int i=0;i<L;i++)
		{
			JSONObject ob=jsonArray.getJSONObject(i);// need to discuss this line
			System.out.println(ob.get(fetchParameter));
		}*/
		
		
		
		//Second Logic using Hashset to extract all ids
		
			public static HashSet<String>extractJson(String response, String fetchParameter)
			
			{
				HashSet<String> hs=new HashSet<String>();
				JSONArray jsonArray=new JSONArray(response);
				int L=jsonArray.length();
				for(int i=0;i<L;i++)
			
		
				
				{
					JSONObject ob=jsonArray.getJSONObject(i);// need to discuss this line
					hs.add(ob.get(fetchParameter).toString());
					
				}
					return hs;
		
}
}
