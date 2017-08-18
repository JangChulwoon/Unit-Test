package org.game.ramdom;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Random {

	public static int[] notSameRandom(int size) {
		boolean[] sameCheck = new boolean[10];
		java.util.Random random = new java.util.Random();
		int randomCount = 0;
		int[] randomArray = new int[size];
		for (int i = 0; i < 4; ++i) {
			randomCount = random.nextInt(9) + 1;
			if (sameCheck[randomCount] == false) {
				sameCheck[randomCount] = true;
				randomArray[i] = randomCount;
			} else {
				--i;
				continue;
			}
		}
		return randomArray;
	}
}
