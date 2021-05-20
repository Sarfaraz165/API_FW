package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC2_PostRequest_RandomID;
import org.testing.testScripts.TC3_GetRequestForSingle;
import org.testing.testScripts.TC4_GetRequestForAll;
import org.testing.testScripts.TC5_GetRequestforAll_Ids;
import org.testing.testScripts.TC6_PutRequest;
import org.testing.testScripts.TC7_DeleteRequest;

public class Runner 
{
	public static void main(String[] args) throws IOException 
	
	{
		TC2_PostRequest_RandomID ob2 = new TC2_PostRequest_RandomID();
		ob2.Testcase2();

		TC3_GetRequestForSingle ob3 = new TC3_GetRequestForSingle();
		ob3.TestCase3();

		
		 TC4_GetRequestForAll ob4=new TC4_GetRequestForAll(); 
		 ob4.TestCase4();
		 
		 TC5_GetRequestforAll_Ids ob5=new TC5_GetRequestforAll_Ids(); 
		 ob5.testcase5();
		 
		  
		TC6_PutRequest ob6=new TC6_PutRequest(); 
		ob6.testcase6();
		  
		//TC7_DeleteRequest ob7=new TC7_DeleteRequest();  Not executed..
		//ob7.testCase7();
		 

	}
}
