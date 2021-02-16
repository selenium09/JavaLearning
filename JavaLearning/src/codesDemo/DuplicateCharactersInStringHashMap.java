package codesDemo;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInStringHashMap {
	
	
	static void duplicateCharCount(String inputString)
	{
		//learn java programming
		
		//creating a hashmap containing char as key and its occurance as value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		//convert string to char array
		char[] strArray = inputString.toCharArray();
		
		//checking each char of char array
		for(char c:strArray)
		{
			if(charCountMap.containsKey(c))
			{
				//if char is present in charCountMap, incrementing its count by 1
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				//if char is not present in charCountMap,
				//putting this char to charCountMap with 1 as its value
				charCountMap.put(c, 1);
			}
			
		}	
		
		//getting a set containing all keys of charCountMap
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate characters in : "+inputString);
		
		//iterating through set in charsInString
		for(char ch:charsInString)
		{
			
			if(charCountMap.get(ch)>1)
			{
				//if any char has a count more than 1, printing its count
				System.out.println(ch+" : "+charCountMap.get(ch));				
				
			}
			
		}
		
		
	}
	public static void main(String[] args)
	{
		duplicateCharCount("learn java programming");
	}

}
