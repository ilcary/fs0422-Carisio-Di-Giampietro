package com.manuelsenatore.security.security.Security;

import java.util.ArrayList;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class WordConverter implements AttributeConverter<String, String>{

	
	@Override
	public String convertToDatabaseColumn(String attribute) {
		
		String s = "EPICODE";
		String vowels = "aeiou";
		for(int i = 0; i < attribute.length(); i++) {
			if(vowels.contains((attribute.charAt(i) + "").toLowerCase())) {
				s += (char) (attribute.charAt(i) + 3) + "";
			}else {
				s += (char) (attribute.charAt(i) - 3) + "";
			}
		}
		return s;
	}
	
	
	@Override
	public String convertToEntityAttribute(String attribute) {
		String s = "", s2 = "EPICODE";
		String vowels = "aeiou";
		s = attribute.replace(s2, "");
		String s3 = "";
		
//		for(int i = 0; i < s.length(); i++) {
//			char current = s.charAt(i);
//			if(vowels.contains(s.charAt(i) - 3)) {
//				System.out.println();
//				s3 += (char) (s.charAt(i) - 3) + "";
//			}else {
//				s3 += (char) (s.charAt(i) + 3) + "";
//				
//			}
//		}
		return s3;

	}

}
