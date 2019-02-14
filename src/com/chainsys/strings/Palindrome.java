package com.chainsys.strings;

public class Palindrome{
	public static void main(String[] args) {
		String input1  = "chain";
		StringBuffer stringBuffer = new StringBuffer(input1);
		String reversedstring = stringBuffer.toString();
		if (input1.equalsIgnoreCase(reversedstring)){
			System.out.println(input1 + " is palindrome ");
		}else{
				System.out.println(input1 + " is not palindrome ");
		}
		char input2 = 'a';
		if (input1.indexOf(input2)== -1){
			System.out.println(input2 + " is not present in "+ input1);
		}else{
			System.out.println(input2 + " is present in " + input1);
		}
		
	}
	
	
	
}
