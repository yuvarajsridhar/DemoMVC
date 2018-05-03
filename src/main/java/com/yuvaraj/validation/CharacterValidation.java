package com.yuvaraj.validation;

import java.util.regex.Pattern;

public class CharacterValidation
{
public boolean validateCharacter(String text) {
	if(Pattern.matches("[a-zA-Z]+",text)) 
	{ 
	return true; 
	} 
	else 
	{ 
	return false; 
	} 
}

}
