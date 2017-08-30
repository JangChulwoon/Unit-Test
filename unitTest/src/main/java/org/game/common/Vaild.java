package org.game.common;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Vaild {
	public static void checkVaild(String input) throws IllegalArgumentException {
		vaild(input);
	}

	public static boolean comfirmUniqueness(int[] numbers) {
		int size  = numbers.length;
		for (int i = 0; i < size; ++i) {
			for (int j = i + 1; j < size; ++j) {
				if (numbers[i] == numbers[j]) {
					return false;
				}
			}
		}
		return true;
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
