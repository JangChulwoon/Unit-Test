package org.game.unitTest;

import org.game.baseball.Game;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BaseballTest {
	Game game;

	@Before
	public void setUp() {
		game = new Game();
	}

	@Test
	public void shouldNullCheck() {
		checkVaild(null);
	}

	@Test
	public void shouldCheckNumber() {
		checkVaild("1a2");
	}
	
	@Test
	public void shouldCheckNotSame() {
		checkVaild("112");
	}

	private void checkVaild(String input) {
		try {
			game.vaild(input);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}

}
