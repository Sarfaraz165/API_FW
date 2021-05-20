package org.testing.utilities;

import java.util.Random;

public class RandomClass 
{

	public static int RandomId()
	{
		Random r=new Random();
		Integer idValue=r.nextInt();
		return idValue;
	}
}
