package org.game.unitTest;

import org.game.baseball.Game;
import org.junit.Test;

import junit.framework.Assert;

public class BaseballTest {

	@Test
	public void shouldNullCheck() {
		Game game = new Game();
		try {
			game.vaild(null);
			Assert.fail();
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
		}
	}
	
	
}
