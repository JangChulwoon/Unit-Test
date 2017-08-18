package org.game.baseball;

import org.junit.internal.Throwables;

public class Game {
	public void vaild(String value) {
		if(value == null) {
			throw new IllegalArgumentException();
		}
		
	}
}
