package com.junit.junitejemplo;

public class Charfun {
  //delete the char if in the first two positions are A
	//ej: AACD==CD    ACD==CD    CDAR==CDAR
	public String Delete2A(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String first2char = str.substring(0, 2);
		String string2Char = str.substring(2);

		return first2char.replaceAll("A", "") 
				+ string2Char;
	}
	//the first two positions of the string are equal with the last two position
	//ABCD == false   ABAB == true   
	public boolean FirstTwoLastTwo(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2char = str.substring(0, 2);

		String last2char = str.substring(str.length() - 2);

		return first2char.equals(last2char);
	}

}
