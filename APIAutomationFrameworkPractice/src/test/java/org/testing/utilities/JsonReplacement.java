package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonReplacement 
{
	public static String replaceVariable(String bodyData,String VariableName,String VariableValue)
	{
		bodyData=bodyData.replaceAll(Pattern.quote("{{"+VariableName+"}}"), VariableValue);
		return bodyData;
	}

	
}
