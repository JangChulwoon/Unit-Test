package org.game.common;

public class Vaild {
	public static void checkVaild(String input) throws IllegalArgumentException{
		vaild(input);
	}
	
	private static void vaild(String value) {
		if (value == null) {
			throw new IllegalArgumentException();
		}
		for (char input : value.toCharArray()) {
			if (input < '0' || input > '9') {
				throw new IllegalArgumentException();
			}
		}
		if (value.charAt(0) == value.charAt(1) || value.charAt(0) == value.charAt(2)
				|| value.charAt(1) == value.charAt(2)) {
			throw new IllegalArgumentException();
		}
	}
}
