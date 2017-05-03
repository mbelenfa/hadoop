package com.junit.junitejemplo;

public class Charfun {
  //si en las dos primeras posiciones hay A se borra
	//ej: AACD==CD    ACD==CD    CDAR==CDAR
	public String funcion1(String str) {
		if (str.length() <= 2)
			return str.replaceAll("A", "");

		String primero2char = str.substring(0, 2);
		String stringmenos2Char = str.substring(2);

		return primero2char.replaceAll("A", "") 
				+ stringmenos2Char;
	}
	//si las dos primeras posiciones son iguales a las dos ultimas posiciones retorna true
	//ABCD == false   ABAB == true   
	public boolean funcion2(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String primero2char = str.substring(0, 2);

		String ultimo2char = str.substring(str.length() - 2);

		return primero2char.equals(ultimo2char);
	}

}
