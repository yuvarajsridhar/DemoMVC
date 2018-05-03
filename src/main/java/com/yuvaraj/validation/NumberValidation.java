package com.yuvaraj.validation;

import java.util.regex.Pattern;

public class NumberValidation 
{
	public boolean validatenumber(String num)
	{
		if(Pattern.matches("[0-9]+",num)) 
		{ 
		return true; 
		} 
		else 
		{ 
		return false; 
}
		
	}
}